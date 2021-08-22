
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("12311232132");
		nico.setSalrario(2000.00);
		
		Funcionario gerente = new Gerente();
		gerente.setNome("Ernesto");
		gerente.setCpf("123456");
		gerente.setSalrario(5000.00);
		//gerente.setSenha(123456);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(nico);		
		controle.registra(gerente);
		
		System.out.println("Nome.......: "+nico.getNome());
		System.out.println("CPF........: "+nico.getCpf());
		System.out.println("Salario....: "+nico.getSalrario());
		System.out.println("Bonificacao: "+nico.getBonificacao());		
		System.out.println("\n");
		
		System.out.println("Nome.......: "+gerente.getNome());
		System.out.println("CPF........: "+gerente.getCpf());
		System.out.println("Salario....: "+gerente.getSalrario());
		System.out.println("Bonificacao: "+gerente.getBonificacao());		
		System.out.println("\n");
		
		System.out.println("Bonificacao total: "+controle.getSoma());
		
	}
}