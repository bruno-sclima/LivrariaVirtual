package business;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Avaliacao> avaliacoes;
	
	public Cliente(String nome) {
		this.setNome(nome);
		avaliacoes = new ArrayList<Avaliacao>();
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void addAvaliacao(Avaliacao a) {
		avaliacoes.add(a);
	}
	public void removeAvaliacao() {
		avaliacoes.remove(0);
	}
	
}
