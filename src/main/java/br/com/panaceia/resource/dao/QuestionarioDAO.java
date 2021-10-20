package br.com.panaceia.resource.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.panaceia.resource.to.QuestionarioTO;

public class QuestionarioDAO {
	
	public static List<QuestionarioTO> questionario;

	public QuestionarioDAO() {
		
		if(questionario == null) {
			questionario = new ArrayList<QuestionarioTO>();
			
			QuestionarioTO quest = new QuestionarioTO();
			quest.setId(1);
			quest.setIdUsuario(1);
			quest.setEscala(10);
			questionario.add(quest);
			
			quest = new QuestionarioTO();
			quest.setId(2);
			quest.setIdUsuario(2);
			quest.setEscala(9);
			questionario.add(quest);
			
			quest = new QuestionarioTO();
			quest.setId(3);
			quest.setIdUsuario(3);
			quest.setEscala(11);
			questionario.add(quest);
			
			quest = new QuestionarioTO();
			quest.setId(4);
			quest.setIdUsuario(4);
			quest.setEscala(20);
			questionario.add(quest);
			
			quest = new QuestionarioTO();
			quest.setId(5);
			quest.setIdUsuario(5);
			quest.setEscala(3);
			questionario.add(quest);
		}
	}
	
	public List<QuestionarioTO> select() {
		return questionario;
	}

	public QuestionarioTO select(int id) {
		for (int i = 0; i < questionario.size(); i++) {
			if (questionario.get(i).getId() == id) {
				return questionario.get(i);
			}
		}
		return null;
	}
	
	public boolean insert(QuestionarioTO qto) {
		qto.setId(questionario.size() + 1);
		return questionario.add(qto);
	}
	
	public void update(QuestionarioTO qto) {
		QuestionarioTO q = select(qto.getId());
		q.setEscala(qto.getEscala());
		questionario.set((q.getId() - 1), q);
	}
	
	public void delete(int id) {
		questionario.remove(select(id));
		
	}

}
