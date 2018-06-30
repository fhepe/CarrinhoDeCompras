package br.edu.unoesc.smo.aulaOO.questaoFinal;

public enum TipoProduto {
	BEBIDA(new DescontoCincoPorcento()), VESTUARIO(new DescontoVinteCincoPorcento());

	TipoProduto(RegraCalculoValor regraCalculoValorUnitario) {
		this.regraCalculoValor = regraCalculoValorUnitario;
	}

	private RegraCalculoValor regraCalculoValor;

	public Double calcularValor(Produto produto) {
		return regraCalculoValor.calcular(produto);
	}
}
