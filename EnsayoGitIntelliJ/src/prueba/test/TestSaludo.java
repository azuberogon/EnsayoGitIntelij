package prueba.test;

import prueba.modelo.Saludo;

public class TestSaludo {

	public static void main(String[] args) {
		Saludo saludo = new Saludo();
		System.out.println(saludo.saludar("Juan ",18));
		System.out.println(saludo.saludar("Ana ",15));
		System.out.println(saludo.saludar("antonio ",19));
		 
	}

}
