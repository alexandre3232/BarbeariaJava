package Controller;

import java.awt.TextComponent;
import java.awt.TextField;

import Model.Usuario;
import Model.DAO.UsuarioDAO;
import View.Login;
import View.PaginaPrincipal;
import Helpers.LoginHelpers;

public class LoginController {
	
	private final Login view;
	private LoginHelpers helpers;
	

	public LoginController(Login view) {
		this.view = view;
		this.helpers = new LoginHelpers(view);
	}

	public void fizTarefa() {
		System.out.println("procurei algo no banco de dados.");
		
		this.view.exibeMensagem("Executei o fizTarefa.");
	}
	
	public void entraNoSistema() {
		// pega um usuario na view.
		Usuario usuario = helpers.obterModelo();
		//pesquisa usuario no banco.
		UsuarioDAO usuarioDao = new UsuarioDAO();
		Usuario usuarioAutenticado = usuarioDao.selectPorNomeESenha(usuario);
	
		if(usuarioAutenticado != null) {
			PaginaPrincipal principal = new PaginaPrincipal();
			principal.setVisible(true);
			this.view.dispose();
			
		}else {
			view.exibeMensagem("Usuario ou Senha Invalidos.");
		}
		
		//verificar se usuario tem o mesmo usuario e senha informado, se verdadeiro busca no banco e loga.
		//se falso exibe mensagem de usuario ou senha invalidos.
	}

}
