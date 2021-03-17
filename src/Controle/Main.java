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
		
		app.vacinar(115, 58);
		
		app.getPainelDados();
	}
}
