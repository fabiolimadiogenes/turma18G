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
		System.out.println(nome + ", seja bem vinde ao nosso sistema calculador de express�es");
		System.out.println("Para come�ar digite o primeiro n�mero: ");
		A = ler.nextInt();
		System.out.println("Digite o segundo n�mero:");
		B = ler.nextInt();
		System.out.println("Digite o terceito n�mero");
		C = ler.nextInt();
		
		R = (A + B) ^ 2;
		S = (B + C) ^ 2;
		D = (R + S) / 2;
		
		System.out.println("O resultado �: " + D);
		System.out.println(nome + ", obrigado por usar o nosso sistema.");
		
	}
}
