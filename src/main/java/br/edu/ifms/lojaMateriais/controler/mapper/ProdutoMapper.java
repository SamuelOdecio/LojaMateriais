package br.edu.ifms.lojaMateriais.controler.mapper;

import br.edu.ifms.lojaMateriais.controler.dto.ProdutoRequest;
import br.edu.ifms.lojaMateriais.controler.dto.ProdutoResponse;
import br.edu.ifms.lojaMateriais.model.dto.ProdutoDto;

public class ProdutoMapper {

	public static ProdutoDto requestToDto( ProdutoRequest produtoRequest ) {
		ProdutoDto produtoDto = new ProdutoDto();
		produtoDto.setNome( produtoRequest.getNome() );
		produtoDto.setDescricao(produtoDto.getDescricao());
		produtoDto.setMarca(produtoDto.getMarca());
		produtoDto.setPreco(produtoDto.getPreco());

		return produtoDto;
	}
	
	public static ProdutoResponse dtoToResponse( ProdutoDto vendaDto ) {
		ProdutoResponse produtoResponse = new ProdutoResponse();
		produtoResponse.setCliente(vendaDto.getNome());
		produtoResponse.setDescricao(vendaDto.getDescricao());
		produtoResponse.setMarca(produtoResponse.getMarca());
		produtoResponse.setPreco(produtoResponse.getPreco());

		return produtoResponse;
	}

}