package com.igor.cursojava.exercicio_6;

import java.util.Scanner;

public class RadioCirculo {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		Scanner scan = new Scanner(System.in);
		
		double Raio = scan.nextDouble();
		double pi=3.141592654;
		double Area=pi*Raio*Raio;
		System.out.println("Area = " + Area);

	}

}
