package exerciciosRepeticao;

import java.util.Scanner;

/*
 * Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
 */
public class Atividade1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		for(numero = 1000; numero <2000; numero++) {
			if(numero %11==5) {
				System.out.println(numero);
			}
		}
	}
}
