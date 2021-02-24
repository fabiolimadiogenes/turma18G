import java.util.Scanner;
/*
 * programa
{
	inclua biblioteca Matematica 
	
	funcao inicio()
	{
		real  D
		real  x1
		real  y1
		real  x2
		real  y2
		
		escreva("Digite o valor de X1 ")
		leia(x1)
		escreva("Digite o valor de X2 ")
		leia(x2)
		escreva("Digite o valor de y1 " )
		leia(y1)
		escreva("Digite o valor de y2 ")
		leia(y2)

		D = Matematica.raiz((Matematica.potencia((x2-x1), 2) + Matematica.potencia((y2-y1), 2)),2)

		escreva("O resultado do calculo: ", Matematica.arredondar(D, 2))
		
		
	}
}

 */
public class atividade6 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double D;
		int x1;
		int y1;
		int x2;
		int y2;
		
		System.out.println("Digite o valor de X1: ");
		x1 = ler.nextInt();
		System.out.println("Digite o valor de Y1: ");
		y1 = ler.nextInt();
		System.out.println("Digite o valor de X2: ");
		x2 = ler.nextInt();
		System.out.println("Digite o valor de Y1: ");
		y2 = ler.nextInt();
		
		D = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1,2));
		
		System.out.println("Distancia: " + Math.round(D));
		
	}

}
