package com.ilson.cursojava.aula15.exercicio;

import java.util.Scanner;

public class tarefa05 {

	public static void main(String[] args) {
		// Fa�a um programa para a leitura de duas notas parciais de um aluno.
		//O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
			//o A mensagem "Aprovado", se a m�dia alcan�ada for maior ou
			//igual a sete; m�dia >=7
			//o A mensagem "Reprovado", se a m�dia for menor do que sete; m�dia < 7
			//o A mensagem "Aprovado com Distin��o", se a m�dia for igual a
			//dez.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota:");
		double nota1 = scan.nextDouble();
		System.out.println("Insira a segunda nota:");
		double nota2 = scan.nextDouble();
		double mediaNota = (nota1 + nota2) /2;
		
		if (mediaNota < 7){
			System.out.println(mediaNota + " Reprovado");
		}else if (mediaNota == 10){
			System.out.println(mediaNota + " Aprovado com Distin��o");
		}else{
			System.out.println(mediaNota + " Aprovado");
		}
		
		scan.close();
	}

}
