package br.com.panaceia.resource.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.panaceia.resource.to.EventoTO;

public class EventoDAO {
	public static List<EventoTO> evento;

	public EventoDAO() {
		
		if (evento == null) {
			evento = new ArrayList<EventoTO>();
			
			EventoTO event = new EventoTO();
			event.setId(1);
			event.setTitulo("Festa Panaceia!");
			event.setLocal("Google Meet");
			event.setLink("https://google.meet/123");
			evento.add(event);
			
			event = new EventoTO();
			event.setId(2);
			event.setTitulo("Desabafos Panace IA");
			event.setLocal("Zoom");
			event.setLink("https://zoom.meet/123");
			evento.add(event);
			
			event = new EventoTO();
			event.setId(3);
			event.setTitulo("Confra Panaceia");
			event.setLocal("Google Meet");
			event.setLink("https://google.meet/456");
			evento.add(event);
			
			event = new EventoTO();
			event.setId(4);
			event.setTitulo("Traga seu Drink");
			event.setLocal("Skype");
			event.setLink("https://skype.meet/1");
			evento.add(event);
			
			event = new EventoTO();
			event.setId(5);
			event.setTitulo("Reunião de família");
			event.setLocal("Google Meet");
			event.setLink("https://google.meet/789");
			evento.add(event);
		}
	}
	
	public List<EventoTO> select() {
		return evento;
	}

	public EventoTO select(int id) {
		for (int i = 0; i < evento.size(); i++) {
			if (evento.get(i).getId() == id) {
				return evento.get(i);
			}
		}
		return null;
	}
	
	public boolean insert(EventoTO evt) {
		evt.setId(evento.size() + 1);
		return evento.add(evt);
	}
	
	public void update(EventoTO evt) {
		EventoTO ev = select(evt.getId());
		ev.setTitulo(evt.getTitulo());
		ev.setLocal(evt.getLocal());
		ev.setLink(evt.getLink());
		evento.set((ev.getId() - 1), ev);
	}
	
	public void delete(int id) {
		evento.remove(select(id));
		
	}

}
