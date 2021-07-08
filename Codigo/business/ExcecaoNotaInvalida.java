package business;

public class ExcecaoNotaInvalida extends Exception{

	private static final long serialVersionUID = 1L;
	private int nota;
	public ExcecaoNotaInvalida(int nota) {
		super("Uma avaliação não pode receber a nota: "+ nota);
		this.setNota(nota);
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	

}
