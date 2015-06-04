package com.ilson.cursojava.aula15.exercicio;

import java.util.Scanner;

public class tarefa02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um valor: ");
		double valor = scan.nextDouble();
		
		if (valor < 0 ){
			System.out.println("Valor Informado é um valor NEGATIVO.");
		} else if (valor > 0){
			System.out.println("Valor Informado é um valor POSITIVO.");
		} else {
			System.out.println("Valor informado é igual a ZERO");
		}

		scan.close();
	}

}
