package Controle;

import java.util.ArrayList;

/**
 * @author Isaque Véras
 *
 */
public class Aplicacao {
	private int qtdPopulacao = 0;
	private ArrayList<Vacina> vacinas;
	 
	Vacina va = null;
	public Aplicacao(int qtdPopulacao) {
		vacinas = new ArrayList<Vacina>();
		setQtdPopulacao(qtdPopulacao);
	}
	
	public void adicionarVacina(Vacina vacina) {
		vacinas.add(vacina);
	}
	
	public void listarVacinas() {
		System.out.println("---------------------------- Vacinas -------------------------------------");
		for (Vacina vacina : vacinas)
			if(vacina instanceof Vacina) System.out.println("Nome: " +((Vacina) vacina).getNome() + "\t\tDescrição: " + ((Vacina) vacina).getDescricao() + "\tQuantidade: " + ((Vacina) vacina).getQtdVacinas());
		System.out.println("--------------------------------------------------------------------------");
	}
	
	public int getQtdPopulacao() {
		return this.qtdPopulacao;
	}
	
	public void setQtdPopulacao(int qtd) {
		this.qtdPopulacao = qtd;
	}
}
