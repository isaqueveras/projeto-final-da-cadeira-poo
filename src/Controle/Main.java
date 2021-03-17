package Controle;

/**
 * @author Isaque Véras
 *
 */
public class Main {
	public static void main(String[] args) {
		Aplicacao app = new Aplicacao(20);
		
		app.setQtdPopulacao(10);
		app.setfaixaEtariaInicio(40);
		app.setfaixaEtariaFim(60);
		
		app.vacinar(10, 41);
		app.getPainelDados();
	}
}
