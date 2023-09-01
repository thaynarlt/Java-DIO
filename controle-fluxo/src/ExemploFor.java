// ExemploFor.java
public class ExemploFor {
	public static void main(String[] args) {
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) { //vai contar os carneiros até 20
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}
        //estrutura 2
        System.out.println("------------------------");
        //o que importa é somente o bloco condicional
        int carneirinhos1 = 1;
        for( ; carneirinhos1 <=20; ) {
            System.out.println(carneirinhos1 + " - Carneirinho(s)");
            carneirinhos1 ++;
        //for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da execução ) { }
        
        }

	}
}