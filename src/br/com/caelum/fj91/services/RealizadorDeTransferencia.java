package br.com.caelum.fj91.services;

import java.math.BigDecimal;
import java.sql.SQLException;

import br.com.caelum.fj91.daos.TransferenciaDao;
import br.com.caelum.fj91.infra.Mailer;
import br.com.caelum.fj91.models.Conta;

public class RealizadorDeTransferencia {

	public void executa(Conta conta1, Conta conta2, BigDecimal valor) {
		conta1.transfere(conta2, valor);
		try {
			new Mailer(false).send("banco@gmail.com", conta1.getCliente()
					.getEmail(), "Nova transferencia", "corpo do email");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			TransferenciaDao transferenciaDao = new TransferenciaDao(false);
			transferenciaDao.salva(conta1, conta2, valor);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
