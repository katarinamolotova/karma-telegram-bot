package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

/**
 * Created by Ариорх on 27.05.2017.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = buildSessionFactor() ;

    private static SessionFactory buildSessionFactor() {
        try {
            return new Configuration().configure(new File("src/main/resources/hibernate.cfg.xml")).buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Init fail");
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }

}