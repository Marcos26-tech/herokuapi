package br.com.panaceia.resource.bo;

import java.util.List;

import br.com.panaceia.resource.dao.EventoDAO;
import br.com.panaceia.resource.to.EventoTO;

public class EventoBO {
	
	private EventoDAO ed = null;
	
	public List<EventoTO> listar() {
		ed = new EventoDAO();
		return ed.select();
	}

	public EventoTO listar(int id) {
		ed = new EventoDAO();
		return ed.select(id);
	}
	
	public boolean inserir(EventoTO eto) {
		ed = new EventoDAO();
		return ed.insert(eto);
	}
	
	public void atualizar(EventoTO eto) {
		ed = new EventoDAO();
		ed.update(eto);
	}
	
	public void deletar(int id) {
		ed = new EventoDAO();
		ed.delete(id);
	}

}
