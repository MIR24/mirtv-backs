package ru.mirtv.backs.database;

import java.util.List;
import org.hibernate.Transaction;

import ru.mirtv.backs.model.Background;
import ru.mirtv.backs.persistence.BackgroundDAO;

public class BackgroundDAOMySQLImpl extends MySQLGeneralDAO implements BackgroundDAO {

    public BackgroundDAOMySQLImpl() {
        super();
    }

    @Override
    public Background addBackground(Background background) {
        Transaction tx = session.beginTransaction();
        int newBackgroundId = (Integer) session.save(background);
        tx.commit();
        background.setId(newBackgroundId);
        return background;
    }

    @Override
    public List<Background> getBackgrounds() {
        return session.createQuery("from Background").list();
    }

    @Override
    public Background getBackgroundById(int id) {
        return session.get(Background.class, id);
    }

    @Override
    public Background updateBackground(Background background) {
        session.saveOrUpdate(background);
        return background;
    }

    @Override
    public void removeBackground(Background background) {
        session.delete(background);
    }

}
