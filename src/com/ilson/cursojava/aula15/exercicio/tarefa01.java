package com.ilson.cursojava.aula15.exercicio;

import java.util.Scanner;

public class tarefa01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o Primeiro n�mero: ");
		double num1 = scan.nextDouble();
		System.out.println("Insira o Segundo n�mero: ");
		double num2 = scan.nextDouble();
		
		if (num1 >num2){
			System.out.println("o maior numero digitado foi: " + num1);
		} else if (num1 < num2){
			System.out.println("o maior numero digitado foi: " + num2);
		} else {
			System.out.println("Os n�meros informados s�o iguais");
		}
		
	scan.close();
	

	}

}
