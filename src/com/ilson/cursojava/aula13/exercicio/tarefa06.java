package com.ilson.cursojava.aula13.exercicio;

import java.util.Scanner;

public class tarefa06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o Raio do Circulo: ");
		double raio = scan.nextDouble();
		double numeroPi = 3.14;
		double areaCirculo = (raio * raio) * numeroPi;
		System.out.println("A área do círculo é: " + areaCirculo);
				
		scan.close();

	}

}
