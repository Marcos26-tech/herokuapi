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

import br.com.panaceia.resource.bo.InteresseBO;
import br.com.panaceia.resource.to.InteresseTO;

@Path("/interest")
public class InteresseResource {
	
	private InteresseBO ib = new InteresseBO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<InteresseTO> buscar() {
		return ib.listar();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public InteresseTO buscar(@PathParam("id") int id) {
		return ib.listar(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(InteresseTO ito, @Context UriInfo uriInfo) {
		ib.inserir(ito);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(ito.getId()));
		return Response.created(builder.build()).build();
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualiza(InteresseTO ito, @PathParam("id") int id) {
		ito.setId(id);
		ib.atualizar(ito);
		return Response.ok().build();	
	}
	
	@DELETE
	@Path("/{id}")
	public void excluir(@PathParam("id") int id) {
		ib.deletar(id);
	}

}
