package com.ilson.cursojava.aula13.exercicio;

import java.util.Scanner;

public class tarefa05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a medida em metros para ser convertida em cent�metros:");
		float metros = scan.nextFloat();
		float conversao = metros * 100;
		System.out.println("A medida convertida em cent�metro �: " + conversao + "cm");
				
		scan.close();

	}

}
