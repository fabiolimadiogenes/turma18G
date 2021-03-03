package atividadeListaPOO;

public class Cliente {
	/*
	 * Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
	 */
	//aributos
	private String nome;
	private int idade; 
	private int credito;
	private int bonus;
	
	//construtor
	public Cliente (String nome, int idade, int credito, int bonus)
	{
		this.nome = nome;
		this.idade = idade;
		this.credito = credito;
		this.bonus = bonus;
	}
	
	
	
		public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public int getCredito() {
		return credito;
	}

	
	public int getBonus() {
		return bonus;
	}

		//metodos:
		void comprar(int gasto)
		{
			if(this.credito >= gasto)
			{
			this.credito -= gasto;
			System.out.printf("\nVoc� gastou: %d cr�ditos.",gasto);
			}
		}
		void ganhouBonus(int dinheiroBonus)
		{
			if(dinheiroBonus == 2)
			{
			this.credito += 200;
			
			}
		}
}
