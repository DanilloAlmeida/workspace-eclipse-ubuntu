public class Funcionario {
	private String nome;
	private String cpf;
	protected double salario; //publico para os filhos
	
	public Funcionario() {
		
	}
	
	public double getBonificacao() {
		return this.salario * 0.05;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalrario() {
		return salario;
	}
	public void setSalrario(double salrario) {
		this.salario = salrario;
	}
}
