package br.edu.unoesc.smo.aulaOO.questaoFinal;

public class DescontoCincoPorcento implements RegraCalculoValor {

	@Override
	public Double calcular(Produto produto) {
		return (produto.getValorUnitario()) - (produto.getValorUnitario() * 0.05);
	}

}
