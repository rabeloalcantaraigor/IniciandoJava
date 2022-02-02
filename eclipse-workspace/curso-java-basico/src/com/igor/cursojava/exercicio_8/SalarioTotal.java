package com.igor.cursojava.exercicio_8;

import java.util.Scanner;

public class SalarioTotal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double GanhoPorHora = scan.nextDouble();
		System.out.println("Quantas horas trabalhadas? ");
		double HorasTrabalhadas = scan.nextDouble();
		double SalarioMes=GanhoPorHora*HorasTrabalhadas;
		System.out.println("Salário do mês é: " + SalarioMes);

	}

}
