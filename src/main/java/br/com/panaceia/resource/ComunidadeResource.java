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

import br.com.panaceia.resource.bo.ComunidadeBO;
import br.com.panaceia.resource.to.ComunidadeTO;

@Path("/community")
public class ComunidadeResource {
	
	private ComunidadeBO cb = new ComunidadeBO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ComunidadeTO> buscar() {
		return cb.listar();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ComunidadeTO buscar(@PathParam("id") int id) {
		return cb.listar(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(ComunidadeTO cto, @Context UriInfo uriInfo) {
		cb.inserir(cto);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(cto.getId()));
		return Response.created(builder.build()).build();
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualiza(ComunidadeTO cto, @PathParam("id") int id) {
		cto.setId(id);
		cb.atualizar(cto);
		return Response.ok().build();	
	}
	
	@DELETE
	@Path("/{id}")
	public void excluir(@PathParam("id") int id) {
		cb.deletar(id);
	}

}
