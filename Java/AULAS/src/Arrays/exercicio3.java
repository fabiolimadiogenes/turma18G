package Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma
posi��o das matrizes N1 e N2.
 */

public class exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int N1[][] = new int [4][6];
		int N2[][] = new int [4][6];
		int M1[][] = new int [4][6];
		int M2[][] = new int [4][6];
				
		int linha;
		int coluna;
		
		Random numeroAleatorio = new Random(); 
		
			for(linha =0; linha < 4; linha++) 
			{
				for(coluna =0; coluna < 6; coluna++) 
				{
					N1[linha][coluna] = numeroAleatorio.nextInt(9)+1;
					N2[linha][coluna] = numeroAleatorio.nextInt(9)+1;
					M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
					M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
				}
			}	
			
		System.out.println("Dados N1: ");	
			
			for(linha =0; linha < 4; linha++) 
			{
				for(coluna =0; coluna < 6; coluna++) 
				{
					System.out.print(M1[linha][coluna] + " ");
				}	
				System.out.println();
			}	
			
		System.out.println("Dados M2: ");
		
			for(linha =0; linha < 4; linha++) 
			{
				for(coluna =0; coluna < 6; coluna++) 
				{
					System.out.print(M2[linha][coluna] + " ");
				}	
				System.out.println();
			}	
				
	}

}
