package br.edu.unidep.descontoprotese.model;

import br.edu.unidep.descontoprotese.repositorio.DescontoProtese;

public class Paciente implements DescontoProtese{
	
	private String nome;
	private String situacao;
	private Integer idade;
	private Double renda;
	
	public Paciente() {
	}
	
	public Paciente(String nome, String situacao, Integer idade, Double renda) {
		this.nome = nome;
		this.situacao = situacao;
		this.idade = idade;
		this.renda = renda;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSituacao() {
		return situacao;
	}


	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public Double getRenda() {
		return renda;
	}


	public void setRenda(Double renda) {
		this.renda = renda;
	}


	@Override
	public void calculaDescontoProtese(double valor) {
		if (renda <= 500) {
			situacao = "PRÓTESE GRATUITA!!";
		}
		else if (renda <= 2000) {
			situacao = "DESCONTO DE 50%! TOTAL DESCONTO = R$ " + valor / 2;
		}
		else {
			situacao = "VALOR INTEGRAL. SEM DESCONTOS!";
		}
	}
	
	@Override
	public String toString() {
		return "\nNome do Paciente: " + nome + "\n" + "Situação: " + situacao + "\n" + "Idade: " + idade + "\n" + "Renda R$: " + renda + "\n";
	}
}
