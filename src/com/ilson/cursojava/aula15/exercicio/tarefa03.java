package com.ilson.cursojava.aula15.exercicio;

import java.util.Scanner;

public class tarefa03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o F para FEMININO ou M para MASCULINO:");
		String codigo = scan.next();

		/*if (codigo == "F" | codigo == "f"){
			System.out.println("C�digo digitado = FEMININO");
		} else if (codigo == "M" | codigo == "m"){
			System.out.println("C�digo digitado = MASCULINO");
		} else {
			System.out.println("C�digo digitado = INV�LIDO");
		}*/ 
		// na condi��o de String, n�o se usa a compara��o ==. 
		//Em exce��o, a String (que � uma classe separada) usa se seus pr�rios m�todos.
		
		if (codigo.equalsIgnoreCase("F")){
		System.out.println("C�digo digitado = FEMININO");
	} else if (codigo.equalsIgnoreCase("M")){
		System.out.println("C�digo digitado = MASCULINO");
	} else {
		System.out.println("C�digo digitado = INV�LIDO");
	}
	
		scan.close();
	}

}
