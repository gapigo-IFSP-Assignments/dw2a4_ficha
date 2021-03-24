package br.com.bean;

public class PessoaBean {

	private String nome;
	private String email;
	
	// Construtor completo
	public PessoaBean(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
	// Construtor padrão
	public PessoaBean() {
		
	}
	
	// Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
