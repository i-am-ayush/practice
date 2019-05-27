package com.listener;

import com.dao.DatabaseConnector;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OnStart implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        DatabaseConnector.getConnection();

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
