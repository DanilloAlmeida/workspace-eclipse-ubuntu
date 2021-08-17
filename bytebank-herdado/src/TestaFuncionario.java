
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("12311232132");
		nico.setSalrario(2590.00);
		
		Gerente gerente = new Gerente();
		gerente.setNome("Ernesto");
		gerente.setCpf("123456");
		gerente.setSalrario(25000.00);
		gerente.setSenha(123456);
		
		System.out.println("Nome.......: "+nico.getNome());
		System.out.println("CPF........: "+nico.getCpf());
		System.out.println("Salário....: "+nico.getSalrario());
		System.out.println("Bonificação: "+nico.getBonificacao());		
		System.out.println("\n\n");
		System.out.println("Nome.......: "  +gerente.getNome());
		System.out.println("CPF........: "  +gerente.getCpf());
		System.out.println("Salário....: " +gerente.getSalrario());
		System.out.println("Bonificação: "+gerente.getBonificacao());
	}
}