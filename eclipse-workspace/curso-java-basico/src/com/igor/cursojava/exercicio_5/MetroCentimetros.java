package com.igor.cursojava.exercicio_5;

import java.util.Scanner;

public class MetroCentimetros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quantos metros que transformar para centímetro: ");
		double metros = scan.nextInt();
		double resultado=metros*100.00;
		
		System.out.println("" + metros + " metros" + " Equivale " + resultado + " centímetros");

	}

}
