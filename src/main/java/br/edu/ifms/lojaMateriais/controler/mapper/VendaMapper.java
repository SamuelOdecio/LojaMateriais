package br.edu.ifms.lojaMateriais.controler.mapper;

import br.edu.ifms.lojaMateriais.controler.dto.VendaRequest;
import br.edu.ifms.lojaMateriais.controler.dto.VendaResponse;
import br.edu.ifms.lojaMateriais.model.dto.VendaDto;

public class VendaMapper {

	public static VendaDto requestToDto( VendaRequest vendaRequest ) {
		VendaDto vendaDto = new VendaDto();
		vendaDto.setCliente( vendaRequest.getCliente() );
		vendaDto.setParcelas( vendaRequest.getParcelas() );

		return vendaDto;
	}
	
	public static VendaResponse dtoToResponse( VendaDto vendaDto ) {
		VendaResponse vendaResponse = new VendaResponse();
		vendaResponse.setCliente(vendaDto.getCliente());
		vendaResponse.setParcelas(vendaDto.getParcelas());

		return vendaResponse;
		
}
}
