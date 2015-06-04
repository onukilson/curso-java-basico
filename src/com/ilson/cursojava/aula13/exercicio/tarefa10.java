package com.ilson.cursojava.aula13.exercicio;

import java.util.Scanner;

public class tarefa10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius: ");
		double celsius = scan.nextDouble();
		double conversao = (((9 * celsius)/5) + 32);
		System.out.println("A temperatura em Farenheit é de: " + conversao + "F");
				
		scan.close();

	}

}
