package br.edu.unoesc.smo.aulaOO.questaoFinal;

public class DescontoVinteCincoPorcento implements RegraCalculoValor {

	@Override
	public Double calcular(Produto produto) {
		// TODO Auto-generated method stub
		return (produto.getValorUnitario()) - (produto.getValorUnitario() * 0.25);
	}

}
