package br.com.panaceia.resource.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UsuarioTO {
	
	private int id;
	private String nome;
	private String email;
	private String senha;
	

	public UsuarioTO() {
	}


	public UsuarioTO(int id, String nome, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	
	

}
