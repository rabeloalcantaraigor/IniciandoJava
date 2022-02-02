package com.igor.cursojava.Aula17Exercicio03;

import java.util.Scanner;

public class Validacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			System.out.println("Validar a seguintes informações: ");
			
			System.out.println("Digite seu Nome: ");
			String Nome = scan.next();
			
			System.out.println("Digite sua idade: ");
			int Idade = scan.nextInt();
			
			System.out.println("Digite seu salario: ");
			double Salario = scan.nextDouble();
			
			System.out.println("Digite o seu sexo: ");
			String Sexo = scan.next();
			
			System.out.println("Digite seu estado civil ");
			String EstadoCivil = scan.next();
			
			if(Nome.length() > 3 && (Idade >= 0 && Idade <= 150) && Salario > 0 && (Sexo.equals("f") || Sexo.equals("m")) 
					&& (EstadoCivil.equals("s") || EstadoCivil.equals("c") || EstadoCivil.equals("v") || EstadoCivil.equals("d"))) {
				
				System.out.println("DADOS VALIDADOS. \n");
			}
			
			/*System.out.println(Nome.length() > 3);
			System.out.println(Idade >= 0 && Idade <= 150);
			System.out.println(Salario > 0);
			System.out.println(Sexo.equals("f") || Sexo.equals("m"));
			System.out.println(EstadoCivil.equals("s") || EstadoCivil.equals("c") || EstadoCivil.equals("v") || EstadoCivil.equals("d"));*/
		}
	}
}
