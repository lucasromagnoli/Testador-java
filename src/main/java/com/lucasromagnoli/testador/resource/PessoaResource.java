package com.lucasromagnoli.testador.resource;

public class PessoaResource {
	private String nome;
	private String cidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		return super.toString()+" -> PessoaResource [nome=" + nome + ", cidade=" + cidade + "]";
	}
	
	
}
