package com;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class Concurrent implements HttpSessionListener {
    static int count=0;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        count++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
    count--;
    }
    public static int getCount(){
        return count;
    }
}
