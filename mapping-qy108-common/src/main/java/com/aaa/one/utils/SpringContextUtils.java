package com.aaa.one.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Company AAA软件教育
 * @Title mapping-qy108
 * @Author hhy
 * @Version 0.1.0
 * @Date Create in 2020/5/13 10:39
 * @Description
 */
public class SpringContextUtils implements ApplicationContextAware {

    private static ApplicationContext APPLICATIONCONTEXT = null;
    private static final ReadWriteLock READ_WRITE_LOCK = new ReentrantReadWriteLock();

    private SpringContextUtils() {
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    public static ApplicationContext getApplicationContext() {
        Lock lock = READ_WRITE_LOCK.readLock();
        lock.lock();
        try {
            if(null != APPLICATIONCONTEXT) {
                return APPLICATIONCONTEXT;
            } else {
                return null;
            }
        } finally {
            lock.unlock();
        }
    }
}
