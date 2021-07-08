package business;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Livro {
	private static final double PCT_DIREITOS =0.08;
	private String titulo;
	private Autor autor;
	private IProduto modalidade;
	private int paginas;
	private double precoBase;
	private List<Avaliacao> avaliacoes;
	
	
	public Livro(String titulo, Autor autor, IProduto modalidade, int paginas, double precoBase) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setModalidade(modalidade);
		this.setPaginas(paginas);
		this.setPrecoBase(precoBase);
		avaliacoes = new ArrayList<Avaliacao>();
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public IProduto getModalidade() {
		return modalidade;
	}
	public void setModalidade(IProduto modalidade) {
		this.modalidade = modalidade;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public double getPrecoBase() {
		return precoBase;
	}
	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}
	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	public void addAvaliacao(Avaliacao a) {
		avaliacoes.add(a);
	}
	public void removeAvaliacao() {
		avaliacoes.remove(0);
	}
	public double precoVenda() {
		
		return modalidade.precoVenda(this) + direitosAutorais();
	}
	public double direitosAutorais() {
		
		return modalidade.precoVenda(this)*PCT_DIREITOS;
		
	}
	public double avaliacaoMedia() {
	
		return this.avaliacoes.stream().mapToDouble((f) -> f.getNota()).average().getAsDouble();
		
	}
	

}
