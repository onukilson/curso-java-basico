package com.ilson.cursojava.aula13.exercicio;

import java.util.Scanner;

public class tarefa02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número inteiro");
		int numeroInteiro = scan.nextInt();
		
		System.out.println("O número informado foi " + numeroInteiro);
			
		scan.close();
		
		

	}

}
