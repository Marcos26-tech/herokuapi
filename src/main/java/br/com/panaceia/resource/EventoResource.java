package br.com.panaceia.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.panaceia.resource.bo.EventoBO;
import br.com.panaceia.resource.to.EventoTO;

@Path("/event")
public class EventoResource {
	
	private EventoBO eb = new EventoBO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<EventoTO> buscar() {
		return eb.listar();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public EventoTO buscar(@PathParam("id") int id) {
		return eb.listar(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(EventoTO eto, @Context UriInfo uriInfo) {
		eb.inserir(eto);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(eto.getId()));
		return Response.created(builder.build()).build();
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualiza(EventoTO eto, @PathParam("id") int id) {
		eto.setId(id);
		eb.atualizar(eto);
		return Response.ok().build();	
	}
	
	@DELETE
	@Path("/{id}")
	public void excluir(@PathParam("id") int id) {
		eb.deletar(id);
	}

}
