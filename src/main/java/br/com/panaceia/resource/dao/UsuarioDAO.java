package br.com.panaceia.resource.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.panaceia.resource.to.UsuarioTO;

public class UsuarioDAO {
	public static List<UsuarioTO> usuario;

	public UsuarioDAO() {
		// aqui vao os metodos do banco de dados! Nao esquecer
		if(usuario == null) {
			usuario = new ArrayList<UsuarioTO>();
			
			UsuarioTO user = new UsuarioTO();
			user.setId(1);
			user.setNome("Maria das Gracas");
			user.setEmail("maria_das_gracas@gmail.com");
			user.setSenha("deusefiel123");
			usuario.add(user);
			
			user = new UsuarioTO();
			user.setId(2);
			user.setNome("Ana Maria");
			user.setEmail("aninhask8@hotmail.com");
			user.setSenha("aninhadosk8");
			usuario.add(user);
			
			user = new UsuarioTO();
			user.setId(3);
			user.setNome("Beatriz Silva");
			user.setEmail("beasilva@gmail.com");
			user.setSenha("beasilva10101999");
			usuario.add(user);
			
			user = new UsuarioTO();
			user.setId(4);
			user.setNome("Roberta Sanchez");
			user.setEmail("sanchez-ro@outlook.com");
			user.setSenha("szro123456");
			usuario.add(user);
			
			user = new UsuarioTO();
			user.setId(5);
			user.setNome("Latrice Royale");
			user.setEmail("lalaroyale@yahoo.com");
			user.setSenha("lalaqueen123");
			usuario.add(user);
		}
		
	}
	
	public List<UsuarioTO> select() {
		return usuario;
	}

	public UsuarioTO select(int id) {
		for (int i = 0; i < usuario.size(); i++) {
			if (usuario.get(i).getId() == id) {
				return usuario.get(i);
			}
		}
		return null;
	}
	
	public boolean insert(UsuarioTO uto) {
		uto.setId(usuario.size() + 1);
		return usuario.add(uto);
	}
	
	public void update(UsuarioTO uto) {
		UsuarioTO u = select(uto.getId());
		u.setNome(uto.getNome());
		u.setEmail(uto.getEmail());
		u.setSenha(uto.getSenha());
		usuario.set((u.getId() - 1), u);
	}
	
	public void delete(int id) {
		usuario.remove(select(id));
		
	}

}
