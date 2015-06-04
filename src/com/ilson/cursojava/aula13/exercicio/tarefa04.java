package com.ilson.cursojava.aula13.exercicio;

import java.util.Scanner;

public class tarefa04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Informe nota 01: ");
		float nota01 = scan.nextFloat();
		System.out.println("Informe nota 02: ");
		float nota02 = scan.nextFloat();
		System.out.println("Informe nota 03: ");
		float nota03 = scan.nextFloat();
		System.out.println("Informe nota 04: ");
		float nota04 = scan.nextFloat();
		float mediaFinal = (nota01 + nota02 + nota03 + nota04) / 4;
		System.out.println("Média final é de: " + mediaFinal);*/

		
		//ou
		System.out.println("Informe nota 01, 02, 03 e 4, separado por espaço ");
		float nota01 = scan.nextFloat();
		float nota02 = scan.nextFloat();
		float nota03 = scan.nextFloat();
		float nota04 = scan.nextFloat();
		float mediaFinal = (nota01+nota02+nota03+nota04) / 4;
		System.out.println("Média final = " + mediaFinal);
			
		scan.close();
	}

}
