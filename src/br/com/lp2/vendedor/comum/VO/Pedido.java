package br.com.lp2.vendedor.comum.VO;

import java.sql.Timestamp;
import java.util.List;

public class Pedido {
	private int id;
	private Timestamp dataAbertura;
	private List<Produto> listaProdutos;
	private Cliente cliente;
	private Funcionario funcionario;
	
	public Pedido() {
		this.dataAbertura = new Timestamp(System.currentTimeMillis());
	}

	public Pedido(int id, 
				List<Produto> listaProdutos, 
				Cliente cliente, 
				Funcionario usuario) {
		super();
		this.id = id;
		this.dataAbertura = new Timestamp(System.currentTimeMillis());
		this.listaProdutos = listaProdutos;
		this.cliente = cliente;
		this.funcionario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDataAbertura() {
		return dataAbertura;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getUsuario() {
		return funcionario;
	}

	public void setUsuario(Funcionario usuario) {
		this.funcionario = usuario;
	}

}
