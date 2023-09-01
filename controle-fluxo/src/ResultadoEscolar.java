// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 6;
       
        if(nota >= 7) //se nota maior ou igual a 7:
            System.out.println("Aprovado");

        else if (nota>=5 && nota<7)
            System.out.println("Prova de recuperação!");

        else //se não:
            System.out.println("Reprovado");


        // Forma mais rápida de obter o resultado do if e else
		int nota1 = 7;
		String resultado = nota1 >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);


        // Forma mais rápida de obter o resultado do if, else if e else
		int nota2 = 6;
		String resultado1 = nota2 >=7 ? "Aprovado" : nota2 >=5 && nota2 <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado1);

    }
}