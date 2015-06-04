package com.ilson.cursojava.aula13.exercicio;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class tarefa12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//DecimalFormat deci = new DecimalFormat ("0.00");
		
		System.out.println("Informe a altura da pessoa: ");
		double alturaPessoa = scan.nextDouble();
		double pesoIdeal = ((72.7 * alturaPessoa) - 58);
		//System.out.println("O peso ideal da pessoa é de: " + deci.format(pesoIdeal) + "Kg");
		System.out.println("O peso ideal da pessoa é de: " + pesoIdeal + "Kg");		
		scan.close();

	}

}
