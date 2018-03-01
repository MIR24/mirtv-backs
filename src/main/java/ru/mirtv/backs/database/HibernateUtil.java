package ru.mirtv.backs.database;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.mirtv.backs.model.Background;
import ru.mirtv.backs.model.Banner;

public class HibernateUtil {

    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration()
                    .addAnnotatedClass(Background.class)
                    .addAnnotatedClass(Banner.class)
                    .configure().buildSessionFactory();
        } catch (HibernateException ex) {
            System.err.println("Initial SessionFactory creation failed: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
    
    public static Session getSession(){
        return SESSION_FACTORY.getCurrentSession();
    }

    public static void shutdown() {
        getSessionFactory().close();
    }

}
