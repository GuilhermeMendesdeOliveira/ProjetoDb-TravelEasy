package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer cliente_ID;
	private String nome;
	private Integer cpf;
	private String email;
	private Integer telefone;
	
	public Cliente() {
	}

	public Cliente(Integer cliente_ID, String nome, Integer cpf, String email, Integer telefone) {
		super();
		this.cliente_ID = cliente_ID;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}

	public Integer getCliente_ID() {
		return cliente_ID;
	}

	public void setCliente_ID(Integer cliente_ID) {
		this.cliente_ID = cliente_ID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente_ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cliente_ID, other.cliente_ID);
	}

	@Override
	public String toString() {
		return "Cliente \nCliente_ID = " + cliente_ID + "\nNome = " + nome + "\nCPF = " + cpf + "\nEmail = " + email
				+ "\nTelefone = " + telefone;
	}
}
