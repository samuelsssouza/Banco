package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca db = new ContaPoupanca(222, 222);
		db.deposita(200.0);
		
		cc.transfere(50.0, db);
		
		System.out.println("cc: " + cc.getSaldo());
		
		System.out.println("db: " + db.getSaldo());
		
	}

}
