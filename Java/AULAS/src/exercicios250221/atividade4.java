package exercicios250221;
import java.util.Scanner;

/*
 *Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado. 
 */

public class atividade4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.print("Numero par e sua raiz quadrada: " + Math.sqrt(Math.round(numero)));
			
		}	
			else 
				System.out.print("Numero impar elevado ao quadrado " + Math.pow(Math.round(numero), 2));
			
	}	
}
