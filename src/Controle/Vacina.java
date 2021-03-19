package Controle;

/**
 * @author Isaque Véras
 */
public class Vacina extends Aplicacao {
	private int qtdVacinas = 0;
	private String nome;
	private String descricao;
	 
	private int faixaEtariaInicio = 0;
	private int faixaEtariaFim = 0;
	private int porcentagemVacinados = 0;
	private int porcentagemNaoVacinados = 0;
	private int pessoasVacinadas = 0;
	private int pessoasNaoVacinadas = 0;

	public Vacina(int qtdPopulacao) {
		super(qtdPopulacao);
	}
	 
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setDescricao(String desc) {
		this.descricao = desc;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public int getQtdVacinas() {
		return this.qtdVacinas;
	}
	
	public void setQtdVacinas(int qtd) {
		this.qtdVacinas = qtd;
	}
	
	public int getPorcentagemVacinasExistente() {
		return 1;
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
	
	/*
	 * public void vacinar(int qtdPessoas, int idade) {
		// Para continuar, tem que se encaixar na faixa de idade!
		if (idade >= getfaixaEtariaInicio() && idade <= getfaixaEtariaFim()) {
			
			/* Só pode vacinar se existir vacinas, e se o restante que falta para ser 
			 * vacinado for menor ou igual a quantidade de pessoas não vacinadas
			if (getQtdVacinas() >= qtdPessoas && qtdPessoas <= getPessoasNaoVacinadas()) {
				setPessoasVacinadas(qtdPessoas + getPessoasVacinadas());
				setQtdVacinas(getQtdVacinas() - qtdPessoas);
			} else {
				// Vacinar o máximo de pessoas que puder..
				setPessoasVacinadas(qtdPessoas - (qtdPessoas - getQtdVacinas())); // input - (input - vacinas) = total
				System.out.println("fail: " + (qtdPessoas - getQtdVacinas()) + " pessoas ficaram sem tomar a vacina");
				System.out.println("fail: a quantidade de pessoas informada utrapassa a quantidade de vacinas disponíveis");
				setQtdVacinas(0);
			}
		} else {
			System.out.println("fail: não é possível vacinar, a idade não se encaixa dentro da faixa etária!");
		}
	} */
	
	public void vacinar(Pessoa pessoa) {
		// Para continuar, tem que se encaixar na faixa de idade!
		if (pessoa.getIdade() >= getfaixaEtariaInicio() && pessoa.getIdade() <= getfaixaEtariaFim()) {
			
			/* Só pode vacinar se existir vacinas, e se o restante que falta para ser 
			 * vacinado for menor ou igual a quantidade de pessoas não vacinadas */
			if (getQtdVacinas() >= 1 && 1 <= getPessoasNaoVacinadas()) {
				setPessoasVacinadas(1 + getPessoasVacinadas());
				setQtdVacinas(getQtdVacinas() - 1);
			} else if (getQtdVacinas() == 0) {
				System.out.println("fail: não é possível vacinar " + pessoa.getNome() + ", pois não tem vacina disponível");
			}else {
				// Vacinar o máximo de pessoas que puder..
				setPessoasVacinadas(1 + getPessoasVacinadas());
				System.out.println("fail: não é possível vacinar " + pessoa.getNome() + ", pois não tem vacina disponível");
				//setQtdVacinas(0);
			}
		} else {
			System.out.println("fail: não é possível vacinar, a idade não se encaixa dentro da faixa etária!");
		}
	}
	
	public void getPainelDados() {
		System.out.println("-------------------------- Vacina "+ getNome() + "----------------------------------");
		System.out.println("\t\tFaixa etária: " + getfaixaEtariaInicio() + " anos à "+ getfaixaEtariaFim() + " anos");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Total de Vacinas:\t" + getQtdVacinas() + "\t| População:\t\t\t" + getQtdPopulacao());
		System.out.println("Pessoas vacinadas:\t" + getPessoasVacinadas() + "\t| Pessoas não vacinadas:\t" + getPessoasNaoVacinadas());
		System.out.println("Vacinados:\t\t" + getPorcengemVacinados() + "%" + "\t| Não vacinados:\t\t" + getPorcengemNaoVacinados() + "%");
		System.out.println("--------------------------------------------------------------------------\n");
	}
}
