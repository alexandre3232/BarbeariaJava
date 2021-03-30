package Model;

import java.util.Date;
import Model.Pessoa;

public class Usuario extends Pessoa{
	
	protected String senha;
	protected String nivelDeAcesso;
	
	public Usuario(int id, String nome, String senha, String nivelDeAcesso) {
		super(id, nome);
		this.senha = senha;
		this.nivelDeAcesso = nivelDeAcesso;
	}

	public Usuario(int id, String nome, char sexo, String dataDeNascimento, String telefone, String email, int rg, String senha, String nivelDeAcesso) {
		super(id, nome, sexo, dataDeNascimento, telefone, email, rg);
		this.senha = senha;
		this.nivelDeAcesso = nivelDeAcesso;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNivelDeAcesso() {
		return nivelDeAcesso;
	}

	public void setNivelDeAcesso(String nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}

	@Override
	public String toString() {
		return "Usuario [senha=" + senha + ", nivelDeAcesso=" + nivelDeAcesso + "]";
	}
	
	
	
	
}
