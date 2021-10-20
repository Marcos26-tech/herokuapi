package br.com.panaceia.resource.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.panaceia.resource.to.InteresseTO;

public class InteresseDAO {
	
	public static List<InteresseTO> interesse;

	public InteresseDAO() {
		
		
		if(interesse == null) {
			interesse = new ArrayList<InteresseTO>();
			
			InteresseTO inter = new InteresseTO();
			inter.setId(1);
			inter.setQtdUsuarios(10);
			inter.setNome("Vida saudável");
			interesse.add(inter);
			
			inter = new InteresseTO();
			inter.setId(2);
			inter.setQtdUsuarios(15);
			inter.setNome("Pets");
			interesse.add(inter);
			
			inter = new InteresseTO();
			inter.setId(3);
			inter.setQtdUsuarios(24);
			inter.setNome("Família");
			interesse.add(inter);
			
			inter = new InteresseTO();
			inter.setId(4);
			inter.setQtdUsuarios(18);
			inter.setNome("Dança");
			interesse.add(inter);
			
			inter = new InteresseTO();
			inter.setId(5);
			inter.setQtdUsuarios(31);
			inter.setNome("Tecnologia");
			interesse.add(inter);
						
			inter.setId(6);
			inter.setQtdUsuarios(12);
			inter.setNome("Ciência");
			interesse.add(inter);
			
			inter = new InteresseTO();
			inter.setId(7);
			inter.setQtdUsuarios(20);
			inter.setNome("Música");
			interesse.add(inter);
			
			inter = new InteresseTO();
			inter.setId(8);
			inter.setQtdUsuarios(8);
			inter.setNome("Café");
			interesse.add(inter);
			
			inter = new InteresseTO();
			inter.setId(9);
			inter.setQtdUsuarios(25);
			inter.setNome("Cerveja");
			interesse.add(inter);
			
			inter = new InteresseTO();
			inter.setId(10);
			inter.setQtdUsuarios(68);
			inter.setNome("Espiritualidade");
			interesse.add(inter);
				
		}
		
	}
	public List<InteresseTO> select() {
		return interesse;
	}
	
	public InteresseTO select(int id) {
		for (int i = 0; i < interesse.size(); i++) {
			if (interesse.get(i).getId() == id) {
				return interesse.get(i);
			}
		}
		return null;
	}
	
	public boolean insert(InteresseTO ito) {
		ito.setId(interesse.size() + 1);
		return interesse.add(ito);
	}
	
	public void update(InteresseTO ito) {
		InteresseTO i = select(ito.getId());
		i.setNome(ito.getNome());
		interesse.set((i.getId() - 1), i);
	}
	
	public void delete(int id) {
		interesse.remove(select(id));
		
	}
	
	

}
