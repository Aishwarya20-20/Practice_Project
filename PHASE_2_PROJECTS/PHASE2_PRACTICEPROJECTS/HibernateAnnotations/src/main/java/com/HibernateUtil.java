package com;
public class HibernateUtil {
 private static final SessionFactory sessionFactory;
private static final com.SessionFactory session = null;
 static {
 try {
 StandardServiceRegistry standardRegistry = ((Object) new
StandardServiceRegistry().configure("hibernate.cfg.xml")).build();
 Metadata metaData = ((Object) new
Metadata(standardRegistry).getMetadataBuilder()).build();
 sessionFactory = ((Object) metaData.getSessionFactoryBuilder()).build();
 } catch (Throwable th) {
 throw new ExceptionInInitializerError(th);
 }
 }
 public static SessionFactory getSessionFactory() {
 return session;
 }
}