package br.com.panaceia.resource.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.panaceia.resource.to.DepoimentoTO;

public class DepoimentoDAO {
	public static List<DepoimentoTO> depoimento;

	public DepoimentoDAO() {
		
		if (depoimento == null) {
			depoimento = new ArrayList<DepoimentoTO>();
			
			DepoimentoTO depo = new DepoimentoTO();
			depo.setId(1);
			depo.setIdComunidade(1);
			depo.setTitulo("Aconteceu comigo também");
			depo.setComentario("Não sabia que isso poderia acontecer com mais alguém");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(2);
			depo.setIdComunidade(1);
			depo.setTitulo("Que incrível!");
			depo.setComentario("Você é uma mulher inspiradora!");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(3);
			depo.setIdComunidade(2);
			depo.setTitulo("Fui promovida grávida!");
			depo.setComentario("É muito legal como a cultura das empresas está mudando <3");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(4);
			depo.setIdComunidade(2);
			depo.setTitulo("Chega de assédio");
			depo.setComentario("Por mais iniciativas contra esse tipo de abuso");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(5);
			depo.setIdComunidade(3);
			depo.setTitulo("Quero paz");
			depo.setComentario("Quero que me deixem em paz");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(6);
			depo.setIdComunidade(3);
			depo.setTitulo("Quero muita muita paz");
			depo.setComentario("Quero que me deixem em paz");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(7);
			depo.setIdComunidade(4);
			depo.setTitulo("Cheguei chegando abalando tudo");
			depo.setComentario("Quero que isso funcione pelo amor de deus");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(8);
			depo.setIdComunidade(4);
			depo.setTitulo("Digo o mesmo que o depoimento acima");
			depo.setComentario("Quero paz");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(9);
			depo.setIdComunidade(5);
			depo.setTitulo("Juro que estou dentro de outra comunidade!!!");
			depo.setComentario("Funciona, por favor...");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(10);
			depo.setIdComunidade(5);
			depo.setTitulo("Estou com fome");
			depo.setComentario("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			depoimento.add(depo);
			
		}
	}
	
	
	public List<DepoimentoTO> select() {
		return depoimento;
	}
	public DepoimentoTO select(int id) {
		for (int i = 0; i < depoimento.size(); i++) {
			if (depoimento.get(i).getId() == id) {
				return depoimento.get(i);
			}
		}
		return null;
	}
	
	public boolean insert(DepoimentoTO dto) {
		dto.setId(depoimento.size() + 1);
		return depoimento.add(dto);
	}
	
	public void update(DepoimentoTO dto) {
		DepoimentoTO d = select(dto.getId());
		d.setTitulo(dto.getTitulo());
		d.setComentario(dto.getComentario());
		depoimento.set((d.getId() - 1), d);
	}
	
	public void delete(int id) {
		depoimento.remove(select(id));
		
	}

}
