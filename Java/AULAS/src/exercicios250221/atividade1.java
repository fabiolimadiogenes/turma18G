package exercicios250221;
import java.util.Scanner;

/*
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
public class atividade1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int maior;
		
		System.out.print("Digite o primeiro n�mero: ");
		numero1 = ler.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		numero2 = ler.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		numero3 = ler.nextInt();
		
		
		if(numero1 > numero2) 
		{
			if(numero1 > numero3)
				maior = numero1;
			else
				maior = numero3;
		}
		
		else 
		{
			if(numero3 > numero2)
				maior = numero3;
				
			else
				maior = numero2;
		}
			
			
			System.out.print("O maior n�mero �: " + maior);
	}
}

