package exercicio2602;
import java.util.Scanner;

/*
 * quando numero for negativo para o laço
 * E quando parar mostrar qual o maior numero maior
 */

public class atividade02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		int maiorNumero = 0;
		
		do{
			System.out.print("Digite um número: ");
			numero = ler.nextInt();
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
			
			}while(numero >= 0);	
				
			System.out.printf("O valor do maior número é: %d", maiorNumero);
	}	

}
