package br.com.panaceia.resource.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EventoTO {
	
	private int id;
	private String titulo;
	private String local;
	private String link;

	public EventoTO() {
	}

	public EventoTO(int id, String titulo, String local, String link) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.local = local;
		this.link = link;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	

}
