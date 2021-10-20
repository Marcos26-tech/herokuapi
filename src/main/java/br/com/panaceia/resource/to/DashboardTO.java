package br.com.panaceia.resource.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DashboardTO {
	
	private int id;
	private String data;
	private int mediaEscala;
	private int sentimentoPositivo;
	private int sentimentoNegativo;

	public DashboardTO() {
	}

	public DashboardTO(int id, String data, int mediaEscala, int sentimentoPositivo, int sentimentoNegativo) {
		super();
		this.id = id;
		this.data = data;
		this.mediaEscala = mediaEscala;
		this.sentimentoPositivo = sentimentoPositivo;
		this.sentimentoNegativo = sentimentoNegativo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getMediaEscala() {
		return mediaEscala;
	}

	public void setMediaEscala(int mediaEscala) {
		this.mediaEscala = mediaEscala;
	}

	public int getSentimentoPositivo() {
		return sentimentoPositivo;
	}

	public void setSentimentoPositivo(int sentimentoPositivo) {
		this.sentimentoPositivo = sentimentoPositivo;
	}

	public int getSentimentoNegativo() {
		return sentimentoNegativo;
	}

	public void setSentimentoNegativo(int sentimentoNegativo) {
		this.sentimentoNegativo = sentimentoNegativo;
	}

	
	

}
