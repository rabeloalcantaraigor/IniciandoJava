package com.igor.cursojava.Aula17Exercicio07;

import java.util.Scanner;

public class LerCincoNumerosMostrarOMaior {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite 5 números:  ");
		
		System.out.println("Digite número 1:  ");
		double N1 = scan.nextDouble();
		
		System.out.println("Digite número 2:  ");
		double N2 = scan.nextDouble();
		
		System.out.println("Digite número 3:  ");
		double N3 = scan.nextDouble();
		
		System.out.println("Digite número 4:  ");
		double N4 = scan.nextDouble();
		
		System.out.println("Digite número 5:  ");
		double N5 = scan.nextDouble();
		
		if(N1>N2 && N1>N3 && N1>N4 && N1>N5) {
			System.out.println("O maior número é: " + N1);
		}
		if(N2>N1 && N2>N3 && N2>N4 && N2>N5) {
			System.out.println("O maior número é: " + N2);
		}
		if(N3>N2 && N3>N1 && N3>N4 && N3>N5) {
			System.out.println("O maior número é: " + N3);
		}
		if(N4>N3 && N4>N2 && N4>N1 && N4>N5) {
			System.out.println("O maior número é: " + N4);
		}
		if(N5>N4 && N5>N3 && N5>N2 && N5>N1) {
			System.out.println("O maior número é: " + N5);
		}
		

	}

}
