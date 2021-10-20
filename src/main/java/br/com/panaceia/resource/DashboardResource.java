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

import br.com.panaceia.resource.bo.DashboardBO;
import br.com.panaceia.resource.to.DashboardTO;


@Path("/dash")
public class DashboardResource {
	
private DashboardBO dab = new DashboardBO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<DashboardTO> buscar() {
		return dab.listar();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public DashboardTO buscar(@PathParam("id") int id) {
		return dab.listar(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(DashboardTO dash, @Context UriInfo uriInfo) {
		dab.inserir(dash);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(dash.getId()));
		return Response.created(builder.build()).build();
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualiza(DashboardTO dash, @PathParam("id") int id) {
		dash.setId(id);
		dab.atualizar(dash);
		return Response.ok().build();	
	}
	
	@DELETE
	@Path("/{id}")
	public void excluir(@PathParam("id") int id) {
		dab.deletar(id);
	}
	
	

}
