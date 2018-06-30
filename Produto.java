package br.edu.unoesc.smo.aulaOO.questaoFinal;

public class Produto {
	private String descricao;
	private Double valorUnitario;
	private TipoProduto tipoProduto;

	public Produto(String descricao, Double valorUnitario, TipoProduto tipoProduto) {
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.tipoProduto = tipoProduto;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Double getValor() {
		return tipoProduto.calcularValor(this);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
