package com.igor.cursojava.exercicio_11;

import java.util.Scanner;

public class MiniCalduladora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número? ");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe o segundo número? ");
		int numero2 = scan.nextInt();
		
		System.out.println("Informe o terceiro número? ");
		double numero3 = scan.nextDouble();
		
		
		
		double resultado1 = 2.0*(double)numero1*0.5*(double)numero2;
		
		double resultado2 = 3.0*numero1+numero3;
		
		double resultado3 = numero3*numero3*numero3;
 		
		System.out.println("Resultado 1: " + resultado1 + " Resultado 2: " + resultado2 + " Resultado 3: " + resultado3);

	}

}
