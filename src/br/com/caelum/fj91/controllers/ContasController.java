package br.com.caelum.fj91.controllers;

import java.math.BigDecimal;

import br.com.caelum.fj91.models.Cliente;
import br.com.caelum.fj91.models.Conta;
import br.com.caelum.fj91.services.RealizadorDeTransferencia;

public class ContasController {

	public static void main(String[] args) {
		Conta conta1 = new Conta("98r453905",new Cliente("Alberto","alberto@gmail.com"));
		conta1.deposita(BigDecimal.TEN);
		Conta conta2 = new Conta("89473982",new Cliente("Paulo","paulo@gmail.com"));
		new RealizadorDeTransferencia().executa(conta1,conta2,new BigDecimal(5));
	}
}
