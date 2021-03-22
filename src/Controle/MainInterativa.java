package Controle;

import java.util.Scanner;

/**
 * @author Isaque Véras
 */
public class MainInterativa {
	public static void main(String[] args) {
		Aplicacao app = new Aplicacao(0);
		
		Scanner sc = new Scanner(System.in);
	    boolean end = false;
	
	    while(!end){
	      String line = sc.nextLine();
	      String[] cmd = line.split(" ");
	      String comando = cmd[0];
	     
	      switch(comando){
	      	case "/addPessoa":
	      		String nome = cmd[1];
	      		int idade = Integer.parseInt(cmd[2]);
	      		String bairro = cmd[3];
	        	
	        	app.addPessoa(new Pessoa(nome, idade, bairro));
	        	break;
	      	case "/listarPessoas":
	      		app.listarPessoas();
	        	break;
	      	case "/addVacina":
	      		String nomeVacina = cmd[1];
	      		String descVacina = cmd[2];
	      		int qtdVacina = Integer.parseInt(cmd[3]);
	      		int faixaInicioVacina = Integer.parseInt(cmd[4]);
	      		int faixaFimVacina = Integer.parseInt(cmd[5]);
	      		
	      		Vacina va = new Vacina(app.getQtdPopulacao());
	    		va.setQtdVacinas(qtdVacina);
	    		va.setNome(nomeVacina);
	    		va.setDescricao(descVacina);
	    		va.setfaixaEtariaInicio(faixaInicioVacina);
	    		va.setfaixaEtariaFim(faixaFimVacina);
	    		app.adicionarVacina(va);
	    		
	        	break;
	      	case "/editVacina":
	      		int index = Integer.parseInt(cmd[1]);
	      		String nomeVacina1 = cmd[2];
	      		String descVacina1 = cmd[3];
	      		int qtdVacina1 = Integer.parseInt(cmd[4]);
	      		int faixaInicioVacina1 = Integer.parseInt(cmd[5]);
	      		int faixaFimVacina1 = Integer.parseInt(cmd[6]);
	      		
	      		Vacina va1 = new Vacina(app.getQtdPopulacao());
	    		va1.setQtdVacinas(qtdVacina1);
	    		va1.setNome(nomeVacina1);
	    		va1.setDescricao(descVacina1);
	    		va1.setfaixaEtariaInicio(faixaInicioVacina1);
	    		va1.setfaixaEtariaFim(faixaFimVacina1);
	    		app.editarVacina(index, va1);
	    		
	        	break;
	      	case "/listarVacinas":
	      		app.listarVacinas();
	        	break;
	      	case "/vacinar":
	      		int indexP = Integer.parseInt(cmd[1]);
	      		int indexV = Integer.parseInt(cmd[2]);
	      		app.vacinar(indexP, indexV);

	      		break;
	      	case "/painel":
	      		int indexPainel = Integer.parseInt(cmd[1]);
	    		app.getPainelDadosVacina(indexPainel);

	      		break;
	      	case "/relatorio":
	      		app.getPainelGeral();
	        	break;
	      	case "/fim":
	        	break;
	      }
	    }
		
	}
}
