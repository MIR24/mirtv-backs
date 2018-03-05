package ru.mirtv.backs.service;

import java.util.List;

import ru.mirtv.backs.model.Banner;
import ru.mirtv.backs.persistence.BannerDAO;

public class BannerService {

    private final BannerDAO bannerManager;
    
    public BannerService(BannerDAO bannersManager) {
        this.bannerManager = bannersManager;
    }

    public List<Banner> getBanners() {
        return bannerManager.getBanners();
    }

    public Banner getBannerById(int bannerId) {
        return bannerManager.getBannerById(bannerId);
    }

    public Banner addBanner(Banner newBanner) {
        return bannerManager.addBanner(newBanner);
    }

    public Banner updateBanner(Banner banner) {
        if (banner.getId() <= 0) {
            return null;
        }
        return bannerManager.updateBanner(banner);
    }

    public void removeBanner(Banner banner) {
        bannerManager.removeBanner(banner);
    }

}
