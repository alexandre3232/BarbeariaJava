package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;

public class Main {

	public static void main(String[] args) {
	
		Cliente c = new Cliente(0001, "alexandre", "3333333", "Quadra 305 conjunto 1 casa 2");
		System.out.println(c.getNome());
		
		Usuario u = new Usuario(001, "alex", "4444", "total");
		System.out.println(u.toString());
	}

}
