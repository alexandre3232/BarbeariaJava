package Model;

import java.util.Date;
import Model.Pessoa;

public class Cliente extends Pessoa{
	
	private String endereco;
	private String cep;
	
	public Cliente(int id, String nome, char sexo, String dataDeNascimento, String telefone, String email, int rg,
			String endereco, String cep) {
		super(id, nome, sexo, dataDeNascimento, telefone, email, rg);
		this.endereco = endereco;
		this.cep = cep;
	}

	public Cliente(int id, String nome, String endereco, String cep) {
		super(id, nome);
		this.endereco = endereco;
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
	
	
	

}
