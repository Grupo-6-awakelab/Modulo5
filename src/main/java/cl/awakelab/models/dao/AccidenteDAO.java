package cl.awakelab.models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.sql.Statement;
import java.util.ArrayList;
import cl.awakelab.models.cnn.Conexion;
import cl.awakelab.models.dto.Accidente;

public class AccidenteDAO implements IAccidente {

	@Override
	public void create(Accidente a) {

		String sql = "insert into accidente (client_id, fecha_accidente, detalle) values ('" + a.getClienteId()
				+ "', '" + a.getFechaAccidente() + "', '" + a.getDetalle() + "')";
		try {

			Connection cnn = Conexion.getConexion();
			Statement st = cnn.createStatement();
			st.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error en método create");
			e.printStackTrace();
		}

	}

	@Override
	public List<Accidente> read() {
		List<Accidente> lista = new ArrayList<Accidente>();

		try {

			Connection conn = Conexion.getConexion();

			Statement statement = conn.createStatement();
			String sql = "select id, cliente_id, fecha_accidente, detalle from accidente";

			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {
				Accidente a = new Accidente();
				a.setId(result.getInt("id"));
				a.setClienteId(result.getInt("cliente_id"));
				a.setFechaAccidente(result.getDate("fecha_accidente"));
				a.setDetalle(result.getString("detalle"));

				lista.add(a);
			}

		} catch (SQLException e) {
			System.out.println("Error en el método read()");
			e.printStackTrace();
		}

		return lista;

	}

	@Override
	public Accidente read(int id) {
		Accidente accidente = null;

		try {

			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();
			String sql = "select id, cliente_id, fecha_accidente from accidente where id = " + id;

			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				accidente = new Accidente(rs.getInt("id"), rs.getInt("cliente_id"), rs.getDate("fecha_accidente"),
						rs.getString("detalle"));
			}

		} catch (SQLException e) {
			System.out.println("Error en el método read(id)");
			e.printStackTrace();
		}

		return accidente;

	}

	@Override
	public void update(Accidente a) {
		String sql = "update accidente set cliente_id = '" + a.getClienteId() + "',  fecha_accidente = '" + a.getFechaAccidente()
				+ "', detalle = '"+ a.getDetalle() +"', where actor_id = " + a.getId();

		try {

			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();

			System.out.println(sql);
			statement.execute(sql);

		} catch (SQLException e) {
			System.out.println("Erorr en método update");
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		String sql = "delete from accidente where id = " + id;
		try {
		
			Connection conn = Conexion.getConexion();
			Statement st = conn.createStatement();
			st.execute(sql);
			
		} catch (SQLException e) {
			System.out.println("Error en método delete");
			e.printStackTrace();
		}
		
	}
}

