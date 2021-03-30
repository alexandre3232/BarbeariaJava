package Controller;

import View.PaginaAgenda;
import View.PaginaPrincipal;

public class MenuPrincipalController {
	
	private final PaginaPrincipal view;

	public MenuPrincipalController(PaginaPrincipal view) {
		super();
		this.view = view;
	}

	public void navegaParaAgenda() {
		PaginaAgenda agenda = new PaginaAgenda();
		agenda.setVisible(true);
	}
}
