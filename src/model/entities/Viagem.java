package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Viagem implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer viagem_ID;
	private String origem;
	private String destino;
	
	private Cliente cliente;
	
	public Viagem() {
	}

	public Viagem(Integer viagem_ID, String origem, String destino, Cliente cliente) {
		this.viagem_ID = viagem_ID;
		this.origem = origem;
		this.destino = destino;
		this.cliente = cliente;
	}

	public Integer getViagem_ID() {
		return viagem_ID;
	}

	public void setViagem_ID(Integer viagem_ID) {
		this.viagem_ID = viagem_ID;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(viagem_ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Viagem other = (Viagem) obj;
		return Objects.equals(viagem_ID, other.viagem_ID);
	}

	@Override
	public String toString() {
		return "viagem \nviagem_ID = " + viagem_ID + ", origem = " + origem + ", destino = " + destino + ", cliente = " + cliente;
	}
	
	
	
	
	
}
