package com.ilson.cursojava.aula15.exercicio;

import java.util.Scanner;

public class tarefa07 {

	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre o maior e o menor deles.

	Scanner scan = new Scanner(System.in);
	System.out.println("Insira o Primeiro número");
	double num1 = scan.nextDouble(); 
	System.out.println("Insira o Segundo número");
	double num2 = scan.nextDouble();	
	System.out.println("Insira o Terceiro número");
	double num3 = scan.nextDouble();
	
	if (num1 > num2 && num1>num3){
		System.out.println("O maior numero é: " + num1);
	}else if (num2 > num1 && num2 > num3){
		System.out.println("O maior numero é: " + num2);
	}else{
		System.out.println("O maior numero é: " + num3);
	}

	if (num1 <= num2 && num1<=num3){
		System.out.println("O menor numero é: " + num1);
	}else if (num2 <= num1 && num2 <= num3){
		System.out.println("O menor numero é: " + num2);
	}else{
		System.out.println("O menor numero é: " + num3);
	}

	scan.close();
	}

}
