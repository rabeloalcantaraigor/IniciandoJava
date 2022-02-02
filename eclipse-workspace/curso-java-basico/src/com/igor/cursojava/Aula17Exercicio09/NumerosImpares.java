package com.igor.cursojava.Aula17Exercicio09;

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva um número:  ");
		int Numero = scan.nextInt();
		
		for(int i=1;i<=Numero;i++) {
			if(i%2 == 1) {
				System.out.println("Numeros Impares: " + i);
			}
		}

	}

}
