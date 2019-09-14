package br.com.lp2.vendedor.comum.VO;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Pedido extends Entidade {

	private String dataAbertura;
	private List<Produto> listaProdutos;
	private Cliente cliente;
	private Funcionario funcionario;

	public Pedido() {
		this.dataAbertura = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
	}

	public Pedido(String nome, List<Produto> listaProdutos, Cliente cliente, Funcionario usuario) {
		super(nome);
		this.dataAbertura = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		this.listaProdutos = listaProdutos;
		this.cliente = cliente;
		this.funcionario = usuario;
	}

	public Pedido(int id, String nome, List<Produto> listaProdutos, Cliente cliente, Funcionario usuario) {
		super(id, nome);
		this.dataAbertura = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		this.listaProdutos = listaProdutos;
		this.cliente = cliente;
		this.funcionario = usuario;
	}

	public Pedido(int id, String nome, String data, List<Produto> listaProdutos, Cliente cliente,
			Funcionario usuario) {
		super(id, nome);
		this.dataAbertura = data;
		this.listaProdutos = listaProdutos;
		this.cliente = cliente;
		this.funcionario = usuario;
	}

	public String toString() {
		return "Id: " + getId() + "\nNome: " + getNome() + "\nData de abertura: " + this.dataAbertura + "\nCliente: "
				+ this.cliente.getNome() + "\nFuncionario: " + this.funcionario.getNome() + "\nQuantidade de produtos: "
				+ this.listaProdutos.size();
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String data) {
		this.dataAbertura = data;
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
