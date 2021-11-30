import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		System.out.println("DIGITE O NUMERO RESPECTIVO DA ATIVIDADE A SER TESTADA OU DIGITE 0 PARA FINALIZAR");
		int atividade;
		atividade = ler.nextInt();
		while(atividade != 0) {
			if(atividade == 1) {
				System.out.println("Digite seu nome");
				String nome;
				nome = ler.next();
				Pessoa pessoa = new Pessoa(nome);
				char sexo = ' ';
				System.out.println("digite seu sexo");
				try {
					sexo = (char)System.in.read();
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
				while(sexo != 'm' && sexo != 'f' && sexo != 'M' && sexo != 'F' ) {
					System.out.println("Ops, entrada invalida");
					System.out.println("digite seu sexo");
					try {
						sexo = (char)System.in.read();
						}catch(Exception e) {
							System.out.println(e.getMessage());
						}
				}
				
				pessoa.setSexo(sexo);
				if(pessoa.getSexo() == 'm' || pessoa.getSexo() == 'M') {
					System.out.println("O "+ pessoa.getNome() + " é do sexo MASCULINO");
				}
				else {
					System.out.println("O "+ pessoa.getNome() + " é do sexo FEMININO");
				}
				
			}
			else { 
				System.out.println("Digite seu nome");
				String nome;
				nome = ler.next();
				System.out.println("Digite seu salario");
				float salario = ler.nextFloat();
				System.out.println("Digite sua idade");
				int idade = ler.nextInt();
				Funcionario funcionario = new Funcionario(nome, idade, salario);
				if (atividade == 2) {
					double salarioComAumento = funcionario.getSalario() + funcionario.calculaAumento();
					System.out.println("O funcionario " + funcionario.getNome() + ", cuja idade eh " + funcionario.getIdade() + ", teria o salario = " +salarioComAumento+ " caso tivesse um aumento em 10%");
				}else {
					try{
						System.out.println("O funcionario " + funcionario.getNome() + ", cujo salario eh " + funcionario.getSalario() + ", tem a faixa etaria de um(a): " + funcionario.calculaFaixaEtaria() );
					}catch (Exception e) {
						// TODO: handle exception
						System.out.println("IDADE INVALIDA");
					}
				}
				
				System.out.print("\n");
				System.out.println("DIGITE O NUMERO RESPECTIVO DA ATIVIDADE A SER TESTADA OU DIGITE 0 PARA FINALIZAR");
				atividade = ler.nextInt();
				}
			}
		}
	}

