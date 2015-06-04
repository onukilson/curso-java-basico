package com.ilson.cursojava.aula13.exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class tarefa14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat ("0.00");
		
		/*Faça um programa que peça o tamanho de um arquivo para download
		(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
		informe o tempo aproximado de download do arquivo usando este link
		(em minutos).*/
		
		//imput dados
		System.out.println("Informe o tamanho do aquivo de download em MB: ");
		double arquivoTamanho = scan.nextDouble();
		System.out.println("Informe o velocidade de link contratado em Mbps: ");
		double velocidadeLink = scan.nextDouble();
		
		// cálculo
		
		double velocidadeDownload = velocidadeLink * 0.1; // taxa de download é de 10% do valor do link contratado
		double tempoDeDownload = arquivoTamanho / velocidadeDownload; //valor dado em segundos
		double tempoFinal = tempoDeDownload / 60;
		System.out.println("O tempo de download em minutos é de: " + deci.format(tempoFinal) + " min");
				
		scan.close();


	}

}
