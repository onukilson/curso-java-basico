package com.ilson.cursojava.aula15.exercicio;

import java.util.Scanner;

public class tarefa05 {

	public static void main(String[] args) {
		// Faça um programa para a leitura de duas notas parciais de um aluno.
		//O programa deve calcular a média alcançada por aluno e apresentar:
			//o A mensagem "Aprovado", se a média alcançada for maior ou
			//igual a sete; média >=7
			//o A mensagem "Reprovado", se a média for menor do que sete; média < 7
			//o A mensagem "Aprovado com Distinção", se a média for igual a
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
			System.out.println(mediaNota + " Aprovado com Distinção");
		}else{
			System.out.println(mediaNota + " Aprovado");
		}
		
		scan.close();
	}

}
