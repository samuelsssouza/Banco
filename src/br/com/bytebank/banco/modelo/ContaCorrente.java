package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	

	@Override// Você está sobreescrevendo o método
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}


	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.getSaldo()  * 0.01;
	}
	
}
