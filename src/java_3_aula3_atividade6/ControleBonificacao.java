package java_3_aula3_atividade6;

public class ControleBonificacao {
	private double soma;
	
	public void registra (Funcionario f) {
		double boni = f.getBonificacao();
		this.soma += boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
