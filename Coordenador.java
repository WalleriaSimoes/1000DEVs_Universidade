package aula02.universidade;

public class Coordenador extends Funcionario{

	private Professor[] professoresSupervisionados;

	public Coordenador(String nome, String cpf, int nroRegistro, String orgaoLotacao, double salario) {
		super(nome, cpf, nroRegistro, orgaoLotacao, salario);
		this.professoresSupervisionados = new Professor[10];
	}

	@Override
	public void aumentaSalario() {
		super.setSalario(super.getSalario() * 1.05);
	}
	
	public void adicionaProfessor(Professor professor) {
		for (int i = 0; i<=this.professoresSupervisionados.length-1; i++) {
			if(this.professoresSupervisionados[i]== null) {
				this.professoresSupervisionados[i] = professor;
				break;
			}
		}
	}

	public Professor[] getProfessoresSupervisionados() {
		return professoresSupervisionados;
	}
	
	
}
