package com.igor.cursojava.Aula17Exercicio04;

public class TaxaCrescimento {

	public static void main(String[] args) {
		int PopulacaoPaisA = 80000;
		int PopulacaoPaisB = 200000;
		
		int i=0;
		while(PopulacaoPaisA < PopulacaoPaisB) {
			
			PopulacaoPaisA+=PopulacaoPaisA*3/100;
			PopulacaoPaisB+=PopulacaoPaisB*1.5/100;;
			i++;
		}
		System.out.println("Quntidade de ano: " + i);
		System.out.println("Populacao A: " + PopulacaoPaisA );
		System.out.println("Populacao B: " + PopulacaoPaisB );
	}

}
