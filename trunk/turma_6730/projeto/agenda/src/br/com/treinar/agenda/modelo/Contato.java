package br.com.treinar.agenda.modelo;

import java.util.Date;

public class Contato {

	private Long id;
	private String nome;
	private String email;
	private String endereco;
	private Date dataNascimento;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", email=" + email
				+ ", endereco=" + endereco + ", dataNascimento="
				+ dataNascimento + "]";
	}
	
}
