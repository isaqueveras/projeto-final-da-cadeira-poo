package Controle;

/**
 * @author Isaque Véras
 */
public class Pessoa {
	private String nome;
	private int idade;
	private String bairro;
	
	public Pessoa(String nome, int idade, String bairro) {
		this.nome = nome;
		this.idade = idade;
		this.bairro = bairro;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getBairro() {
		return this.bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}
