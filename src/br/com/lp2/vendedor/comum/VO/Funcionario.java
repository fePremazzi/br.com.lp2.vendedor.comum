package br.com.lp2.vendedor.comum.VO;

import br.com.lp2.vendedor.comum.Enums.TipoCargo;

public class Funcionario extends Pessoa {
	private TipoCargo cargo;
	private String username;
	private String senha;
	
	public Funcionario() {}
	
	public Funcionario(String nome, int id, TipoCargo cargo, String username, String senha) {
		super(id, nome);
		this.cargo = cargo;
		this.username = username;
		this.senha = senha;
	}
	
	public TipoCargo getCargo() {
		return cargo;
	}
	public void setCargo(TipoCargo cargo) {
		this.cargo = cargo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}


}
