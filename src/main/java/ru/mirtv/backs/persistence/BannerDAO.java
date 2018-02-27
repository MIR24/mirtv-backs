/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mirtv.backs.persistence;

import java.util.List;
import ru.mirtv.backs.model.Banner;

/**
 *
 * @author babikov_pv
 */
public interface BannerDAO {
    List<Banner> getBanners();
    Banner getBannerById(int bannerId);
    Banner addBanner(Banner banner);
    Banner updateBanner(Banner banner);
    void removeBanner(Banner banner);
}
