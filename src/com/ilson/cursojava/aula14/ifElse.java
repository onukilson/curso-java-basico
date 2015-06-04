package com.ilson.cursojava.aula14;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Entre com a indade:");
		int idade = scan.nextInt();
		
		if (idade >= 18){
			System.out.println("É maior de idade");
			
		}	else {
			System.out.println("Não é maior de idade");
		}*/

		// barato <=10
		// 10< valor < 15 pode pedir desconto
		// 15 <= valor < 17 pesquisar mais
		// valor >=17 muito caro
		
		System.out.println("Entre com o valor:");
		double valor = scan.nextDouble();
		
		if (valor <= 10){
			System.out.println("barato");
		} else if (valor > 10 && valor <15){
			System.out.println("pode pedir desconto");
		} else if (valor >= 15 && valor <17){
			System.out.println("pesquisar mais");
		} else { //(valor <= 17)
			System.out.println("muito caro");
		}
		
		scan.close();
	}

}
