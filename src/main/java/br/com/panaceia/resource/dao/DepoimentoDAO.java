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
			depo.setTitulo("Ada Lovelace");
			depo.setComentario("Não sabia que isso poderia acontecer com mais alguém.");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(2);
			depo.setIdComunidade(1);
			depo.setTitulo("Frances Allen");
			depo.setComentario("Você é uma mulher inspiradora! adoro essa comunidade me faz muito bem.");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(3);
			depo.setIdComunidade(2);
			depo.setTitulo("Radia Perlman");
			depo.setComentario("É muito legal como a cultura das empresas está mudando <3.");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(4);
			depo.setIdComunidade(2);
			depo.setTitulo("Carol Shaw");
			depo.setComentario("Por mais iniciativas que mostrem cada vez o nosso valor.");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(5);
			depo.setIdComunidade(3);
			depo.setTitulo("Karen Sparck Jones");
			depo.setComentario("Eu amo minha familia, amo cuidar deles só preciso ser mais compreendida.");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(6);
			depo.setIdComunidade(3);
			depo.setTitulo("Grace Hopper");
			depo.setComentario("Sempre que preciso desabafar, ou pedir conselho aqui encontro um ambiente seguro para fazer isso.");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(7);
			depo.setIdComunidade(4);
			depo.setTitulo("Jean Sammet");
			depo.setComentario("Sempre que quero conversar com alguem encontro aqui esse ponto de apoio para falar das coisa que gosto de fazer mas que me deixam insegura.");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(8);
			depo.setIdComunidade(4);
			depo.setTitulo("Mary Kenneth");
			depo.setComentario("Todos os dias quando acordo, não tenho mais o que passou mas tenho muito tempo temos todo tempo do mundo.");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(9);
			depo.setIdComunidade(5);
			depo.setTitulo("Adele Goldstine");
			depo.setComentario("Antes de encontrar aqui esse refugio ficava triste por não ter com quem desabafar sobre o que estou pensando e a tempestade que invade minha mente.");
			depoimento.add(depo);
			
			depo = new DepoimentoTO();
			depo.setId(10);
			depo.setIdComunidade(5);
			depo.setTitulo("Fran Bilas");
			depo.setComentario("Sempre que posso entrar aqui criando meus depoimentos para contribuir com todas vocês");
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
