package java_3_aula2_atividade4;

public class Conta {
	int agencia;
	int conta;
	double saldo;
	Cliente titular;
	
	void depositar (double valor) {
		this.saldo += valor;
	}
	
	boolean sacar (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	boolean transferir (double valor, Conta destino) {
		if (this.saldo >= valor) {
			//this.sacar valor;
			this.sacar(valor);
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
}
