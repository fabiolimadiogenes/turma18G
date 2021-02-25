package atividadePortal;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.printf("Entre com sua idade: ");
		idade = ler.nextInt();
		ler.nextLine();
		System.out.printf("Entre com seu nome: ");
		nome = ler.next();
		
		System.out.printf("\nSeu nome: %s",nome);
		System.out.printf("\nSua idade: %d",idade);
		
		if(idade >= 18) {
			System.out.printf("\nVocê é maior de idade!");
		}else if (idade >= 1 && idade < 18){
			System.out.printf("\nVocê é menor de idade!");
		}else {
			System.out.println("\nVocê entrou com uma idade inválida.");
		}
	}
}
