package java_aula6_atividade1;

public class TesteSistema {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);

		Administrador adm = new Administrador();
		adm.setSenha(222);

		Designer d = new Designer();
		// d.setSenha(222);

		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
	}
}
