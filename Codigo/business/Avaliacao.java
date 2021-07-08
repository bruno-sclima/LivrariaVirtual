package business;

public class Avaliacao {
	public static final int MAX_AVAL = 5;
	private Cliente cliente;
	private int nota;
	private Livro livro;
	private String comentario;
	
	
	public Avaliacao(Cliente cliente, int nota, Livro livro, String comentario) throws ExcecaoNotaInvalida {
		this.setCliente(cliente);
		this.setNota(nota);
		this.setLivro(livro);
		this.setComentario(comentario);
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) throws ExcecaoNotaInvalida {
		if(nota >= 0 && nota <= MAX_AVAL) {
			this.nota = nota;
		}
		else throw new ExcecaoNotaInvalida(nota);
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	

}
