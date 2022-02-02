package com.igor.cursojava.exercicio_3;

import java.util.Scanner;

public class SomaNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Numero1 = scan.nextInt();
		int Numero2 = scan.nextInt();
		int resultado=Numero1+Numero2;
		System.out.println("A soma dos números é: " + resultado);

	}

}
