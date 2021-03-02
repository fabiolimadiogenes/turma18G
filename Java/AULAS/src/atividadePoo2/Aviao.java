package atividadePoo2;

public class Aviao {
	
	//atributos:
	String modelo;
	double altitude = 0.00;
	int velocidade = 0;
	int passageiros = 0;
	
		//metodos:
	
		void acelerar (int incrementarVelocidade)
		{
			velocidade += incrementarVelocidade;
			
			System.out.printf("\nVelocidade atual: d% km/h ",velocidade);
			
			if(velocidade >= 244)
			{
				System.out.println("\nVoc� est� na velocidade ideal para decolar");
			}else
				System.out.println("\nVelocidade abaixo do recomendado para decolar");
		}
		
		void reduzir (int reduzirVelocidade)
		{
			velocidade -= reduzirVelocidade;
			
			System.out.printf("\nVelocidade atual: d% km/h ",velocidade);
			
			if(velocidade <0)
			{
				System.out.println("\nVoc� est� estacionado.");
			}
		}
		
		void puxarManche (double aumentarAltitude)
		{
			altitude += aumentarAltitude;
			System.out.printf("\nSua altitude atual � de: %f",altitude);
			
			if(altitude >= 9.100)
			{
				System.out.println("\nVoc� atingiu a altitude m�xima");
				System.out.printf("\nSua altitude atual � de: %f",altitude);
			}
			else if(altitude >=150 && altitude <= 200)
			{
				System.out.println("Voc� est� na altitude m�nima para voo");
				System.out.printf("\nSua altitude atual � de: %f",altitude);
			}
			else if(altitude <= 10)
			{
				System.out.println("\nVoc� est� na pista");
				System.out.printf("\nSua altitude atual � de: %f",altitude);
			}
		}
		void empurrarManche(double diminuirAltitude)
		{
			altitude -= diminuirAltitude;
			
			if(altitude >=150 && altitude <= 200)
			{
				System.out.println("Voc� est� na altitude m�nima para voo");
				System.out.printf("\nSua altitude atual � de: %f",altitude);
			}
			else if(altitude <= 10)
			{
				System.out.println("\nVoc� pousou");
				System.out.printf("\nSua altitude atual � de: %f",altitude);
			}
		}
		
		void entradaPassageiros(int quantidadePassageiros)
		{
			passageiros += quantidadePassageiros;
			
			if(passageiros == 1) 
			{
				System.out.println("Seja bem vinde");
			}
			else if(passageiros >= 2)
			{
				System.out.println("Sej�o bem vindes");
			}
			
		}
}
