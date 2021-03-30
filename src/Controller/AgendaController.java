package Controller;

import java.util.ArrayList;

import Helpers.AgendaHelpers;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import View.PaginaAgenda;

public class AgendaController {
	
	private final PaginaAgenda view;
	private final AgendaHelpers helper;

	public AgendaController(PaginaAgenda view) {
		super();
		this.view = view;
		this.helper = new AgendaHelpers(view);
	}
	
	public void atualizaTabela() {
		
		//busca uma lista com os agendamento dos banco.
		AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
		ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
		
		//exibir lista na view.
		helper.preencherTabela(agendamentos);
	}
}