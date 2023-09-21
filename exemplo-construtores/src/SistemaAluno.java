public class SistemaAluno {
    public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Aluno aluno1 = new Aluno( "João da Silva", "20231370022", "8ºano");
		
		System.out.println(aluno1.getNome() + " - " + aluno1.getMatricula() + " | Série: " + aluno1.getSerie());
	}
}
