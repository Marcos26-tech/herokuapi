package br.com.panaceia.resource.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InteresseTO {
	
	private int id;
	private int qtdUsuarios;
	private String nome;

	public InteresseTO() {
	}

	public InteresseTO(int id, int qtdUsuarios, String nome) {
		super();
		this.id = id;
		this.qtdUsuarios = qtdUsuarios;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQtdUsuarios() {
		return qtdUsuarios;
	}

	public void setQtdUsuarios(int qtdUsuarios) {
		this.qtdUsuarios = qtdUsuarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	

	

}
