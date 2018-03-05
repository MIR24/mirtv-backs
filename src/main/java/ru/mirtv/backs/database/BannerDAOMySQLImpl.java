package ru.mirtv.backs.database;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.mirtv.backs.model.Banner;
import ru.mirtv.backs.persistence.BannerDAO;

/**
 *
 * @author babikov_pv
 */
public class BannerDAOMySQLImpl implements BannerDAO {

    public BannerDAOMySQLImpl() {
        super();
    }

    @Override
    public List<Banner> getBanners() {
        List banners;
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        banners = session.createQuery("from Banner").list();
        tx.commit();
        return banners;
    }

    @Override
    public Banner getBannerById(int bannerId) {
        Banner banner;
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        banner = session.get(Banner.class, bannerId);
        tx.commit();
        return banner;
    }

    @Override
    public Banner addBanner(Banner banner) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        int newBannerId = (Integer) session.save(banner);
        tx.commit();
        banner.setId(newBannerId);
        return banner;
    }

    @Override
    public Banner updateBanner(Banner banner) {
        Banner updatedBanner;
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        updatedBanner = (Banner) session.merge(banner);
        tx.commit();
        return updatedBanner;
    }

    @Override
    public void removeBanner(Banner banner) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        session.delete(banner);
        tx.commit();
    }

}
