package atividadeSequencial;
import java.util.Scanner;

public class atividade8 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double consumidor;
		double custoFabrica;
		String nome;
		
		System.out.print("Insira o nome do consumidor: ");
		nome = ler.next();
		System.out.println("Seja bem vinde " + nome + ".");
		System.out.print("Digite o custo de fábrica: ");
		custoFabrica = ler.nextDouble();
		custoFabrica += + 0.45;
		
		consumidor = custoFabrica + 0.28;
		System.out.print(nome + ", o seu custo como consumidor é de: " + consumidor);
		
	}

}
