public class Carro extends Veiculo{
  
    public void ligar(){ //Como aqui está público, foi preciso apenas chamar um método em Autodromo.java para usar os privados.
        ConfereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo Combustível!");
    }
    private void ConfereCambio(){
        System.out.println("Conferindo o Câmbio em P");
    }
}
