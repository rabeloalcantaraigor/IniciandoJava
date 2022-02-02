package com.igor.cursojava.exercicio_10;

import java.util.Scanner;

public class CelsiusParaFarenheit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quando a temperatura em graus Celsius? ");
		double C = scan.nextDouble();
		
		double F=(9.0/5.0*C+32.0);
		
		System.out.println("A temperatura em graus Farenheit é: " + F);

	}

}
