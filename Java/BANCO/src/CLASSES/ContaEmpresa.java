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
	
	public void setEmprestimo(double emprestimo) {
			
			this.emprestimo = emprestimo;
			
	}
	
	@Override
	public double getSaldo() {
        return saldo += + emprestimo;
    }
	
	@Override
	public void credito(double valor) {
        this.saldo = this.saldo + valor;

    }

	@Override
    public void debito(double valor)
    {
        if (this.saldo>=valor)
        {
            this.saldo = this.saldo - valor;
        }

    }

	
	
	
	
	
	
	
	
	
}
