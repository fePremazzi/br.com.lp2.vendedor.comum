package br.com.lp2.vendedor.comum.VO;

import java.util.Date;

public class Cliente extends Entidade {

	private Date dataNascimento;
	private String cpf;
	private String endereco;

	public Cliente() {
		super();
	}

	public Cliente(int id, String nome, Date dataNascimento, String cpf, String endereco) {
		super(id, nome);
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
