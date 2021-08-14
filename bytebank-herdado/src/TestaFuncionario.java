
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("12311232132");
		nico.setSalrario(2590.00);
		
		System.out.println("Nome.......: "+nico.getNome());
		System.out.println("CPF........: "+nico.getCpf());
		System.out.println("Salário....: "+nico.getSalrario());
		System.out.println("Bonificação: "+nico.getBonificacao());		
	}
}