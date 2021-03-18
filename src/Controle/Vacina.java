package Controle;

/**
 * @author Isaque Véras
 *
 */
public class Vacina {
	private int qtdVacinas = 0;
	private String nome;
	private String descricao;

	public Vacina() {
		
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
}
