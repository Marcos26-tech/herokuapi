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

import br.com.panaceia.resource.bo.QuestionarioBO;
import br.com.panaceia.resource.to.QuestionarioTO;

@Path("/survey")
public class QuestionarioResource {
	
	private QuestionarioBO qb = new QuestionarioBO();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<QuestionarioTO> buscar() {
		return qb.listar();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public QuestionarioTO buscar(@PathParam("id") int id) {
		return qb.listar(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(QuestionarioTO qto, @Context UriInfo uriInfo) {
		qb.inserir(qto);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(qto.getId()));
		return Response.created(builder.build()).build();
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualiza(QuestionarioTO qto, @PathParam("id") int id) {
		qto.setId(id);
		qb.atualizar(qto);
		return Response.ok().build();	
	}
	
	@DELETE
	@Path("/{id}")
	public void excluir(@PathParam("id") int id) {
		qb.deletar(id);
	}
	

}
