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

import ru.mirtv.backs.model.Background;
import ru.mirtv.backs.service.BackgroundService;

@Path("/backgrounds")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BackgroundResource {

	private BackgroundService backgroundService = new BackgroundService();

	@GET
	public List<Background> getBackgrounds() {
		return backgroundService.getBackgrounds();
	}

	@GET
	@Path("/{backgroundId}")
	public Background getBackgroundById(@PathParam("backgroundId") int backgroundId) {
		return backgroundService.getBackgroundById(backgroundId);
	}

	@POST
	public Background addBackground(Background background) {
		return backgroundService.addBackground(background);
	}

	@PUT
	@Path("/{backgroundId}")
	public Background updateBackground(Background background, @PathParam("backgroundId") int backgroundId) {
		background.setId(backgroundId);
		return backgroundService.updateBackground(background);
	}

	@DELETE
	@Path("/{backgroundId}")
	public void removeBackground(@PathParam("backgroundId") int backgroundId) {
		backgroundService.removeBackground(backgroundId);
	}

}
