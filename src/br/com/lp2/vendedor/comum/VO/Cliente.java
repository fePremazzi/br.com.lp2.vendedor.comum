package br.com.lp2.vendedor.comum.VO;

import java.util.Date;

public class Cliente extends Entidade {

	private String dataNascimento;
	private String cpf;
	private String endereco;

	public Cliente() {
		super();
	}

	public Cliente(String nome, String dataNascimento, String cpf, String endereco) {
		super(nome);
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public Cliente(int id, String nome, String dataNascimento, String cpf, String endereco) {
		super(id, nome);
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String toString() {
		return "Id: " + getId() + "\nNome: " + getNome() + "\nData de nascimento: " + this.dataNascimento + "\nCPF: "
				+ this.cpf + "\nEndereco: " + this.endereco;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
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
