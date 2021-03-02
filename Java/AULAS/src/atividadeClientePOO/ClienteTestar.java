package atividadeClientePOO;

import java.util.Scanner;

public class ClienteTestar {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Cliente c1 = new Cliente("Denise",28,1000,200);
		int valor;
		int opcao;
		
		System.out.printf("\nNome do cliente: %s. \nIdade: %d anos.",c1.getNome(),c1.getIdade());
		System.out.printf("\nCréditos disponiveis: %d",c1.getCredito());
		
		System.out.printf("\nVocê deseja pagar com seus créditos? ");
		System.out.printf("\nOu gostaria de ativar seu bonus de %d?",c1.getBonus());
		
		System.out.printf("\n[1 -> Pagar] ou [2 -> Bonus] -> ");
		opcao = ler.nextInt();
		
		if(opcao == 1)
		{
			System.out.print("\nDigite o quanto deseja pagar com seus créditos: ");
			valor = ler.nextInt();
			c1.comprar(valor);
		}
		else if(opcao == 2)
		{
			System.out.printf("\nSeu bonus de: %d créditos acaba de ser adionado a sua conta",c1.getBonus());
			c1.ganhouBonus(opcao);
		}
		
		System.out.printf("\nSeu saldo atual é de: %d",c1.getCredito());
		
	}
}
