package atividadeNaAula;

import java.util.Scanner;

public class Atividade1Dia0203 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double trianguloBase1 = 0.00;
		double trianguloAltura1 = 0.00;
		double trianguloSoma1 = 0.00;
		double trianguloBase2 = 0.00;
		double trianguloAltura2 = 0.00;
		double trianguloSoma2 = 0.00;
		double trianguloBase3 = 0.00;
		double trianguloAltura3 = 0.00;
		double trianguloSoma3 = 0.00;
		
		System.out.print("Digite o valor da base: ");
		trianguloBase1 = ler.nextDouble();
		
		System.out.print("Digite o valor da altura: ");
		trianguloAltura1 = ler.nextDouble();
		
		trianguloSoma1 = Math.pow((trianguloBase1 * trianguloAltura1),2);
		trianguloSoma2 = Math.pow((trianguloBase2 * trianguloAltura2),2);
		trianguloSoma3 = Math.pow((trianguloBase3 * trianguloAltura3),2);
		
		System.out.printf("Base: %f Altura: %f Area do triangulo: %f  ",trianguloBase1,trianguloAltura1,trianguloSoma1);
		
		System.out.println();
		
		
		
		
		
	}

}
