using System;

public class Desafio 
{
    public static void Main()
    {
        //Lê os valores de Entrada:
        float valorSalario = float.Parse(Console.ReadLine());
        float valorBeneficios = float.Parse(Console.ReadLine());

        float valorImposto = 0;
        if (valorSalario >=0 && valorSalario <= 1100)
        {
            //Atribuiu a aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
        }
        else if (valorSalario >= 1100.01 && valorSalario <= 2500.00)
        { 
            valorImposto = 0.10F * valorSalario;
        }
        else 
        {
            valorImposto = 0.15F * valorSalario;
        }

        //Calcula e imprime a Saída (com 2 casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        Console.WriteLine(saido.ToString("0.00"));
    }
}
