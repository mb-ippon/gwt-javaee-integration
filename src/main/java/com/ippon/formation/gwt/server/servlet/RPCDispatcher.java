package com.ippon.formation.gwt.server.servlet;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.server.rpc.RPC;
import com.google.gwt.user.server.rpc.RPCRequest;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class RPCDispatcher extends RemoteServiceServlet {

    /**
     * 
     */
    private static final long serialVersionUID = -2706586087288431456L;

    @Override
    public String processCall(String payload) throws SerializationException {
        // First, check for possible XSRF situation
        checkPermutationStrongName();

        try {
            String ejbName = extractEjbName(getThreadLocalRequest().getServletPath());
            Object ejb = lookupBean(ejbName);

            RPCRequest rpcRequest = RPC.decodeRequest(payload, ejb.getClass());
            onAfterRequestDeserialized(rpcRequest);
            return RPC.invokeAndEncodeResponse(ejb, rpcRequest.getMethod(), rpcRequest.getParameters(),
                    rpcRequest.getSerializationPolicy(), rpcRequest.getFlags());
        }
        catch (IncompatibleRemoteServiceException ex) {
            log("An IncompatibleRemoteServiceException was thrown while processing this call.", ex);
            return RPC.encodeResponseForFailure(null, ex);
        }
        catch (RpcTokenException tokenException) {
            log("An RpcTokenException was thrown while processing this call.", tokenException);
            return RPC.encodeResponseForFailure(null, tokenException);
        }
    }

    private String extractEjbName(String servletPath) {
        String ejbName = servletPath.replaceAll("/FormationGWT/", "").replaceAll(".rpc", "").concat("Impl");
        return ejbName;
    }

    public static Object lookupBean(String name) {
        Object bean;
        try {
            bean = InitialContext.doLookup("java:module/" + name);
        }
        catch (NamingException e) {
            bean = null;
        }
        return bean;
    }

}
