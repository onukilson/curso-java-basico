package com.ilson.cursojava.aula13.exercicio;

import java.util.Scanner;

public class tarefa03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o seu Primeiro numero a ser somado");
		int numeroInteiro1 = scan.nextInt();
		
		System.out.println("Informe o seu Segundo numero a ser somado");
		int numeroInteiro2 = scan.nextInt();
		
		
		System.out.println("A soma dos n�meros �:  " + (numeroInteiro1 + numeroInteiro2));
		
		//ou
		//int somaInteiro = numeroInteiro1 + numeroInteiro2;
		//System.out.println("A soma dos n�meros �: " + somaInteiro);
		
			
		scan.close();
		
	}

}
