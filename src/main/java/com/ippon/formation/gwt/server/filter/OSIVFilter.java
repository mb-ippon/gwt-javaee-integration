package com.ippon.formation.gwt.server.filter;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.transaction.UserTransaction;

public class OSIVFilter implements Filter {

    @Resource
    private UserTransaction utx;

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {
        try {
            utx.begin();
            chain.doFilter(request, response);
            utx.commit();
        }
        catch (Exception e) {
            // log
        }
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }

}
