package br.com.lp2.vendedor.comum.VO;

import br.com.lp2.vendedor.comum.Enums.TipoProduto;

public class Produto extends Entidade{

	private String descricao;
	private double valorUnit;
	private TipoProduto tipoProduto;
	
	public Produto() {}	

	public Produto(int id, String nome, String descricao, double valorUnit, TipoProduto tipoProduto) {
		super(id, nome);
		this.descricao = descricao;
		this.valorUnit = valorUnit;
		this.tipoProduto = tipoProduto;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	};
	
	
	
}
