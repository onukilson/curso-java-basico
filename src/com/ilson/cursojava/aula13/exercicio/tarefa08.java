package com.ilson.cursojava.aula13.exercicio;

import java.util.Scanner;

public class tarefa08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o seu valor hora R$: ");
		double salario = scan.nextDouble();
		System.out.println("Informe o total de horas trabalhadas no m�s: ");
		double horaTrabalhada = scan.nextDouble();
		double totalMes = salario * horaTrabalhada;
		System.out.println("O Total de sal�rio no referido m�s � de: " + "R$" + totalMes);
				
		scan.close();

	}

}
