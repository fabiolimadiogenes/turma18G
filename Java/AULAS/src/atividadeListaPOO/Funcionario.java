package atividadeListaPOO;

/*
 * Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
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
