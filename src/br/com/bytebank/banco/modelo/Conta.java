package br.com.bytebank.banco.modelo;

/**
 * Essa classe representa a moldura de uma conta
 * 
 * @author Samuel
 *
 */
public abstract class Conta {

	private double saldo;// Um atributo privado não pode ser nem modificado e nem lido por classes que	não seja dela mesma
	private int agencia;
	private int numero;
	private Cliente titular; // Composição
	private static int total;
	

	// Construtor é a forma de você restringir algo, indicando que você só pode criar aquela conta se você passar as informações
	public Conta(int agencia, int numero) {
		total++;
	//	System.out.println("O total de contas criadas é " + total);
		this.agencia = agencia;
		this.numero = numero;
	}
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else
			return false;
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else
			return false;
	}

	// Retorna o saldo, ele vai fazer uma pesquisa de como está o saldo
	public double getSaldo() {
		return this.saldo;
	}

	// O get ele retorna o numero da conta/atributo
	public int getNumero() {
		return this.numero;
	}

	// O set, ele altera o valor do atributo
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		
		 this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}