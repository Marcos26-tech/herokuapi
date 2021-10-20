package br.com.panaceia.resource.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class QuestionarioTO {
	
	private int id;
	private int idUsuario;
	private int escala;
	

	public QuestionarioTO() {
	}


	public QuestionarioTO(int id, int idUsuario, int escala) {
		super();
		this.id = id;
		this.idUsuario = idUsuario;
		this.escala = escala;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public int getEscala() {
		return escala;
	}


	public void setEscala(int escala) {
		this.escala = escala;
	}
	
	

}
