package ru.mirtv.backs.database;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import ru.mirtv.backs.model.Background;
import ru.mirtv.backs.persistence.BackgroundDAO;

public class BackgroundDAOMySQLImpl implements BackgroundDAO {

    public BackgroundDAOMySQLImpl() {
        super();
    }

    @Override
    public Background addBackground(Background background) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        int newBackgroundId = (Integer) session.save(background);
        tx.commit();
        background.setId(newBackgroundId);
        return background;
    }

    @Override
    public List<Background> getBackgrounds() {
        List backgrounds;
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        backgrounds = session.createQuery("from Background").list();
        tx.commit();
        return backgrounds;
    }

    @Override
    public Background getBackgroundById(int id) {
        Background background;
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        background = session.get(Background.class, id);
        tx.commit();
        return background;
    }

    @Override
    public Background updateBackground(Background background) {
        Background updatedBackground;
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        updatedBackground = (Background) session.merge(background);
        tx.commit();
        return updatedBackground;
    }

    @Override
    public void removeBackground(Background background) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        session.delete(background);
        tx.commit();
    }

}
