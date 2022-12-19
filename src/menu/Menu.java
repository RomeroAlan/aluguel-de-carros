package menu;

public class Menu {
	
	public static void bemVindo() {
		System.out.println("=====================ã");
		System.out.println("Bem vindo ao sistema de aluguel de carros");
		System.out.println("Para começar, digite seu cpf: ");
		System.out.println("Para sair, digite 0");
		System.out.println("Sair...");
	}
	
	public static void opcoesCliente() {
		System.out.println("Digite o numero referente a sua opção");
		System.out.println("! - Alugar um veiculo");
		System.out.println("2 - Devolver um veiculo");
	}
	
	public static void opcoesAdmin() {
		System.out.println();
		System.out.println("Digite o numero referente a sua opção");
		System.out.println("! - Cadastrar um cliente");
		System.out.println("2 - Remover um cliente");
		System.out.println("3- Cadastrar um veiculo");
		System.out.println("4 - Remover um veiculo");
		System.out.println("5 - Cadastrar um vendedor");
		System.out.println("6 - Remover um vendedor");
    
	}
	
	public static void opcoesVendedor() {
		System.out.println();
		System.out.println("Digite o numero referente a sua opção");
		System.out.println("1 -Ver carros alugados");
		System.out.println("2 -Ver seu salario + comissão atual");
	}

}
