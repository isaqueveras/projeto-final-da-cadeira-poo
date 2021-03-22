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
	
}
