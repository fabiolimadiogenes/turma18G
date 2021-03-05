package exercicioHerancaPolimorfismo;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public String getEmiteSom() {
			
		String som = "hinn in in";
		
		return som;
			
	}
}
