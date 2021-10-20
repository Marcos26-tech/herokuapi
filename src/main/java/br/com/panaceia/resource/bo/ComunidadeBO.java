package br.com.panaceia.resource.bo;

import java.util.List;

import br.com.panaceia.resource.dao.ComunidadeDAO;
import br.com.panaceia.resource.to.ComunidadeTO;

public class ComunidadeBO {
	
	private ComunidadeDAO cd;
	
	public List<ComunidadeTO> listar() {
		cd = new ComunidadeDAO();
		return cd.select();
	}

	public ComunidadeTO listar(int id) {
		cd = new ComunidadeDAO();
		return cd.select(id);
	}
	
	public boolean inserir(ComunidadeTO cto) {
		cd = new ComunidadeDAO();
		return cd.insert(cto);
	}
	
	public void atualizar(ComunidadeTO cto) {
		cd = new ComunidadeDAO();
		cd.update(cto);
	}
	
	public void deletar(int id) {
		cd = new ComunidadeDAO();
		cd.delete(id);
	}

}
