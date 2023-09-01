// ExemploWhile.java
import java.util.concurrent.ThreadLocalRandom; //simular valores aleatórios
public class ExemploWhile {
public static void main(String[] args) {
	double mesada = 50.0;
        while(mesada>0) { //o while vai acontecer até a mesada acabar, ficar em 0 reais
            Double valorDoce = valorAleatorio(); //se o valor do doce for maior q a mesada, o valor do doce recebe o valor da mesada
            if(valorDoce > mesada)
                valorDoce = mesada;
            //esse if é para a mesada não ficar negativa!
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
        /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
        */
   }
   private static double valorAleatorio() { //método para conseguir valor aleatório!
	return ThreadLocalRandom.current().nextDouble(2, 8);
   }
}