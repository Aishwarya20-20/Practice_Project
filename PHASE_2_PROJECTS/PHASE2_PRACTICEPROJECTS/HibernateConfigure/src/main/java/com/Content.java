package com;

import org.apache.catalina.storeconfig.StandardServiceSF;

public class Content {

        private static final SessionFactory sessionFactory;

        static {
                try {
                        StandardServiceSF standardRegistry = new StandardServiceSF()
                                        .configure("hibernate.cfg.xml").build();
                        Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
                        sessionFactory = metaData.getSessionFactoryBuilder().build();
                } catch (Throwable th) {
                        throw new ExceptionInInitializerError(th);
                }
        }

        public static SessionFactory getSessionFactory() {
                return sessionFactory;
        }
