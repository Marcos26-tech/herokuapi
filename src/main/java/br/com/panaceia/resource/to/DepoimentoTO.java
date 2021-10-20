package br.com.panaceia.resource.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DepoimentoTO {
	
	private int id;
	private int idComunidade;
	private String titulo;
	private String comentario;
	

	public DepoimentoTO() {
	}


	public DepoimentoTO(int idComunidade, int id, String titulo, String comentario) {
		super();
		this.id = id;
		this.idComunidade = idComunidade;
		this.titulo = titulo;
		this.comentario = comentario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdComunidade() {
		return idComunidade;
	}


	public void setIdComunidade(int idComunidade) {
		this.idComunidade = idComunidade;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	
	
	

}
