package com.ilson.cursojava.aula15.exercicio;

import java.util.Scanner;

public class tarefa07 {

	public static void main(String[] args) {
		// Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.

	Scanner scan = new Scanner(System.in);
	System.out.println("Insira o Primeiro n�mero");
	double num1 = scan.nextDouble(); 
	System.out.println("Insira o Segundo n�mero");
	double num2 = scan.nextDouble();	
	System.out.println("Insira o Terceiro n�mero");
	double num3 = scan.nextDouble();
	
	if (num1 > num2 && num1>num3){
		System.out.println("O maior numero �: " + num1);
	}else if (num2 > num1 && num2 > num3){
		System.out.println("O maior numero �: " + num2);
	}else{
		System.out.println("O maior numero �: " + num3);
	}

	if (num1 <= num2 && num1<=num3){
		System.out.println("O menor numero �: " + num1);
	}else if (num2 <= num1 && num2 <= num3){
		System.out.println("O menor numero �: " + num2);
	}else{
		System.out.println("O menor numero �: " + num3);
	}

	scan.close();
	}

}
