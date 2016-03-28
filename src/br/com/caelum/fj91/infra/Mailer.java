package br.com.caelum.fj91.infra;

public class Mailer {
	
	public Mailer(boolean lancaException) throws Exception {
		if(lancaException){
			throw new Exception("Você não pode me tirar daqui");
		}
	}

	public void send(String from, String to, String subject, String body) {
		System.out.println("enviando email...");
	}

}
