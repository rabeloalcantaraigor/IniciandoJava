package com.igor.cursojava.Aula17Exercicio08;

import java.util.Scanner;

public class SomaMediaCincoNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite Cinco numeros: ");
		int Cont=0;
		double Resultado=0;
		for(int i=1;i<=5;i++) {
			double Numero = scan.nextDouble();
			Resultado=Resultado+Numero;
			Cont++;
		}
		System.out.println("A média dos números é igual a: " + Resultado/Cont);

	}

}
