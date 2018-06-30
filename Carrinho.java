package br.edu.unoesc.smo.aulaOO.questaoFinal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carrinho {
	private List<Produto> produtos;

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void adicionarProduto(Produto produto, int quantidade) {
		if (produtos == null) {
			produtos = new ArrayList<>();
		}

		for (int i = 1; i <= quantidade; i++) {
			produtos.add(produto);
		}
	}

	public void removerProduto(Produto produto) {
		if (produtos != null) {
			produtos.remove(produto);
		}
	}

	public Double calcularValorTotal() {
		return produtos.stream().mapToDouble(Produto::getValor).sum();
	}

	private class CompararValorUnitarioCrescentemente implements Comparator<Produto> {
		@Override
		public int compare(Produto o1, Produto o2) {
			if (o1.getValor() > o2.getValor()) {
				return 1;
			} else if (o1.getValor() < o2.getValor()) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	private class CompararValorUnitarioDecrescentemente implements Comparator<Produto> {
		@Override
		public int compare(Produto o1, Produto o2) {
			if (o1.getValor() < o2.getValor()) {
				return 1;
			} else if (o1.getValor() > o2.getValor()) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	public void ordenarProdutosPeloValorUnitarioCrescentemente() {
		produtos.sort(new CompararValorUnitarioCrescentemente());
	}

	public void ordenarProdutosPeloValorUnitarioDecrescentemente() {
		produtos.sort(new CompararValorUnitarioDecrescentemente());
	}
}
