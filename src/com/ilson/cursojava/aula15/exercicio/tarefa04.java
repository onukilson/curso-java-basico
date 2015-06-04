package com.ilson.cursojava.aula15.exercicio;

import java.util.Scanner;

public class tarefa04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Insira uma letra para saber se é vogal ou consoante:");
		String letra = scan.next();
		
		/*switch(letra){
		case "a":
		case "e":
		case "i":
		case "o":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
		case "u": System.out.println ("A letra digitada é uma Vogal."); break;
		default: System.out.println ("A letra digitada é uma Consoante.");
		*/
		
		if (letra.equalsIgnoreCase("a")|| letra.equalsIgnoreCase("e")|| letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
			System.out.println ("vogal");
		}else{
			System.out.println ("consoante");
		}
		scan.close();
		}

}
