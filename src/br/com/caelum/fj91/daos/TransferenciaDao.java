package br.com.caelum.fj91.daos;

import java.math.BigDecimal;
import java.sql.SQLException;

import br.com.caelum.fj91.models.Conta;

public class TransferenciaDao {
	
	public TransferenciaDao(boolean lancaException) throws SQLException {
		if(lancaException){
			throw new SQLException("vc nao pode me tirar daqui");
		}
	}

	public void salva(Conta conta1, Conta conta2, BigDecimal valor) {
		System.out.println("salvando transferencia");
	}
	
	public void abreConexao() {
		System.out.println("abrindo conexao com o banco");
	}
	
	public void fechaConexao(){
		System.out.println("fechando conexao com o banco");
	}
	
	

}
