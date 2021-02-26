package exercicio2602;
import java.util.Scanner;
/*
 * fazer uma funçao void, que escreve uma linha. Baseada no que o usuario digitou, numero inteiro.

 */
public class atividade01 {

	public static void main(String[] args) {
		int numero = 0;
		Scanner ler = new Scanner(System.in);
						
		System.out.print("Digite o tamanho da linha ");
		numero = ler.nextInt();
		Linha(numero);
	}
	
	public static void Linha(int numero) {
		
		for(int i = 0; i <= numero; i++) {
			
			System.out.print("-");
			
		}
	}	
}


	
	

