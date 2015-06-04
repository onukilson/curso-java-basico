package com.ilson.cursojava.aula15.exercicio;

import java.util.Scanner;

public class tarefa10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o Turno que você estuda: ");
		String turno = scan.next();
		
		switch (turno){
		case "M":
		case "m": System.out.println("Bom dia!!"); break;
		case "v":
		case "V": System.out.println("Boa tarde!!"); break;
		case "N":
		case "n": System.out.println("Boa noite!!"); break;
		default: System.out.println("valor inválido"); break;
		}
		
	scan.close();
	

	}

}
