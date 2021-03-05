package exercicioCollections;
	import java.util.ArrayList;
import java.util.Collections;
	/*
	 * Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
	 */

public class EstoqueLoja {
	
	public static void main(String[] args) {
		
		String produto1 = "Banana";
		String produto2 = "Uva";
		String produto3 = "Laranja";
		
		ArrayList<String> produtos = new ArrayList<>();
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		
		System.out.println(produtos);
		
		produtos.remove(1);
		
		System.out.println(produtos);
		
		produtos.add("Leite");
		
		System.out.println(produtos);
		
		produtos.set(2, "Uva");
						
		System.out.println();
		
		for (String produto : produtos) 
		{
			
			System.out.println("Produto: " + produto);
		}
		
		/*for (String produto : produtos) 
		{
			System.out.println("Produto: " + produto);
		}
		
		String primeiroProduto = produtos.get(1); 
		System.out.println("O segundo produto é: " + primeiroProduto);
		
		for(int i = 0; i < produtos.size(); i++) 
		{
			System.out.println("Produto: " + produtos.get(i));
		}
		
		produtos.forEach(produto -> {
			System.out.println("Percorrendo: ");
			System.out.println("Percorrendo: " + produto);});
			
			Collections.sort(produtos);
		
		*/
		
		
		
		
	}

}
