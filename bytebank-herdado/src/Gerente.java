public class Gerente extends Funcionario{
//	private String nome;
//	private String cpf;
//	private double salrario;
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	public boolean autenctica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
