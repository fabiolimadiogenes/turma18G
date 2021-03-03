package atividadeListaPOO;

public class ProdutoEletronico {
	
	private String modelo;
	private double valor;
	private boolean temEstoque;
	
	void setModelo(String modeloAparelho)
	{
		this.modelo = modeloAparelho;
	}
	
	String getModelo()
	{
		return modelo;
	}
	
	void setValor(double valorAparelho)
	{
		this.valor = valorAparelho;
	}
	
	double getValor()
	{
		return valor;
	}	
	
	void setEstoque(boolean estoque)
	{
		
		this.temEstoque = estoque;
		
		if(estoque == true) 
		{
			System.out.println("Temos estoque!");
		}
		else if (estoque == false)
		{
			System.out.println("Não temos estoque!");
		}	
	}
	
	
	
}
