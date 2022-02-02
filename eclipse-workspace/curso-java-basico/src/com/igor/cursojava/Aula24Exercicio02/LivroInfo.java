package com.igor.cursojava.Aula24Exercicio02;

public class LivroInfo {

	public static void main(String[] args) {
		Livro LivroDados = new Livro();
		
		LivroDados.Autor = "Igor";
		LivroDados.Titulo = "Jesus é o Senhor!";
		LivroDados.Genero = "Teologia";
		LivroDados.AnoLancamento = 2022;
		LivroDados.Paginas = 600;
		
		System.out.println(LivroDados.Autor);
		System.out.println(LivroDados.Titulo);
		System.out.println(LivroDados.Genero);
		System.out.println(LivroDados.AnoLancamento);
		System.out.println(LivroDados.Paginas);
	}

}
