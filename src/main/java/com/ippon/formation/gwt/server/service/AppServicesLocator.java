package com.ippon.formation.gwt.server.service;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.google.web.bindery.requestfactory.shared.ServiceLocator;

public class AppServicesLocator implements ServiceLocator {

    @Override
    public Object getInstance(Class<?> clazz) {
        return lookupBean(clazz);
    }

    public static <T> T lookupBean(Class<T> clazz) {
        T bean;
        System.out.println(clazz.getSimpleName());
        try {
            bean = InitialContext.doLookup("java:module/" + clazz.getSimpleName());
        }
        catch (NamingException e) {
            bean = null;
        }
        return bean;
    }

}
