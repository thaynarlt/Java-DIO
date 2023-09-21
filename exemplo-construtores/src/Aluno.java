public class Aluno {
    private String nome;
    private String matricula;
    private String serie;

    public Aluno (String nome, String matricula, String serie) {
		this.nome = nome;
		this.matricula = matricula;
        this.serie = serie;
	}

    public String getNome() {
		return nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public String getSerie() {
		return serie;
	}
}
