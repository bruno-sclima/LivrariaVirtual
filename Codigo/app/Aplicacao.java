package app;

import business.Autor;
import business.Avaliacao;
import business.Cliente;
import business.ExcecaoNotaInvalida;
import business.Livro;
import business.LivroDigital;
import business.LivroFisico;

public class Aplicacao {
	public static void main(String[]args) {
		Autor a1 = new Autor("Agatha Christie");
		Cliente c1 = new Cliente("Bruno");
		Cliente c2 = new Cliente("João");
		Cliente c3 = new Cliente("Carlos");
		Livro l1 = new Livro("Morte no Nilo",a1,new LivroFisico(9),200,29);
		Livro l2 = new Livro("Corpo na Biblioteca",a1,new LivroDigital(),148,29);
		a1.addLivro(l1);
		a1.addLivro(l2);
		try {
			Avaliacao av = new Avaliacao(c1,4,l1,"Bacana");
			Avaliacao av2 = new Avaliacao(c1,4,l2,"Legal");
			Avaliacao av3 = new Avaliacao(c2,5,l2,"Meu novo favorito");
			Avaliacao av4 = new Avaliacao(c2,0,l2,"Horrível");
			c1.addAvaliacao(av);
			c1.addAvaliacao(av2);
			c2.addAvaliacao(av3);
			c3.addAvaliacao(av4);
			l1.addAvaliacao(av);
			l2.addAvaliacao(av4);
			l2.addAvaliacao(av3);
			l2.addAvaliacao(av2);
		} catch (ExcecaoNotaInvalida e) {
			e.getMessage();
			e.printStackTrace();
		}
		System.out.println("Preço de Venda do "+ l2.getTitulo()+ " é de "+ l2.precoVenda()+" reais");
		System.out.println("Direitos autorais para "+ a1.getNome()+" pelo livro "+l2.getTitulo()+" : "+ l2.direitosAutorais());
		System.out.println("Avaliação Média do livro: "+l2.getTitulo()+" foi: "+l2.avaliacaoMedia());
		
	}

}
