import java.text.DecimalFormat; //usada para formatar números com casas decimais
import java.util.Scanner; // classe Scanner que é usada para ler entradas do usuário.

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //ler entradas do usuário
        DecimalFormat df= new DecimalFormat("0.00"); //cria um objeto para formatar números com duas casas decimais.
   
        double valorInicial = scanner.nextDouble(); // Lê o valor inicial do investimento fornecido pelo usuário como um número decimal.
        double taxaJuros = scanner.nextDouble(); // Lê a taxa de juros anual fornecida pelo usuário como um número decimal.
        int periodo = scanner.nextInt(); //Lê o período de tempo em anos fornecido pelo usuário como um número inteiro.
        
        double valorFinal = valorInicial * Math.pow((1 + taxaJuros), periodo); 
        //Calcula o valor final do investimento com juros compostos usando a fórmula dos juros compostos. O resultado é armazenado na variável valorFinal.
        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}