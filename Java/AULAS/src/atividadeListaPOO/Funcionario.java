package atividadeListaPOO;

/*
 * Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.
 */
public class Funcionario {

	//aributos
	private String nome;
	private double salario;
	
	//metodos
	void setNome(String nomeFuncionario) 
	{
		this.nome = nomeFuncionario;
	}
	
	String getNome() 
	{
		return nome;
	}
	
	void setSalario(double valorSalario)
	{
		this.salario = valorSalario;
	}
	
	double getSalario()
	{
		return salario;
	}
	
	
}
