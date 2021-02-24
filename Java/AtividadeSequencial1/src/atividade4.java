import java.util.Scanner;

public class atividade4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int A;
		int B;
		int C;
		float D;
		float R;
		float S;
		
		System.out.println("Informe seu nome: ");
		nome = ler.next();
		System.out.println(nome + ", seja bem vinde ao nosso sistema calculador de expressões");
		System.out.println("Para começar digite o primeiro número: ");
		A = ler.nextInt();
		System.out.println("Digite o segundo número:");
		B = ler.nextInt();
		System.out.println("Digite o terceito número");
		C = ler.nextInt();
		
		R = (A + B) ^ 2;
		S = (B + C) ^ 2;
		D = (R + S) / 2;
		
		System.out.println("O resultado é: " + D);
		System.out.println(nome + ", obrigado por usar o nosso sistema.");
		
	}
}
