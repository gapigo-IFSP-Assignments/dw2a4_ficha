package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDAO = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("Falckner Domenico dos Santos");
		contato.setFone("(11)99999-9999");
		contato.setEmail("fernandos@hotmail.com");
		
		contatoDAO.save(contato);
		
		while (true) {
		for(Contato c : contatoDAO.getContatos()) {
			System.out.println("Contato: " + c.getNome());
		}
		}
	}

}
