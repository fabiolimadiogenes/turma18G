package exercicioHerancaPolimorfismo;

public class testaAnimal {
	public static void main(String[] args) {
		
		Animal cachorro = new Cachorro("Pitoca",6);
		Animal cavalo = new Cavalo("Spirit",7);
		Animal preguica = new Preguica ("Flash",10);
						
		System.out.println(cachorro.getEmiteSom());
		System.out.println(cavalo.getEmiteSom());
		System.out.println(preguica.getEmiteSom());
		
		
	}
}
