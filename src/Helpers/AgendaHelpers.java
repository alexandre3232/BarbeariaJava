package Helpers;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Model.Agendamento;
import View.PaginaAgenda;

public class AgendaHelpers {
	
	private final PaginaAgenda view;

	public AgendaHelpers(PaginaAgenda view) {
		super();
		this.view = view;
	}
	
	public void preencherTabela(ArrayList<Agendamento> agendamentos) {
		DefaultTableModel tableModel = (DefaultTableModel) view.getTable_1().getModel();
		tableModel.setNumRows(0);
	
		//percorre a lista preenchendo o tablemodel
		for (Agendamento agendamento : agendamentos) {
			tableModel.addRow(new Object[] {
					agendamento.getId(),
					agendamento.getCliente().getNome(),
					agendamento.getServico().getDescricao(),
					agendamento.getValor(),
					agendamento.getDataFormatada(),
					agendamento.getHoraFormatada(),
					agendamento.getObservacao()	
			});
		}
		
	}
	
}

