package br.com.panaceia.resource.bo;

import java.util.List;

import br.com.panaceia.resource.dao.UsuarioDAO;
import br.com.panaceia.resource.to.UsuarioTO;

public class UsuarioBO {
	
	private UsuarioDAO user = null;
	
	public List<UsuarioTO> listar() {
		user = new UsuarioDAO();
		return user.select();
	}

	public UsuarioTO listar(int id) {
		user = new UsuarioDAO();
		return user.select(id);
	}
	
	public boolean inserir(UsuarioTO uto) {
		user = new UsuarioDAO();
		return user.insert(uto);
	}
	
	public void atualizar(UsuarioTO uto) {
		user = new UsuarioDAO();
		user.update(uto);
	}
	
	public void deletar(int id) {
		user = new UsuarioDAO();
		user.delete(id);
	}

}
