package com.ilson.cursojava.aula13.exercicio;

import java.util.Scanner;

public class tarefa07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor do lado do quadrado: ");
		double lado = scan.nextDouble();
		double area = (lado * lado) * 2;
		System.out.println("o dobro da área do quadrado é: " + area);
				
		scan.close();

	}

}
