package br.com.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.bean.PessoaBean;

public class PessoaDAO {
	
	public static List<PessoaBean> lista = null;
	
	public PessoaDAO() {
		
		if(lista == null) {
			lista = new ArrayList<PessoaBean>();
			PessoaBean pessoaBean = new PessoaBean("Alexandre", "alexandre@email.com");
			lista.add(pessoaBean);
		}
		
	}
	
	public boolean insert(PessoaBean pessoaBean) throws Exception {
		
		lista.add(pessoaBean);
		return true;
	}
}
