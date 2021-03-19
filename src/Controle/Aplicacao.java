package Controle;

import java.util.ArrayList;

/**
 * @author Isaque Véras
 */
public class Aplicacao {
	private int qtdPopulacao = 0;
	private ArrayList<Vacina> vacinas;
	private ArrayList<Pessoa> pessoas;
	 
	Vacina va = null;
	
	public Aplicacao(int qtdPopulacao) {
		vacinas = new ArrayList<Vacina>();
		pessoas = new ArrayList<Pessoa>();
		setQtdPopulacao(qtdPopulacao);
	}
	
	public void adicionarVacina(Vacina vacina) {
		vacinas.add(vacina);
	}
	
	public void addPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	public void listarVacinas() {
		System.out.println("\n-> Vacinas");
		for (Vacina vacina : vacinas) 
			if(vacina instanceof Vacina) System.out.println("Nome: " +((Vacina) vacina).getNome() + "\t| Descrição: " + ((Vacina) vacina).getDescricao() + "\t| Quantidade: " + ((Vacina) vacina).getQtdVacinas() + " \t| Faixa Etária: " + ((Vacina) vacina).getfaixaEtariaInicio() + " à " + ((Vacina) vacina).getfaixaEtariaFim());
	}
	
	public void listarPessoas() {
		System.out.println("\n-> Pessoas (População)");
		for (Pessoa pessoa : pessoas) 
			if(pessoa instanceof Pessoa) System.out.println("Nome: " + ((Pessoa) pessoa).getNome() + "\t| Idade: " + ((Pessoa) pessoa).getIdade() + " \t| Bairro: " + ((Pessoa) pessoa).getBairro());
	}
	
	public int getQtdPopulacao() {
		return this.qtdPopulacao;
	}
	
	public void setQtdPopulacao(int qtd) {
		this.qtdPopulacao = qtd;
	}
}
