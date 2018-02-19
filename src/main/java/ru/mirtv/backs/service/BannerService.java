package ru.mirtv.backs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.mirtv.backs.database.DatabaseManager;
import ru.mirtv.backs.model.Banner;

public class BannerService {

	private Map<Integer, Banner> banners = DatabaseManager.getBanners();

	public BannerService() {
		banners.put(1, new Banner(1, "Спрут", "http://mirtv.ru/sprut/", "http://mirtv.ru/images/banner_960_sprut.jpg", true));
		banners.put(2, new Banner(2, "Дела семейные", "http://mirtv.ru/broadcast/213/", "http://mirtv.ru/images/banner_960_dela_0712_1.jpg", true));
	}

	public List<Banner> getBanners() {
		return new ArrayList<>(banners.values());
	}

	public Banner getBannerById(int bannerId) {
		return banners.get(bannerId);
	}

	public Banner addBanner(Banner newBanner) {
		newBanner.setId(banners.size() + 1);
		banners.put(newBanner.getId(), newBanner);
		return newBanner;
	}

	public Banner updateBanner(Banner banner) {
		if (banner.getId() <= 0) {
			return null;
		}
		banners.put(banner.getId(), banner);
		return banner;
	}

	public void removeBanner(int bannerId) {
		banners.remove(bannerId);
	}

}
