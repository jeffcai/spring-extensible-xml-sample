package com.jeff.caijf.extensible.xml;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by jeff on 6/5/16.
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("dateformat", new SimpleDateFormatBeanDefinitionParser());
    }

}
