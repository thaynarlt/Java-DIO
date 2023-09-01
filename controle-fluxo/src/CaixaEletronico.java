// CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 25.0; //variável local
       double valorSolicitado = 17.0; //variável local

        if(valorSolicitado < saldo) //se o valor solicitado for menor que o saldo
            saldo = saldo - valorSolicitado; // então o saldo vai ser == saldo - valor solicitado:  25-17 = 8
        else
            System.out.println("Saldo insuficiente!");
        System.out.println(saldo); //se não ele vai imprimir so "saldo"

    }
}