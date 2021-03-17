package Controle;

/**
 * @author Isaque Véras
 *
 */
public class Aplicacao extends Vacina {
	private int qtdPopulacao = 0;
	private int faixaEtariaInicio = 0;
	private int faixaEtariaFim = 0;
	private int porcentagemVacinados = 0;
	private int porcentagemNaoVacinados = 0;
	private int pessoasVacinadas = 0;
	private int pessoasNaoVacinadas = 0;
	
	public Aplicacao(int qtdVacinas) {
		setQtdVacinas(qtdVacinas);
	}
	
	public void vacinar(int qtdPessoas, int idade) {
		// Para continuar, tem que se encaixar na faixa de idade!
		if (idade >= getfaixaEtariaInicio() && idade <= getfaixaEtariaFim()) {
			
			/* Só pode vacinar se existir vacinas, e se o restante que falta para ser 
			 * vacinado for menor ou igual a quantidade de pessoas não vacinadas */
			if (getQtdVacinas() > 0 && qtdPessoas <= getPessoasNaoVacinadas()) {
				setPessoasVacinadas(qtdPessoas + getPessoasVacinadas());
				setQtdVacinas(getQtdVacinas() - qtdPessoas);
			} else {
				System.out.println("fail: a quantidade de pessoas informada utrapassa a quantidade de vacinas disponíveis ");
			}
		} else {
			System.out.println("fail: não é possível vacinar, a idade não se encaixa dentro da faixa etária!");
		}
	}

	public int getQtdPopulacao() {
		return this.qtdPopulacao;
	}
	
	public void setQtdPopulacao(int qtd) {
		this.qtdPopulacao = qtd;
	}

	public int getfaixaEtariaInicio() {
		return this.faixaEtariaInicio;
	}
	
	public void setfaixaEtariaInicio(int faixa) {
		this.faixaEtariaInicio = faixa;
	}

	public int getfaixaEtariaFim() {
		return this.faixaEtariaFim;
	}
	
	public void setfaixaEtariaFim(int faixa) {
		this.faixaEtariaFim = faixa;
	}

	public int getPorcengemVacinados() {		
		porcentagemVacinados = (100 * getPessoasVacinadas()) / getQtdPopulacao();
		return this.porcentagemVacinados;
	}
	
	public int getPorcengemNaoVacinados() {
		porcentagemNaoVacinados = 100 - getPorcengemVacinados();
		return this.porcentagemNaoVacinados;
	}
	
	public int getPessoasVacinadas() {
		return this.pessoasVacinadas;
	}
	
	public void setPessoasVacinadas(int pessoas) {
		this.pessoasVacinadas = pessoas;
	}
	
	public int getPessoasNaoVacinadas() {
		pessoasNaoVacinadas = getQtdPopulacao() - getPessoasVacinadas();
		return this.pessoasNaoVacinadas;
	}
	
	public void getPainelDados() {
		System.out.println("----------------------------- Painel -------------------------------------");
		System.out.println("\t\tFaixa etária: " + getfaixaEtariaInicio() + " anos à "+ getfaixaEtariaFim() + " anos");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Total de Vacinas:\t" + getQtdVacinas() + "\t| População:\t\t\t" + getQtdPopulacao());
		System.out.println("Pessoas vacinadas:\t" + getPessoasVacinadas() + "\t| Pessoas não vacinadas:\t" + getPessoasNaoVacinadas());
		System.out.println("Vacinados:\t\t" + getPorcengemVacinados() + "%" + "\t| Não vacinados:\t\t" + getPorcengemNaoVacinados() + "%");
		System.out.println("--------------------------------------------------------------------------");
	}
}
