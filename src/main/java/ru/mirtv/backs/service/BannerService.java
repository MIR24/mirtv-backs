package ru.mirtv.backs.service;

import java.util.List;

import ru.mirtv.backs.model.Banner;
import ru.mirtv.backs.persistence.BannerDAO;

public class BannerService {

    private final BannerDAO bannersManager;
    
    public BannerService(BannerDAO bannersManager) {
        this.bannersManager = bannersManager;
        /*banners.put(1, new Banner(1, "Спрут", "http://mirtv.ru/sprut/", "http://mirtv.ru/images/banner_960_sprut.jpg", true));
        banners.put(2, new Banner(2, "Дела семейные", "http://mirtv.ru/broadcast/213/", "http://mirtv.ru/images/banner_960_dela_0712_1.jpg", true));*/
    }

    public List<Banner> getBanners() {
        return bannersManager.getBanners();
    }

    public Banner getBannerById(int bannerId) {
        return bannersManager.getBannerById(bannerId);
    }

    public Banner addBanner(Banner newBanner) {
        return bannersManager.addBanner(newBanner);
    }

    public Banner updateBanner(Banner banner) {
        if (banner.getId() <= 0) {
            return null;
        }
        return bannersManager.updateBanner(banner);
    }

    public void removeBanner(Banner banner) {
        bannersManager.removeBanner(banner);
    }

}
