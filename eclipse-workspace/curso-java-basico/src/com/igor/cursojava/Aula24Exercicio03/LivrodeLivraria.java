package com.igor.cursojava.Aula24Exercicio03;

public class LivrodeLivraria {

	public static void main(String[] args) {
		LivroBiblioteca Livro = new LivroBiblioteca();
		Livro.Preco = 20.5;
		Livro.Titulo = "Homens Fortes";
		Livro.Autor = "Igor";
		Livro.Paginas = 630;
		
		System.out.println(Livro.Preco);
		System.out.println(Livro.Titulo);
		System.out.println(Livro.Autor);
		System.out.println(Livro.Paginas);

	}

}
