public class Operadores {
    public static void main(String[] args) {
        //Operadores Unários Exemplos:
        int numero = 5;
        numero = - numero;
        System.out.println(numero);
        numero = + numero; //ficou (-5) porque é necessário que seja (* -1)
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);

        //Incremento de Números:
        // x repetição
        int numero1 = 5;
        //numero1++; // é  igual a numero1 + 1 == 6
        System.out.println(numero1);
        //ou:
        System.out.println(++ numero1);

        //valores booleanos:
        boolean variavel = true;
        System.out.println(!variavel); //inverte valor da variavel, mas não altera valor definido anteriormente

        System.out.println(variavel);


        //Operador Ternário
        // classe Operadores.java
        int a, b;
        a = 5;
        b = 6;
        String resultado = "";
        //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);
        
        //FORMA MAIS SIMPLES:
        String resultado1 = a ==b ?"verdadeiro" : "falso";
        
        System.out.println(resultado1);


        //Operadores Relacionais:

        String nomeUm = "GLEYSON";
        String nomeDois = "GLEYSON";
        System.out.println(nomeDois == nomeUm);
        System.out.println(nomeUm.equals(nomeDois));


        int numeroum = 1;
        int numerodois = 2;

        boolean simNao = numeroum == numerodois;
        System.out.println("numeroUm é igual a numeroDois?" + " " + simNao);

        simNao = numeroum != numerodois;
        System.out.println("numeroUm é diferente a numeroDois?" + " " + simNao);
        
        simNao = numeroum > numerodois;
        System.out.println("numeroUm é maior a numeroDois?" + " " + simNao);

        //Operadores Lógicos
        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }
        System.out.println("fim");




    }
}
