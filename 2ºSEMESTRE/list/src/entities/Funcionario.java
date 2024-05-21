package entities;

public class Funcionario {
	private  final Integer id;
	private String nome;
	private Double salario;
	

	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		 this.salario = salario;
	}
	
	public void aumentarSalario(double perc) {
		salario += salario * perc/100;
	}


	public Integer getId() {
		return id;
	}


	@Override
	public String toString() {
		return id + ", " + nome + ", " + salario ;
	}
	
	
	
	
}
