package com.ilson.cursojava.aula15.exercicio;

import java.util.Scanner;

public class tarefa03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o F para FEMININO ou M para MASCULINO:");
		String codigo = scan.next();

		/*if (codigo == "F" | codigo == "f"){
			System.out.println("Código digitado = FEMININO");
		} else if (codigo == "M" | codigo == "m"){
			System.out.println("Código digitado = MASCULINO");
		} else {
			System.out.println("Código digitado = INVÁLIDO");
		}*/ 
		// na condição de String, não se usa a comparação ==. 
		//Em exceção, a String (que é uma classe separada) usa se seus prórios métodos.
		
		if (codigo.equalsIgnoreCase("F")){
		System.out.println("Código digitado = FEMININO");
	} else if (codigo.equalsIgnoreCase("M")){
		System.out.println("Código digitado = MASCULINO");
	} else {
		System.out.println("Código digitado = INVÁLIDO");
	}
	
		scan.close();
	}

}
