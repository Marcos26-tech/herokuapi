package br.com.panaceia.resource.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.panaceia.resource.to.ComunidadeTO;

public class ComunidadeDAO {
	public static List<ComunidadeTO> comunidade;

	public ComunidadeDAO() {
		if (comunidade == null) {
			comunidade = new ArrayList<ComunidadeTO>();
			
			ComunidadeTO com = new ComunidadeTO();
			com.setId(1);
			com.setNome("Vida mais saudável");
			com.setDescricao("Comunidade feita para quem se cuida");
			comunidade.add(com);
			
			com = new ComunidadeTO();
			com.setId(2);
			com.setNome("Tech Women");
			com.setDescricao("Comunidade feita para quem curte tecnologia");
			comunidade.add(com);
			
			com = new ComunidadeTO();
			com.setId(3);
			com.setNome("Família em 1 Lugar");
			com.setDescricao("Aqui é só família");
			comunidade.add(com);
			
			com = new ComunidadeTO();
			com.setId(4);
			com.setNome("Gaming Girls");
			com.setDescricao("Comunidade feita para minas que jogam!");
			comunidade.add(com);
			
			com = new ComunidadeTO();
			com.setId(5);
			com.setNome("Clube da Luta");
			com.setDescricao("A primeira regra do Clube da Lut...");
			comunidade.add(com);
		}
	}
	
	public List<ComunidadeTO> select() {
		return comunidade;
	}

	public ComunidadeTO select(int id) {
		for (int i = 0; i < comunidade.size(); i++) {
			if (comunidade.get(i).getId() == id) {
				return comunidade.get(i);
			}
		}
		return null;
	}
	
	public boolean insert(ComunidadeTO cto) {
		cto.setId(comunidade.size() + 1);
		return comunidade.add(cto);
	}
	
	public void update(ComunidadeTO cto) {
		ComunidadeTO c = select(cto.getId());
		c.setNome(cto.getNome());
		c.setDescricao(cto.getNome());
		comunidade.set((c.getId() - 1), c);
	}
	
	public void delete(int id) {
		comunidade.remove(select(id));
		
	}

}
