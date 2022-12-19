package model;

public class Vendedor extends Pessoa{
	
	public Vendedor(String nome, String cpf, String senha, String endereco, double salario) {
		super(nome, cpf, senha, endereco);
		this.salario =salario;
	}
	private double salario;
	private double comissao;
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
