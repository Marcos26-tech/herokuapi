package br.com.panaceia.resource.bo;

import java.util.List;

import br.com.panaceia.resource.dao.InteresseDAO;
import br.com.panaceia.resource.to.InteresseTO;


public class InteresseBO {
	
	private InteresseDAO interd = null;
	
	public List<InteresseTO> listar() {
		interd = new InteresseDAO();
		return interd.select();
	}

	public InteresseTO listar(int id) {
		interd = new InteresseDAO();
		return interd.select(id);
	}
	
	public boolean inserir(InteresseTO ito) {
		interd = new InteresseDAO();;
		return interd.insert(ito);
	}
	
	public void atualizar(InteresseTO ito) {
		interd = new InteresseDAO();
		interd.update(ito);
	}
	
	public void deletar(int id) {
		interd = new InteresseDAO();
		interd.delete(id);
	}

}
