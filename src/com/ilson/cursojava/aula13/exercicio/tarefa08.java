package com.ilson.cursojava.aula13.exercicio;

import java.util.Scanner;

public class tarefa08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o seu valor hora R$: ");
		double salario = scan.nextDouble();
		System.out.println("Informe o total de horas trabalhadas no mês: ");
		double horaTrabalhada = scan.nextDouble();
		double totalMes = salario * horaTrabalhada;
		System.out.println("O Total de salário no referido mês é de: " + "R$" + totalMes);
				
		scan.close();

	}

}
