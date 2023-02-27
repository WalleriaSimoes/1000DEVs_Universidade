package aula02.universidade;

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private int nroRegistro;
	private String orgaoLotacao;
	private double salario;
	
	public Funcionario(String nome, String cpf, int nroRegistro, String orgaoLotacao, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.nroRegistro = nroRegistro;
		this.orgaoLotacao = orgaoLotacao;
		this.salario = salario;
	}
	
	public void aumentaSalario() {
		this.salario *= 1.1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOrgaoLotacao() {
		return orgaoLotacao;
	}

	public void setOrgaoLotacao(String orgaoLotacao) {
		this.orgaoLotacao = orgaoLotacao;
	}

	public String getCpf() {
		return cpf;
	}

	public int getNroRegistro() {
		return nroRegistro;
	}

	public double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
