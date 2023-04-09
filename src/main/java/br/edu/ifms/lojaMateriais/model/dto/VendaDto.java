package br.edu.ifms.lojaMateriais.model.dto;

public class VendaDto {
	private String cliente;
	private int parcelas;
	
	public int getParcelas() {
		return parcelas;
	}
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
}
