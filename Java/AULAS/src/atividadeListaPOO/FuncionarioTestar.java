package atividadeListaPOO;

import java.util.Scanner;

public class FuncionarioTestar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Funcionario F1 = new Funcionario();
		String nome;
		
		System.out.println("Digite o nome do funcionario:");
		
		nome = ler.next();
		
		F1.setNome(nome);
		F1.setSalario(3500.00);
		
		System.out.printf("\nNome do funconario: %s.",F1.getNome());
		System.out.printf("\nValor do salário R$: %.2f.",F1.getSalario());
	}
}
