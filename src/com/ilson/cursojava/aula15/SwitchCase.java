package com.ilson.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre o n�mero do dia da semana (1-7):");
		int diaSemana = scan.nextInt();
		
		/*if (diaSemana == 1){
			System.out.println("Domingo");
		} else if (diaSemana == 2){
			System.out.println("Segunda");
		} else if (diaSemana == 3){
			System.out.println("Ter�a");
		} else if (diaSemana == 4){
			System.out.println("Quarta");
		} else if (diaSemana == 5){
			System.out.println("Quinta");
		} else if (diaSemana == 6){
			System.out.println("Sexta");
		} else if (diaSemana == 7){
			System.out.println("S�bado");
		} else {
			System.out.println("Dia n�o � valido");
		}*/
		
		/*switch(diaSemana){
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda");break;
		case 3: System.out.println("Ter�a");break;
		case 4: System.out.println("Quarta");break;
		case 5: System.out.println("Quinta");break;
		case 8: System.out.println("Sexta");break; // alterado de prop�sito para acompanhar resultado != 6
		case 7: System.out.println("sabado");break;
		default: System.out.println("Dia n�o � valido");
		}*/	
		
		switch(diaSemana){
		case 2:
		case 3:
		case 4:
		case 5:
		case 6: System.out.println("Dia �til");break;
		case 1: 
		case 7: System.out.println("Fim de semana");break;
		default: System.out.println("Dia n�o � valido");
		}
		scan.close();
	}

}
