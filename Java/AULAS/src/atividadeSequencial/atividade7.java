package atividadeSequencial;
import java.util.Scanner;


public class atividade7 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		 
		double a,b,y,c,d,x,e,f;
		String nome;
		
		System.out.print("Olá, nos informe seu nome: ");
		nome = ler.next();
		System.out.println("Seja bem vinde " + nome + ".");
		System.out.print("Digite o valor de A: ");
		a = ler.nextDouble();
		System.out.print("Digite o valor de B: ");
		b = ler.nextDouble();
		System.out.print("Digite o valor de Y: ");
		y = ler.nextDouble();
		System.out.print("Digite o valor de C: ");
		c = ler.nextDouble();
		System.out.print("Digite o valor de D: ");
		d = ler.nextDouble();
		System.out.print("Digite o valor de X: ");
		x = ler.nextDouble();
		System.out.print("Digite o valor de E: ");
		e = ler.nextDouble();
		System.out.print("Digite o valor de F: ");
		f = ler.nextDouble();
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		y = ((a*f) - (c*d)) / ((a*e - b*d));
		
		x = Math.round(x * 100.0)/ 100.0;
		y = Math.round(y * 100.0)/ 100.0;
		
		System.out.println("Valor de X: " + x);
		System.out.println("Valor de Y: " + y);
		
		
	}

}
