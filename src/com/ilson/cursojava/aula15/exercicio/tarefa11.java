package com.ilson.cursojava.aula15.exercicio;

import java.util.Scanner;

public class tarefa11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu valor salarial:");
		double salario = scan.nextDouble();
		
		double percentual = 0;
		
		if (salario <= 280){
			percentual = 0.2;
		}else if (salario > 280 && salario <=700){
			percentual = 0.15;
		}else if (salario > 700 && salario <= 1500){
			percentual = 0.10;
		}else if (salario > 1500){
			percentual = 0.05;
		}
		
		double aumento = salario * percentual;
		double valorAjustado = aumento + salario;
		
		System.out.println("Salário antes do Reajuste: " + salario);
		System.out.println("O percentual do aumento aolicado: " + (percentual*100)+"%" );
		System.out.println("Valor do Aumento: " + aumento);
		System.out.println("Valor Novo Salário: " + valorAjustado);
	
		
	scan.close();
	

	}

}
