package br.com.panaceia.resource.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.panaceia.resource.to.DashboardTO;

public class DashboardDAO {
	public static List<DashboardTO> dashboard;

	public DashboardDAO() {
		
		if(dashboard == null) {
			dashboard = new ArrayList<DashboardTO>();
			
			DashboardTO dash = new DashboardTO();
			dash.setId(1);
			dash.setData("Janeiro");
			dash.setMediaEscala(15);
			dash.setSentimentoPositivo(90);
			dash.setSentimentoNegativo(10);
			dashboard.add(dash);
			
			dash = new DashboardTO();
			dash.setId(2);
			dash.setData("Fevereiro");
			dash.setMediaEscala(20);
			dash.setSentimentoPositivo(25);
			dash.setSentimentoNegativo(75);
			dashboard.add(dash);
			
			dash = new DashboardTO();
			dash.setId(3);
			dash.setData("Março");
			dash.setMediaEscala(18);
			dash.setSentimentoPositivo(82);
			dash.setSentimentoNegativo(18);
			dashboard.add(dash);
			
			dash = new DashboardTO();
			dash.setId(4);
			dash.setData("Abril");
			dash.setMediaEscala(12);
			dash.setSentimentoPositivo(69);
			dash.setSentimentoNegativo(31);
			dashboard.add(dash);
			
			dash = new DashboardTO();
			dash.setId(5);
			dash.setData("Maio");
			dash.setMediaEscala(8);
			dash.setSentimentoPositivo(62);
			dash.setSentimentoNegativo(38);
			dashboard.add(dash);
			
			dash = new DashboardTO();
			dash.setId(6);
			dash.setData("Junho");
			dash.setMediaEscala(10);
			dash.setSentimentoPositivo(77);
			dash.setSentimentoNegativo(23);
			dashboard.add(dash);
			
			dash = new DashboardTO();
			dash.setId(7);
			dash.setData("Julho");
			dash.setMediaEscala(12);
			dash.setSentimentoPositivo(84);
			dash.setSentimentoNegativo(16);
			dashboard.add(dash);
			
			dash = new DashboardTO();
			dash.setId(8);
			dash.setData("Agosto");
			dash.setMediaEscala(17);
			dash.setSentimentoPositivo(90);
			dash.setSentimentoNegativo(10);
			dashboard.add(dash);
			
			
		}
		
	}
	
	public List<DashboardTO> select() {
		return dashboard;
	}

	public DashboardTO select(int id) {
		for (int i = 0; i < dashboard.size(); i++) {
			if (dashboard.get(i).getId() == id) {
				return dashboard.get(i);
			}
		}
		return null;
	}
	
	public boolean insert(DashboardTO dashto) {
		dashto.setId(dashboard.size() + 1);
		return dashboard.add(dashto);
	}
	
	public void update(DashboardTO dashto) {
		DashboardTO da = select(dashto.getId());
		da.setData(dashto.getData());
		da.setMediaEscala(dashto.getMediaEscala());
		da.setSentimentoPositivo(dashto.getSentimentoPositivo());
		da.setSentimentoNegativo(dashto.getSentimentoNegativo());
		dashboard.set((da.getId() - 1), da);
	}
	
	public void delete(int id) {
		dashboard.remove(select(id));
		
	}

}
