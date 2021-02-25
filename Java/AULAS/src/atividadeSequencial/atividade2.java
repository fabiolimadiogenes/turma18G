package atividadeSequencial;

import java.util.Scanner;
public class atividade2 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int diasDeVida;
		int anos;
		int meses;
		int dias;
		
		System.out.println("Olá, qual é seu nome? ");
		nome = ler.next();
		System.out.println("Seja bem vinde " + nome + ".");
		System.out.println("Quantos dias de vida você tem? ");
		diasDeVida = ler.nextInt();
		
		anos = diasDeVida / 365;
		meses = (diasDeVida % 365) / 30;
		dias = (diasDeVida % 365) % 30;
		
		System.out.println(nome + ", você viveu por aproximadamente: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
		
	}
}
