package br.com.panaceia.resource.bo;

import java.util.List;

import br.com.panaceia.resource.dao.DashboardDAO;
import br.com.panaceia.resource.to.DashboardTO;

public class DashboardBO {
	
	private DashboardDAO dashd;
	
	public List<DashboardTO> listar() {
		dashd = new DashboardDAO();
		return dashd.select();
	}

	public DashboardTO listar(int id) {
		dashd = new DashboardDAO();
		return dashd.select(id);
	}
	
	public boolean inserir(DashboardTO dashto) {
		dashd = new DashboardDAO();
		return dashd.insert(dashto);
	}
	
	public void atualizar(DashboardTO dashto) {
		dashd= new DashboardDAO();
		dashd.update(dashto);
	}
	
	public void deletar(int id) {
		dashd = new DashboardDAO();
		dashd.delete(id);
	}

}