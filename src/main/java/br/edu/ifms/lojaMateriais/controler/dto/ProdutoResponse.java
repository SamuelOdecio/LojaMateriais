package br.edu.ifms.lojaMateriais.controler.dto;

import java.time.Instant;
import java.util.UUID;

public class ProdutoResponse {

	private String nome;
	private String descricao;
	private String marca;
	private double preco;
	private UUID id;
	private Instant dtCadastro;
	private Instant dtAtualizacao;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Instant getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(Instant dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	public Instant getDtAtualizacao() {
		return dtAtualizacao;
	}
	public void setDtAtualizacao(Instant dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}
	public String getCliente() {
		return nome;
	}
	public void setCliente(String cliente) {
		this.nome = cliente;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
