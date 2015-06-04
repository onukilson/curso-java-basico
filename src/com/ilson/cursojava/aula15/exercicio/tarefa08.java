package com.ilson.cursojava.aula15.exercicio;

import java.util.Scanner;

public class tarefa08 {

	public static void main(String[] args) {
		// Faça um programa que pergunte o preço de três produtos e informe
		//qual produto você deve comprar, sabendo que a decisão é sempre
		//pelo mais barato.
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Preço do primeiro Item:");
	double item1 = scan.nextDouble();
	System.out.println("Preço do segundo Item:");
	double item2 = scan.nextDouble();
	System.out.println("Preço do tereceiro Item:");
	double item3 = scan.nextDouble();
	
	if (item1 < item2 || item1 < item3){
		System.out.println("Comprar Primerio Item: R$" + item1);
	}else if (item2 < item1 || item2 < item3){
		System.out.println("Comprar Segundo Item: R$" + item2);
	}else{
		System.out.println("Comprar Terceiro Item: R$" + item3);
	}	
		scan.close();
	}

}
