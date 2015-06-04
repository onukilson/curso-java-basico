package com.ilson.cursojava.aula15.exercicio;

import java.util.Scanner;

public class tarefa09 {

	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre-os em ordem
		//decrescente.
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Entre o primerio numero:");
	double item1 = scan.nextDouble();
	System.out.println("Entre o segundo numero:");
	double item2 = scan.nextDouble();
	System.out.println("Entre o terceiro numero:");
	double item3 = scan.nextDouble();

	if (item1 <= item2 && item1 <= item3 && item2 <= item3){
		// item1 <item2 < item3
		System.out.println(item3 + "," + item2 + "," + item1);
	}else 	if (item1 <= item2 && item1 <= item3 && item3 <= item2){
		// item1 <item3 < item2
		System.out.println(item2 + "," + item3 + "," + item1);
	}else 	if (item2 <= item1 && item2 <= item3 && item1 <= item3){
		// item2 <item1 < item3
		System.out.println(item3 + "," + item1 + "," + item2);
	}else 	if (item2 <= item1 && item2 <= item3 && item3 <= item1){
		// item2 <item3 < item1
		System.out.println(item1 + "," + item3 + "," + item2);
	}else 	if (item3 <= item1 && item3 <= item2 && item1 <= item2){
		// item3 <item1 < item2
		System.out.println(item2 + "," + item1 + "," + item3);
	}else 	if (item3 <= item2 && item3 <= item1 && item2 <= item1){
		// item3 <item2 < item1
		System.out.println(item1 + "," + item2 + "," + item3);
	}
scan.close();
	}
}
