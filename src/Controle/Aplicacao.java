package Controle;

import java.util.ArrayList;

/**
 * @author Isaque Véras
 */
public class Aplicacao {
	private int qtdPopulacao = 0;
	private int qtdTotalVacinas = 0;
	private ArrayList<Vacina> vacinas;
	private ArrayList<Pessoa> pessoas;
	 
	Vacina va = null;
	
	public Aplicacao(int qtdPopulacao) {
		vacinas = new ArrayList<Vacina>();
		pessoas = new ArrayList<Pessoa>();
		this.qtdPopulacao = qtdPopulacao;
	}
	
	public void adicionarVacina(Vacina vacina) {
		vacinas.add(vacina);
		setQtdTotalVacinas(getQtdTotalVacinas() + 1);
	}
	
	public void editarVacina(int index, Vacina vacina) {
		vacinas.set(index, vacina);
		System.out.println("A vacina da " + vacina.getNome() + " foi editado com sucesso");
	}
	
	public void addPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
		setQtdPopulacao(getQtdPopulacao() + 1);
	}
	
	public void listarVacinas() {
		int v = 1;
		System.out.println("\n-> "+ vacinas.size() +" tipos de vacinas");
		for (Vacina vacina : vacinas) 
			if(vacina instanceof Vacina) {
				System.out.println("id: "+ v +"\t| Nome: " +((Vacina) vacina).getNome() + "\t| Descrição: " + ((Vacina) vacina).getDescricao() + "\t| Quantidade: " + ((Vacina) vacina).getQtdVacinas() + " \t| Faixa Etária: " + ((Vacina) vacina).getfaixaEtariaInicio() + " à " + ((Vacina) vacina).getfaixaEtariaFim());
				v++;
			}
		System.out.println("");
	}
	
	public void listarPessoas() {
		int p = 1;
		System.out.println("\n-> "+ pessoas.size() +" Pessoas (População)");
		for (Pessoa pessoa : pessoas)
			if(pessoa instanceof Pessoa) {
				System.out.println("id: "+p+" \t| Nome: " + ((Pessoa) pessoa).getNome() + "\t| Idade: " + ((Pessoa) pessoa).getIdade() + " anos \t| Bairro: " + ((Pessoa) pessoa).getBairro());
				p++;
			}
		System.out.println("");
	}
	
	public int getQtdPopulacao() {
		return this.qtdPopulacao;
	}
	
	public void setQtdPopulacao(int qtd) {
		this.qtdPopulacao = qtd;
	}
	
	public int getQtdTotalVacinas() {
		return this.qtdTotalVacinas;
	}
	
	public void setQtdTotalVacinas(int qtd) {
		this.qtdTotalVacinas = qtd;
	}
	
	public void getPainelDadosVacina(int index) {
		index = index - 1; // Decrementa o index com -1, pois o arrayList começa com 0
		
		System.out.println("\n--------------------------------------------------------------------------");
		System.out.println("---> Vacina "+ vacinas.get(index).getNome() + "\t | Faixa etária: " + vacinas.get(index).getfaixaEtariaInicio() + " anos à "+ vacinas.get(index).getfaixaEtariaFim() + " anos");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Total de Vacinas:\t" + vacinas.get(index).getQtdVacinas() + "\t| População:\t\t\t" + getQtdPopulacao());
		System.out.println("Pessoas vacinadas:\t" + vacinas.get(index).getPessoasVacinadas() + "\t| Pessoas não vacinadas:\t" + vacinas.get(index).getPessoasNaoVacinadas());
		System.out.println("Vacinados:\t\t" + vacinas.get(index).getPorcengemVacinados() + "%" + "\t| Não vacinados:\t\t" + vacinas.get(index).getPorcengemNaoVacinados() + "%");
		System.out.println("--------------------------------------------------------------------------");
	}
	
}
