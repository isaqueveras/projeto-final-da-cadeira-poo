package Controle;

/**
 * @author Isaque Véras
 *
 */ 
public class Main {
	public static void main(String[] args) {
		//int populacao = 10;
		Aplicacao app = new Aplicacao(0);
		
		// Criando pessoas
		Pessoa p1 = new Pessoa("Isaque Véras", 19, "Tejubana");
		Pessoa p2 = new Pessoa("Ismael Véras", 19, "Centro");
		
		// Adicionar uma pessoa na cidade
		app.addPessoa(p1);
		app.addPessoa(p2);
		
		app.listarPessoas();
		
		// 1° Vacina
		Vacina va = new Vacina(app.getQtdPopulacao());
		va.setQtdVacinas(106);
		va.setNome("Pfizer");
		va.setDescricao("Vacina contra o corona");
		va.setfaixaEtariaInicio(10);
		va.setfaixaEtariaFim(20);
		app.adicionarVacina(va);
		//va.vacinar(2, 15); // vacinar usando a vacina da Pfizer
		
		// 2° Vacina
		Vacina va1 = new Vacina(app.getQtdPopulacao());
		va1.setQtdVacinas(10);
		va1.setNome("Coronavac");
		va1.setDescricao("Vacina contra o corona");
		va1.setfaixaEtariaInicio(40);
		va1.setfaixaEtariaFim(60);
		app.adicionarVacina(va1);
		//va1.vacinar(2, 45); // vacinar usando a vacina da Coronavac
		
		// 3° Vacina
		Vacina va2 = new Vacina(app.getQtdPopulacao());
		va2.setQtdVacinas(20);
		va2.setNome("Cripe");
		va2.setDescricao("Vacina contra a gripe");
		va2.setfaixaEtariaInicio(1);
		va2.setfaixaEtariaFim(12);
		//va2.vacinar(2, 8); // vacinar usando a vacina da gripe
		
		app.adicionarVacina(va2);
		//app.listarVacinas();

		va.getPainelDados();
		//va1.getPainelDados();
		//va2.getPainelDados();
	}
}
