package com.git.kafka.producer;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class SpringManager {

    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    public static void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        SpringManager.applicationContext = applicationContext;
    }
}
