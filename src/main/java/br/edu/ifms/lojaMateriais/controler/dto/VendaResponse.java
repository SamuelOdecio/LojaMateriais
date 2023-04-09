package br.edu.ifms.lojaMateriais.controler.dto;

import java.time.Instant;
import java.util.UUID;


public class VendaResponse {

		private String cliente;
		private int parcelas;
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
			return cliente;
		}
		public void setCliente(String cliente) {
			this.cliente = cliente;
		}
		public int getParcelas() {
			return parcelas;
		}
		public void setParcelas(int parcelas) {
			this.parcelas = parcelas;
		}
		
	
	}

	
