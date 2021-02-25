package exercicios250221;
import java.util.Scanner;
/*
 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
10-14 infantil
15-17 juvenil
 18-25 adulto
 */
public class atividade3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe a idade: ");
		idade = ler.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Pertence ao grupo infantil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Pertence ao grupo juvenil");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Pertence ao grupo adulto");
		}
	}

}
