package aula02.universidade;

public class ProgramaUniversidade {

	public static void main(String[] args) {
		
		
		FuncionarioAdministrativo joao = new FuncionarioAdministrativo("João", "11111111111", 1, 
				"Faculdade de computação", 5000, "Secretário", "Junior");
		Professor maria = new Professor("Maria", "33333333333", 3, "Faculdade de computação", 
				5000, "Mestrado", "Orientação a objetos", 30, 1);
		Coordenador jose = new Coordenador("José", "22222222222", 2, "Faculdade de computação", 5000);
		Professor renata = new Professor("Renata", "33333333333", 3, "Faculdade de computação", 
				5000, "Mestrado", "Orientação a objetos", 30, 1);
		
		joao.aumentaSalario();
		jose.aumentaSalario();
		jose.adicionaProfessor(maria);
		jose.adicionaProfessor(renata);
		
		System.out.print("Professores ministrados por jose: ");
		for (int i=0; i<= jose.getProfessoresSupervisionados().length - 1; i++) {
			if(jose.getProfessoresSupervisionados()[i] != null)
			System.out.print(jose.getProfessoresSupervisionados()[i].getNome() + ", ");
		}
		System.out.println("\nSalario do João: " + joao.getSalario());
		System.out.println("Salario do José: " + jose.getSalario());
		
		
	}

}
