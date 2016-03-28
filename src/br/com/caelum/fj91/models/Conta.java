package br.com.caelum.fj91.models;

import java.math.BigDecimal;
import java.util.Calendar;

public class Conta {

	private BigDecimal saldo = BigDecimal.ZERO;
	private BigDecimal limite = BigDecimal.ZERO;

	private String numero;
	private Calendar dataAbertura;
	private Cliente cliente;

	public Conta(String numero,Cliente cliente) {
		super();
		this.numero = numero;
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getNumero() {
		return numero;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public BigDecimal getLimite() {
		return limite;
	}

	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "{Conta #" + this.numero + "}";
	}

	public void transfere(Conta outra, BigDecimal valor) {
		saca(valor);
		outra.deposita(valor);
	}

	/**
	 * Deposita dinheiro em uma conta bancária
	 * 
	 * @param valor
	 *            Valor a ser sacado
	 */
	public void deposita(BigDecimal valor) {
		this.saldo = getSaldo().add(valor);
		
	}

	public void saca(BigDecimal valor) {
		BigDecimal novoSaldo = getSaldo().subtract(valor);

		if (novoSaldo.compareTo(getLimite().negate()) >= 0) {
			this.saldo = novoSaldo;
		} else {
			throw new RuntimeException("Saldo insuficiente");
		}

	}

}
