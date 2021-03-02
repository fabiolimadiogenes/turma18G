package TestesPOO;

public class TesteCarro {
	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		meuCarro.cor = "Vermelho";
		meuCarro.moedlo = "Passat";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.liga();

		meuCarro.acelera(20);
		
		meuCarro.pegaMarcha();
		
		System.out.println(meuCarro.velocidadeAtual);
	}
}
