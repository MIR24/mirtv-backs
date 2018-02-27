package ru.mirtv.backs.database;

import org.hibernate.Session;

/**
 *
 * @author babikov_pv
 */
public class MySQLGeneralDAO {
    
    protected final Session session;

    public MySQLGeneralDAO() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
}
