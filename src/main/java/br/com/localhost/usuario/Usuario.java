package br.com.localhost.usuario;

import java.io.Serializable;

public abstract class Usuario implements Serializable {

	private static final long serialVersionUID = 5394881585608872480L;
	private String nome;
	private String usuario;
	private String senha;
	private String cpf;
	
	public Usuario(String nome, String usuario, String senha, String cpf) {
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String getCpf() {
		return cpf;
	}
	
}
