package com.ilson.cursojava.aula13.exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class tarefa13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat ("000.00");
		
		
		/*Fa�a um Programa que pergunte quanto voc� ganha por hora e o
		n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
		sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o
		Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um
		programa que nos d�:
		. sal�rio bruto.
		a. quanto pagou ao INSS.
		b. quanto pagou ao sindicato.
		c. o sal�rio l�quido.
		d. calcule os descontos e o sal�rio l�quido, conforme a tabela
		abaixo:
		+ Sal�rio Bruto : R$ 
		- IR (11%) : R$ 
		- INSS (8%) : R$ 
		- Sindicato ( 5%) : R$ 
		= Sal�rio Liquido : R$    */
		
		//imput dados
		System.out.println("Informe o seu Valor Hora: ");
		double valorHora = scan.nextDouble();
		System.out.println("Informe a sua quantidade de Horas Trabalhadas: ");
		double totalHora = scan.nextDouble();
		
		//c�lculo
		double salarioBruto = valorHora * totalHora;
		double impostoRenda = salarioBruto * 0.11;
		double impostoINSS = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double salarioLiquido = salarioBruto - impostoINSS - impostoRenda - sindicato;
		
		//print
		System.out.println("+ Sal�rio Bruto   = R$" + deci.format(salarioBruto));
		System.out.println("- IR (11%)        = R$" + deci.format(impostoRenda));
		System.out.println("- INSS (8%)       = R$" + deci.format(impostoINSS));
		System.out.println("- Sindicado (5%)  = R$" + deci.format(sindicato));
		System.out.println("= Sal�rio Liquido = R$" + deci.format(salarioLiquido));
		
						
		scan.close();

	}

}
