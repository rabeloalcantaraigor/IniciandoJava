package com.igor.cursojava.Aula24Exercicio01;

public class LampadaVenda {

	public static void main(String[] args) {
		
		Lampada led  = new Lampada();
		led.Tipo = "LED";
		led.Marca = "Electrolux";
		led.Tensao = 220;
		led.Potencia = 361.8;
		led.Corrente = 1.2;
		
		System.out.println(led.Tipo);
		System.out.println(led.Marca);
		System.out.println(led.Tensao);
		System.out.println(led.Potencia);
		System.out.println(led.Corrente);
	}
}
