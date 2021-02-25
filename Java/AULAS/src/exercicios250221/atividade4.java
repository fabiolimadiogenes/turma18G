package exercicios250221;
import java.util.Scanner;

/*
 *Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado. 
 */

public class atividade4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.print("Numero par e sua raiz quadrada: " + Math.sqrt(Math.round(numero)));
			
		}	
			else 
				System.out.print("Numero impar elevado ao quadrado " + Math.pow(Math.round(numero), 2));
			
	}	
}
