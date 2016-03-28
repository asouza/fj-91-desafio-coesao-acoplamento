package br.com.caelum.fj91.models;

public class Cliente {

	private String nome;
	private String email;
	
	
	
	public Cliente(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
}
