package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.ViagemDao;
import model.entities.Cliente;
import model.entities.Viagem;

public class ViagemDaoJDBC implements ViagemDao {
	
	private Connection conn;
	
	public ViagemDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Viagem obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Viagem obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByID(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Viagem findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"select cliente.*, V.origem, V.destino, V.codigo_linha, LA.nome "
					+ "FROM cliente "
					+ "INNER JOIN viagem V ON V.viagem_ID = cliente.viagem_ID "
					+ "INNER JOIN linha_aerea LA ON LA.linha_id = V.codigo_linha "
					+ "WHERE cliente_ID = ? ");
			
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Cliente cliente = instantiateCliente(rs);
				Viagem viagem = instantiateViagem(rs, cliente);
				return viagem;
			}
			return null;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
		
		
		
	}

	private Viagem instantiateViagem(ResultSet rs, Cliente cliente) throws SQLException {
		Viagem viagem = new Viagem();
		viagem.setViagem_ID(rs.getInt("viagem_ID"));
		viagem.setOrigem(rs.getString("origem"));
		viagem.setDestino(rs.getString("destino"));
		viagem.setCliente(cliente);
		return viagem;
	}

	private Cliente instantiateCliente(ResultSet rs) throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setCliente_ID(rs.getInt("cliente_ID"));
		cliente.setNome(rs.getString("nome"));
		cliente.setCpf(rs.getInt("cpf"));
		cliente.setEmail(rs.getString("email"));
		cliente.setTelefone(rs.getInt("telefone"));
		return cliente;
	}

	@Override
	public List<Viagem> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
