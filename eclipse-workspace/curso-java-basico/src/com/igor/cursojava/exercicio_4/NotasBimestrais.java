package com.igor.cursojava.exercicio_4;

import java.util.Scanner;

public class NotasBimestrais {

	public static void main(String[] args) {
		float resultado=0;
		float contador=0;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			float numero=scan.nextFloat();
			resultado=resultado+numero;
			contador+=1;
			
		}
		float resultado_final=resultado/contador;
		System.out.println("Media = " + resultado_final);

	}

}
