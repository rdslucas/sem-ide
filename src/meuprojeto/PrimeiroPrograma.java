package meuprojeto;

import meuprojeto.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato("john", "black", 2); // constructor
		System.out.println(gato.getNome());
		gato.setNome("Lucas");
		System.out.println(gato.getNome());
	}

}