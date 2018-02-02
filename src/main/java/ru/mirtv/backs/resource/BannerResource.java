package ru.mirtv.backs.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ru.mirtv.backs.model.Banner;
import ru.mirtv.backs.service.BannerService;

@Path("/banners")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BannerResource {
	private BannerService bannerService = new BannerService();

	@GET
	public List<Banner> getBanners() {
		return bannerService.getBanners();
	}

	@GET
	@Path("/{bannerId}")
	public Banner getBannerById(@PathParam("bannerId") int bannerId) {
		return bannerService.getBannerById(bannerId);
	}

	@POST
	public Banner addBanner(Banner banner) {
		return bannerService.addBanner(banner);
	}

	@PUT
	@Path("/{bannerId}")
	public Banner updateBanner(Banner banner, @PathParam("bannerId") int bannerId) {
		banner.setId(bannerId);
		return bannerService.updateBanner(banner);
	}

	@DELETE
	@Path("/{bannerId}")
	public void removeBanner(@PathParam("bannerId") int bannerId) {
		bannerService.removeBanner(bannerId);
	}
}
