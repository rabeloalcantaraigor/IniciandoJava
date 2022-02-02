package com.igor.cursojava.exercicio_12;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva a sua altura: ");
		double Altura = scan.nextDouble();
		
		double Peso = (72.7*Altura)-(double)58;
		
		System.out.println("Seu peso ideal é: " + Peso);

	}

}
