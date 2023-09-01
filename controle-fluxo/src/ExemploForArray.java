// ExemploFor.java
public class ExemploForArray {
public static void main(String[] args) {
	String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	for (int x=0; x<alunos.length; x++) { //x=0 pois é o índice do array
		System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	}



    //outra modelo usando array:
    String alunos1 [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
	
        //Forma abreviada
	for(String aluno : alunos1) {
	  System.out.println("Nome do aluno é: "+aluno);
	}

}
}
