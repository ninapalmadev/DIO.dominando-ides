package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args){
		Gato gato = new Gato();
		Livros livro = new Livros();
		
		System.out.println(gato);
		
		int a = 2;
		int v = 4;
		
		System.out.println("Hello World " + (a + v));
	}

}

class Livros {
	String nome;
}