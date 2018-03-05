package ru.mirtv.backs.database;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import ru.mirtv.backs.model.Banner;

/**
 *
 * @author babikov_pv
 */
public class BannerDAOMySQLImplTest {

    @Test
    public void testBannerCRUD() {
        System.out.println("Test list, insert, get, update and remove methods.");

        BannerDAOMySQLImpl instance = new BannerDAOMySQLImpl();

        List<Banner> banners = instance.getBanners();
        assertNotNull(banners);

        int initSize = banners.size();
        Banner newBanner = new Banner("test", "link", "image", false);
        Banner addedBanner = instance.addBanner(newBanner);
        banners = instance.getBanners();
        assertEquals(banners.size(), initSize + 1);
        assertEquals(addedBanner, instance.getBannerById(addedBanner.getId()));

        addedBanner.setImage("image_1");
        instance.updateBanner(addedBanner);
        assertEquals(instance.getBannerById(addedBanner.getId()).getImage(), "image_1");

        instance.removeBanner(addedBanner);

        banners = instance.getBanners();
        assertEquals(banners.size(), initSize);
        assertTrue(!banners.contains(addedBanner));
    }

}
