package ru.mirtv.backs.database;

import java.util.List;
import org.hibernate.Transaction;
import ru.mirtv.backs.model.Banner;
import ru.mirtv.backs.persistence.BannerDAO;

/**
 *
 * @author babikov_pv
 */
public class BannerDAOMySQLImpl extends MySQLGeneralDAO implements BannerDAO  {
    
    public BannerDAOMySQLImpl(){
        super();
    }

    @Override
    public List<Banner> getBanners() {
        return session.createQuery("from Banners").list();
    }

    @Override
    public Banner getBannerById(int bannerId) {
        return session.get(Banner.class, bannerId);
    }

    @Override
    public Banner addBanner(Banner banner) {
        Banner newBanner = (Banner) session.save(banner);
        return newBanner;
    }

    @Override
    public Banner updateBanner(Banner banner) {
        session.saveOrUpdate(banner);
        return banner;
    }

    @Override
    public void removeBanner(Banner banner) {
        session.delete(banner);
    }

}
