package atividadeListaPOO;

import java.util.Scanner;

public class ProdutoEletronicoTestar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ProdutoEletronico produto = new ProdutoEletronico();
		int temosEstoque;
		
		produto.setModelo("PS5");
		produto.setValor(5000.00);
		
		
		System.out.printf("\nModelo do aparelho eletronico: %s",produto.getModelo());
		System.out.printf("\nValor do produto R$: %.2f.",produto.getValor());
		System.out.print("Temos desse produto? \n[1 -> SIM] [2 -> NÃO] -> ");
		temosEstoque = ler.nextInt();
		
		if(temosEstoque == 1)
		{
			produto.setEstoque(true);
		}
		else if(temosEstoque == 2)
		{
			produto.setEstoque(false);
		}else
			System.out.println("Opção inválida.");
		
		
		
		
	}
}
