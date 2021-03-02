package Arrays;
import java.util.Random;
import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int receba [][] = new int [3][3];
		int linha;
		int coluna;
		int somaTodos = 0;
		int somaDiagonal = 0;
		Random numeroAleatorio = new Random();
		
			for(linha =0; linha < 3; linha++) 
			{
				for(coluna =0; coluna < 3; coluna++) 
				{
					System.out.println("Digite o valor: ");
					receba[linha][coluna] = ler.nextInt();
					somaTodos += receba[linha][coluna];
				}
			
				for(linha =0; linha < 3; linha++) 
				{
					for(coluna =0; coluna < 3; coluna++) 
					{
						System.out.printf("[ %d ]",receba[linha][coluna]);
					}
				}
				
			}
			/*escreva("Valor total da matriz: ",somaTodos)
		     somaDiagonal = receba[0][0] + receba[1][1] + receba[2][2]
		     pula()
		     escreva("Valor da soma da diagonal principal: ",somaDiagonal)	
		     */
		System.out.printf("\nValor total da matriz %d",somaTodos);	
		somaDiagonal = receba[0][0] + receba[1][1] + receba [2][2];
		System.out.printf("\nO valor da diagonal principal: %d",somaDiagonal);
		
	}

}
