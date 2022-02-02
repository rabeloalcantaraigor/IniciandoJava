package com.igor.cursojava.Aula17Exercicio02;

import java.util.Scanner;

public class NomeSenha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			System.out.println("Digite o nome de usuario: ");
			String Nome = scan.next();
			
			System.out.println("Digite a Senha:");
			String Senha = scan.next();
			
			if(Nome.equals(Senha)) {
				System.out.println("ERRO");
			}
			else if(Nome != Senha) {
				System.out.println("Válido.");
				break;
				
			}
		}
		

	}

}
