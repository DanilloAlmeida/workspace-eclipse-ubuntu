public class Funcionario {
	private String nome;
	private String cpf;
	private double salrario;
	
	public Funcionario() {
		
	}
	
	public double getBonificacao() {
		return this.salrario * 0.1;
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
		return salrario;
	}
	public void setSalrario(double salrario) {
		this.salrario = salrario;
	}
	
	

}
