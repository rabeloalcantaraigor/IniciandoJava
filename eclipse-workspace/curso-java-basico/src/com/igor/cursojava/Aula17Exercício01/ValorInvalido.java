package com.igor.cursojava.Aula17Exercício01;

import java.util.Scanner;

public class ValorInvalido {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			System.out.println("Escreva uma nota entre 0 e 10: ");
			int nota=scan.nextInt();
			if(nota >= 0 && nota <= 10) {
				System.out.println("Valor válido. ");
				break;
			}
			System.out.println("Valor inválido. ");
		}

	}

}
