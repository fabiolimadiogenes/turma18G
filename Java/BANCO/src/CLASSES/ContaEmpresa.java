package CLASSES;



public class ContaEmpresa extends Conta {
		
	//ATRIBUTO
	private double emprestimo;
	
	public ContaEmpresa(int numero, double emprestimo) 
	{
		super(numero);
		this.emprestimo = emprestimo;
	}

	//METODO ENCAPSULAMENTO - GETTERS AND SETTERS - SEGURANÇA
	public double getEmprestimo() {
		
		return emprestimo;
		
	}
	
	public double setEmprestimo() {
			
			return emprestimo;
			
	}

	
	
	
	
	
	
	
	
	
}
