package com.ilson.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	private static Scanner scan;

	public static void main(String[] args) {


		scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);*/

		System.out.println("Digite o seu primeiro Nome, idade, altura, quantidade de filhos e se tem bichinho de estimação");
		String nome = scan.next();
		int idade = scan.nextInt();
		double altura = scan.nextDouble();
		byte qtdFilhos = scan.nextByte();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores: ");
		System.out.println("Primeiro Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Quantidade de Filhos: " + qtdFilhos);
		System.out.println("Possiu Bichinho de Estimação?" + temPet);
		
		
	}

}
