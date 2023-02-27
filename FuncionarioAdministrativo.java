package aula02.universidade;

public class FuncionarioAdministrativo extends Funcionario{

	private String senioridade;
	private String funcaoAdministrativa;
	
	public FuncionarioAdministrativo(String nome, String cpf, int nroRegistro, String orgaoLotacao, double salario,
			String senioridade, String funcaoAdministrativa) {
		super(nome, cpf, nroRegistro, orgaoLotacao, salario);
		this.senioridade = senioridade;
		this.funcaoAdministrativa = funcaoAdministrativa;
	}

	public String getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}

	public String getFuncaoAdministrativa() {
		return funcaoAdministrativa;
	}

	public void setFuncaoAdministrativa(String funcaoAdministrativa) {
		this.funcaoAdministrativa = funcaoAdministrativa;
	}
	 
	
}
