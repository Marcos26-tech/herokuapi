package br.com.panaceia.resource.bo;

import java.util.List;

import br.com.panaceia.resource.dao.DepoimentoDAO;
import br.com.panaceia.resource.to.DepoimentoTO;

public class DepoimentoBO {
	
	private DepoimentoDAO dd = null;
	
	public List<DepoimentoTO> listar() {
		dd = new DepoimentoDAO();
		return dd.select();
	}

	public DepoimentoTO listar(int id) {
		dd = new DepoimentoDAO();
		return dd.select(id);
	}
	
	public boolean inserir(DepoimentoTO dto) {
		dd = new DepoimentoDAO();
		return dd.insert(dto);
	}
	
	public void atualizar(DepoimentoTO dto) {
		dd = new DepoimentoDAO();
		dd.update(dto);
	}
	
	public void deletar(int id) {
		dd = new DepoimentoDAO();
		dd.delete(id);
	}

}
