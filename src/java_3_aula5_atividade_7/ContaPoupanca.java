package java_3_aula5_atividade_7;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}
}
