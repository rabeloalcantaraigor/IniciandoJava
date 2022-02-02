package com.igor.cursojava.exercicio_7;

import java.util.Scanner;

public class DobroQuadradoArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double lado = scan.nextDouble();
		double Area=lado*lado;
		double dobro_Area=Area*2;
		System.out.println("Area = " + Area + " Dobro da Area: " + dobro_Area);

	}

}
