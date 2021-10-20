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

import br.com.panaceia.resource.bo.DepoimentoBO;
import br.com.panaceia.resource.to.DepoimentoTO;


@Path("/brief")
public class DepoimentoResource {
	
	private DepoimentoBO db = new DepoimentoBO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<DepoimentoTO> buscar() {
		return db.listar();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public DepoimentoTO buscar(@PathParam("id") int id) {
		return db.listar(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(DepoimentoTO dto, @Context UriInfo uriInfo) {
		db.inserir(dto);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(dto.getId()));
		return Response.created(builder.build()).build();
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualiza(DepoimentoTO dto, @PathParam("id") int id) {
		dto.setId(id);
		db.atualizar(dto);
		return Response.ok().build();	
	}
	
	@DELETE
	@Path("/{id}")
	public void excluir(@PathParam("id") int id) {
		db.deletar(id);
	}

}
