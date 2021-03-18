package Controle;

/**
 * @author Isaque Véras
 *
 */
public class Main {
	public static void main(String[] args) {
		Aplicacao app = new Aplicacao(100, 200);
		app.setfaixaEtariaInicio(40);
		app.setfaixaEtariaFim(60);
		
		app.vacinar(50, 58);
		
		Vacina va = new Vacina();
		va.setNome("Pfizer");
		va.setDescricao("Vacina contra o corona");
		app.adicionarVacina(va);
		
		Vacina va1 = new Vacina();
		va1.setNome("Coronavac");
		va1.setDescricao("Vacina contra o corona produzido na china");
		app.adicionarVacina(va1);
		
		app.listarVacinas();
		
		app.getPainelDados();
	}
}
