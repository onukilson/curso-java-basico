package com.ilson.cursojava.aula13.exercicio;

import java.util.Scanner;

public class tarefa09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em Farenheit: ");
		double farenheit = scan.nextDouble();
		double conversao = (5 * (farenheit - 32)/9);
		System.out.println("A temperatura em Celsius é de: " + conversao + "ºC");
				
		scan.close();

	}

}
