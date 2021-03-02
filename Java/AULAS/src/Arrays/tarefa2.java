package Arrays;

import java.util.Random;
import java.util.Scanner;

public class tarefa2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int lancamentos[] = new int [5];
		double media = 0.00;
		int maiorPontuacao = 0;
		int contadorMaiorPontuacao = 0;
		double somaValores = 0.00;
		Random numeroDado = new Random(); 
					
			for(int x = 0; x < lancamentos.length; x++) 
			{
				System.out.printf("Digite o resultado do lançamento %d: ",(x+1));
				//lancamentos[x] = ler.nextInt();
				//lancamentos[x] = (int) (Math.random()*6)+1;
				lancamentos[x] = numeroDado.nextInt(6)+1;
			}
			
			for (int x=0; x < lancamentos.length; x++) 
			{
				System.out.printf("\nO valor do lançamento %d é %d", (x+1), lancamentos[x]);
				somaValores = somaValores + lancamentos[x];
				if(lancamentos[x] >= maiorPontuacao) 
				{
					if(lancamentos[x] > maiorPontuacao)
					{
						contadorMaiorPontuacao = 0;
					}
					maiorPontuacao = lancamentos[x];
					contadorMaiorPontuacao++;
				}
			}
			
		media = somaValores / lancamentos.length;	
		System.out.printf("\nTotal dos lançamentos digitados: %.0f",somaValores);	
		System.out.printf("\nA média é: %.2f",media);
		System.out.printf("\nO maior valor é: %d",maiorPontuacao);
		System.out.printf("\nO maior valor aparece %d vezes",contadorMaiorPontuacao);
	}

}
