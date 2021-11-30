
public class Funcionario extends Pessoa {
	private float salario;
	Funcionario(String nome, int idade,float salario){
		super(nome, idade);
		this.salario = salario;
	}
	public double calculaAumento() {
		return (this.salario *0.1);
	}
	public float getSalario() {
		return this.salario;
	}
}
