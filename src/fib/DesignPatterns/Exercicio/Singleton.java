package fib.DesignPatterns.Exercicio;

public class Singleton {

	int contador = 0;
	public static Singleton objeto = null;

	private Singleton() {
		contador = 0;
	}

	public void RetornaNumero() {
		System.out.println("Número atualizado: " + Integer.toString(contador++));
	}

	public static Singleton ObtemObjeto() {
		if (objeto == null) {
			objeto = new Singleton();
		}
		return objeto;
	}

}
