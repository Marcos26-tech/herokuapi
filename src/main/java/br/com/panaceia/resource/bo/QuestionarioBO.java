package br.com.panaceia.resource.bo;

import java.util.List;

import br.com.panaceia.resource.dao.QuestionarioDAO;
import br.com.panaceia.resource.to.QuestionarioTO;


public class QuestionarioBO {
	
	private QuestionarioDAO qd = null;
	
	public List<QuestionarioTO> listar() {
		qd = new QuestionarioDAO();
		return qd.select();
	}

	public QuestionarioTO listar(int id) {
		qd = new QuestionarioDAO();
		return qd.select(id);
	}
	
	public boolean inserir(QuestionarioTO qto) {
		qd = new QuestionarioDAO();
		return qd.insert(qto);
	}
	
	public void atualizar(QuestionarioTO qto) {
		qd = new QuestionarioDAO();
		qd.update(qto);
	}
	
	public void deletar(int id) {
		qd = new QuestionarioDAO();
		qd.delete(id);
	}

}
