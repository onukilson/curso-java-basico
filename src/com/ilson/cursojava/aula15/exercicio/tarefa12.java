package com.ilson.cursojava.aula15.exercicio;

import java.util.Scanner;

public class tarefa12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu valor salarial:");
		double salario = scan.nextDouble();
		
		double percentual1 = 0;
		
		if (salario <= 900){
			percentual1 = 0.0;
		}else if (salario > 900 && salario <=1500){
			percentual1 = 0.05;
		}else if (salario > 1500 && salario <= 2500){
			percentual1 = 0.10;
		}else if (salario > 2500){
			percentual1 = 0.20;
		}
		
		double imposto = salario * percentual1;
		double sindicato = salario * 0.03;
		double fundoGarantia = salario * 0.11;
		double salarioLiquido = (salario - imposto - sindicato + fundoGarantia);
		
		System.out.println("(+) Salário Bruto  : " + salario);
		System.out.println("(-) IR       (" + (percentual1*100)+"%): " + imposto);
		System.out.println("(-) Sindicato  (3%): " + sindicato);
		System.out.println("(+) FGTS      (11%): " + fundoGarantia);
		System.out.println("(=) Salário Líquido: " + salarioLiquido);
		
	

		
	scan.close();
	

	}

}
