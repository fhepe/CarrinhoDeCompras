package br.edu.unoesc.smo.aulaOO01.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.unoesc.smo.aulaOO.questaoFinal.Carrinho;
import br.edu.unoesc.smo.aulaOO.questaoFinal.Produto;
import br.edu.unoesc.smo.aulaOO.questaoFinal.TipoProduto;

public class CarrinhoTest {

	@Test
	public void deveAdicionarUmProdutoAoCarinho() {
		Produto produto = new Produto("Camisa social", 90.00, TipoProduto.VESTUARIO);

		Carrinho carrinho = new Carrinho();
		carrinho.adicionarProduto(produto, 1);
		assertEquals(1, carrinho.getProdutos().size());
	}

	@Test
	public void deveAdicionarDoisProdutosAoCarinho() {
		Produto produto = new Produto("Camisa social", 90.00, TipoProduto.VESTUARIO);

		Carrinho carrinho = new Carrinho();
		carrinho.adicionarProduto(produto, 2);
		assertEquals(2, carrinho.getProdutos().size());
	}

	@Test
	public void deveAplicarDescontoDeCincoPorcento() {
		Produto produtoBebida = new Produto("Cerveja SOL", 5.00, TipoProduto.BEBIDA);

		assertEquals(Double.valueOf(4.75), produtoBebida.getValor());
	}

	@Test
	public void deveAplicarDescontoDeVinteCincoPorcento() {
		Produto produtoVestuario = new Produto("Camisa social", 90.00, TipoProduto.VESTUARIO);

		assertEquals(Double.valueOf(67.50), produtoVestuario.getValor());
	}

	@Test
	public void totalizarValorDeDoisProdutos() {
		Produto produtoVestuario = new Produto("Camisa social", 90.00, TipoProduto.VESTUARIO);

		Produto produtoBebida = new Produto("Cerveja SOL", 5.00, TipoProduto.BEBIDA);

		Carrinho carrinho = new Carrinho();
		carrinho.adicionarProduto(produtoVestuario, 1);
		carrinho.adicionarProduto(produtoBebida, 1);

		assertEquals(Double.valueOf(72.25), carrinho.calcularValorTotal());
	}

	@Test
	public void deveOrdenarCarrinhoPeloValorCrescentemente() {
		Produto produtoVestuario = new Produto("Camisa social", 90.00, TipoProduto.VESTUARIO);

		Produto produtoBebida = new Produto("Cerveja SOL", 5.00, TipoProduto.BEBIDA);

		Carrinho carrinho = new Carrinho();
		carrinho.adicionarProduto(produtoVestuario, 1);
		carrinho.adicionarProduto(produtoBebida, 2);
		carrinho.ordenarProdutosPeloValorUnitarioCrescentemente();

		assertEquals(Double.valueOf(4.75), carrinho.getProdutos().get(0).getValor());
		assertEquals(Double.valueOf(4.75), carrinho.getProdutos().get(1).getValor());
		assertEquals(Double.valueOf(67.50), carrinho.getProdutos().get(2).getValor());
	}

	@Test
	public void deveOrdenarCarrinhoPeloValorDecrescentemente() {
		Produto produtoBebida = new Produto("Cerveja SOL", 5.00, TipoProduto.BEBIDA);
		Produto produtoVestuario = new Produto("Camisa social", 90.00, TipoProduto.VESTUARIO);

		Carrinho carrinho = new Carrinho();
		carrinho.adicionarProduto(produtoVestuario, 1);
		carrinho.adicionarProduto(produtoBebida, 2);
		carrinho.ordenarProdutosPeloValorUnitarioDecrescentemente();

		assertEquals(Double.valueOf(67.50), carrinho.getProdutos().get(0).getValor());
		assertEquals(Double.valueOf(4.75), carrinho.getProdutos().get(1).getValor());
		assertEquals(Double.valueOf(4.75), carrinho.getProdutos().get(2).getValor());
	}
}
