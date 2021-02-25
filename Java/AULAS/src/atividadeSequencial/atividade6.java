package atividadeSequencial;
import java.util.Scanner;
/*
 * Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

que efetua tal cálculo é:
 */
public class atividade6 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
			double D;
			double x1;
			double y1;
			double x2;
			double y2;
		
			System.out.print("Digite o valor de X1: ");
			x1 = ler.nextDouble();
			System.out.print("Digite o valor de Y1: ");
			y1 = ler.nextDouble();
			System.out.print("Digite o valor de X2: ");
			x2 = ler.nextDouble();
			System.out.print("Digite o valor de Y1: ");
			y2 = ler.nextDouble();
	
			D = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1,2));
	
			System.out.printf("Distancia  : " + Math.round(D));
	
	}

}
