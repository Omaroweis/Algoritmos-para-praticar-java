
public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	Pessoa(){
		nome = "";
		idade = 0;
		sexo = ' ';
	}
	Pessoa(String nome){
		this.nome = nome;
		this.idade = 0;
		this.sexo = ' ';
	}
	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public String calculaFaixaEtaria() throws Exception {
		if(this.idade <= 0) {
			throw new Exception("Idade nao pode ser menor ou igual a zero");
		}
		if(this.idade <= 8) {
			return("CRIANCA");
		}else if(idade <= 13) {
			return ("PRE-ADOLESCENTE");
		}else if(idade <= 18) {
			return ("ADOLESCENTE");
		}else if(idade <= 60) {
			return ("ADULTO");
		}else {
			return("IDOSO");
		}		
	}
}
