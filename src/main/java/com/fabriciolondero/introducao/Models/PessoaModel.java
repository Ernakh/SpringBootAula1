package com.fabriciolondero.introducao.Models;

public class PessoaModel 
{
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	private String nome;
	private Integer idade;
	
	public PessoaModel(String nome, Integer idade)
	{
		this.nome = nome;
		this.idade = idade;
	}
	
	public String toString()
	{
		return "Pessoa: (Nome: " + this.nome + ", Idade:" + this.idade + ")";
	}
}
