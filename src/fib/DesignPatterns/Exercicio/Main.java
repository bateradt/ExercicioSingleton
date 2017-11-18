package fib.DesignPatterns.Exercicio;

public class Main {

	public static void main(String[] args) {
		Singleton s1;
		Singleton s2;
		Singleton s3;

		s1 = Singleton.ObtemObjeto();
		s2 = Singleton.ObtemObjeto();
		s3 = Singleton.ObtemObjeto();

		while (true) {
			s1.RetornaNumero();
			s2.RetornaNumero();
			s3.RetornaNumero();
		}

	}

}
