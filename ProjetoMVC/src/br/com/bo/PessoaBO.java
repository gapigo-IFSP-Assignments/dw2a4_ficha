package br.com.bo;

import br.com.bean.PessoaBean;
import br.com.dao.PessoaDAO;

public class PessoaBO {
	
	public String inserePessoa(String nome, String email) {
		
		try {	
			PessoaBean pessoaBean = new PessoaBean(nome, email);
			PessoaDAO pessoaDao = new PessoaDAO();
			
			if(pessoaDao.insert(pessoaBean)) {
				return "saida.jsp";
			} else {
				return "entrada.jsp";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "entrada.jsp";
		}
		
	}

}
