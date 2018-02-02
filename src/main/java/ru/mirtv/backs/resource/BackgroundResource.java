package ru.mirtv.backs.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
	public List<Background>getBackgrounds() {
		return backgroundService.getBackgrounds();
	}
	
}
