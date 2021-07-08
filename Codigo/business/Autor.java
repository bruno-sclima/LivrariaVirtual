package business;

import java.util.ArrayList;
import java.util.List;

public class Autor {
	public String nome;
	private List<Livro> livros;
	public Autor(String nome) {
		this.setNome(nome);
		livros = new ArrayList<Livro>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void removeLivro() {
		livros.remove(0);
	}
	public void addLivro(Livro l) {
		livros.add(l);
	}
	public double direitoAutoral(Livro l) {
		return 0;
		
	}
	

}
