package com.igor.cursojava.Aula17Exercicio05;

import java.util.Scanner;

public class TaxaCrescimentoLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(;;) {
			
			
			System.out.println("Informe a População do país A e a taxa: ");
			int PopulacaoPaisA = scan.nextInt();
			double TaxaPaisA = scan.nextDouble();
		
			System.out.println("Informe a População do país B e a taxa: ");
			int PopulacaoPaisB = scan.nextInt();
			double TaxaPaisB = scan.nextDouble();
		
			//int PopulacaoPaisA = 80000;
			//int PopulacaoPaisB = 200000;
		
			int i=0;
			while(PopulacaoPaisA < PopulacaoPaisB) {
			
				//PopulacaoPaisA+=PopulacaoPaisA*3/100;
				//PopulacaoPaisB+=PopulacaoPaisB*1.5/100;;
				PopulacaoPaisA += PopulacaoPaisA*TaxaPaisA/100;
				PopulacaoPaisB += PopulacaoPaisB*TaxaPaisB/100;
				i++;
			}
			System.out.println("Quntidade de ano: " + i);
			System.out.println("Populacao A: " + PopulacaoPaisA );
			System.out.println("Populacao B: " + PopulacaoPaisB );
			
			break;
			}
	}

}
