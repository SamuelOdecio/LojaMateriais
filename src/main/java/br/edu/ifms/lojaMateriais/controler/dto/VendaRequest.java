package br.edu.ifms.lojaMateriais.controler.dto;

public class VendaRequest {

	private String cliente;
	private int parcelas;
	
	
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
