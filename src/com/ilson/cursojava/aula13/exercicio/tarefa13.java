package com.ilson.cursojava.aula13.exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class tarefa13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat ("000.00");
		
		
		/*Faça um Programa que pergunte quanto você ganha por hora e o
		número de horas trabalhadas no mês. Calcule e mostre o total do seu
		salário no referido mês, sabendo-se que são descontados 11% para o
		Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
		programa que nos dê:
		. salário bruto.
		a. quanto pagou ao INSS.
		b. quanto pagou ao sindicato.
		c. o salário líquido.
		d. calcule os descontos e o salário líquido, conforme a tabela
		abaixo:
		+ Salário Bruto : R$ 
		- IR (11%) : R$ 
		- INSS (8%) : R$ 
		- Sindicato ( 5%) : R$ 
		= Salário Liquido : R$    */
		
		//imput dados
		System.out.println("Informe o seu Valor Hora: ");
		double valorHora = scan.nextDouble();
		System.out.println("Informe a sua quantidade de Horas Trabalhadas: ");
		double totalHora = scan.nextDouble();
		
		//cálculo
		double salarioBruto = valorHora * totalHora;
		double impostoRenda = salarioBruto * 0.11;
		double impostoINSS = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double salarioLiquido = salarioBruto - impostoINSS - impostoRenda - sindicato;
		
		//print
		System.out.println("+ Salário Bruto   = R$" + deci.format(salarioBruto));
		System.out.println("- IR (11%)        = R$" + deci.format(impostoRenda));
		System.out.println("- INSS (8%)       = R$" + deci.format(impostoINSS));
		System.out.println("- Sindicado (5%)  = R$" + deci.format(sindicato));
		System.out.println("= Salário Liquido = R$" + deci.format(salarioLiquido));
		
						
		scan.close();

	}

}
