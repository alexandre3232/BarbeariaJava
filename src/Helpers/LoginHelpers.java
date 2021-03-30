package Helpers;

import Model.Usuario;
import View.Login;

public class LoginHelpers {
	
	private final Login view;
	
	public LoginHelpers(Login view) {
		this.view = view;
	}

	public Usuario obterModelo() {
		String nome = view.getTextFieldUsuario().getText();
		String senha = view.getPasswordFieldSenha().getText();
		Usuario modelo = new Usuario(0, senha, senha, senha);
		return modelo;
	}
	public void setarModelo(Usuario modelo) {
		String nome = modelo.getNome();
		String senha = modelo.getSenha();
		
		view.getTextFieldUsuario().setText(nome);
		view.getPasswordFieldSenha().setText(senha);
	}
	
	public void limpatela() {
		view.getTextFieldUsuario().setText("");
		view.getPasswordFieldSenha().setText("");
	}
	
}
