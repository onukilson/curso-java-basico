package com.ilson.cursojava.aula13.exercicio;

import java.util.Scanner;

public class tarefa11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero inteiro: ");
		int inteiro1 = scan.nextInt();
		System.out.println("Insira o segundo numero inteiro: ");
		int inteiro2 = scan.nextInt();
		System.out.println("Insira o numero real: ");
		int numeroReal = scan.nextInt();
		
		// Calculo dos valores inseridos
		//a. o produto do dobro do primeiro com metade do segundo .
		//b. a soma do triplo do primeiro com o terceiro.
		//c. o terceiro elevado ao cubo.
		
		double resultadoA = (2*inteiro1 *(inteiro2/2));
		double resultadoB = ((3*inteiro1) + numeroReal);
		//double resultadoC = numeroReal * numeroReal * numeroReal;
		double resultadoC = Math.pow(numeroReal, 3);
		System.out.println("Resultado A = " + resultadoA);
		System.out.println("Resultado B = " + resultadoB);
		System.out.println("Resultado C = " + resultadoC);
				
		scan.close();

	}

}
