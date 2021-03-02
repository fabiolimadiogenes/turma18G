package TestesPOO;

import java.util.Scanner;

public class teste1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Triangulo T3 = new Triangulo();
		Triangulo T4 = new Triangulo();
		Quadrado Q1 = new Quadrado();
		Pessoa usuario = new Pessoa();
		
		
		double base1, altura1, area1;
		double base2, altura2, area2;
		
		System.out.println("Digite o seu nome: ");
		usuario.nome = ler.next();
		
		System.out.println("Digite o lado do quadrado: ");
		Q1.lado = ler.nextDouble();
		
		Q1.areaQuadrado();
		
		System.out.println("Digite a base 1: ");
		base1 = ler.nextDouble();
		System.out.println("Digite a altura 1: ");
		altura1 = ler.nextDouble();
		
		area1 = (base1 * altura1)/2;
		
		System.out.println("Base1: " + base1);
		System.out.println("Altura1: " + altura1);
		System.out.println("Area1: " + area1);
		
		System.out.println("Digite a base 2: ");
		base2 = ler.nextDouble();
		System.out.println("Digite a altura 2: ");
		altura2 = ler.nextDouble();
		
		area2 = (base2 * altura2)/2;
		
		System.out.println("Base2: " + base2);
		System.out.println("Altura2: " + altura2);
		System.out.println("Area2: " + area2);
					
		System.out.println("Terceiro triangulo");
		
		System.out.println("Digite a base 3: ");
		T3.base = ler.nextDouble();
		System.out.println("Digite a altura 3: ");
		T3.altura = ler.nextDouble();
		
		//area3 = (T3.altura * T3.base)/2;
		
		//System.out.println("A área do triangulo 3: " + area3);
		
		T3.areaTriangulo();
		
		if(area1> area2) 
		{
			System.out.println("Triangulo 1 tem a maior área!");
		} else if (area1 == area2)
		{
			System.out.println("Triangulo iguais!");
		}
		
	}
	
	
}
