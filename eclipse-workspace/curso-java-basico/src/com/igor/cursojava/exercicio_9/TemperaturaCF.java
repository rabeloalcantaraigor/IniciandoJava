package com.igor.cursojava.exercicio_9;

import java.util.Scanner;

public class TemperaturaCF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quando a temperatura em graus Farenheit? ");
		double F = scan.nextDouble();
		
		double Celsius=(5*(F-32)/9);
		
		System.out.println("A temperatura em graus Celsius é: " + Celsius);

	}

}
