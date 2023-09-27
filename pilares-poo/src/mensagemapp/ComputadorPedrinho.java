package mensagemapp;


//Simulação do uso da classe MSNMessenger

public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		System.out.println("MSN");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();

		//abrindo Facebook Messenger
		System.out.println("FACEBOOK");
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();

		//abrindo Telegram
		System.out.println("TELEGRAM");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
		//
		
	}
}


