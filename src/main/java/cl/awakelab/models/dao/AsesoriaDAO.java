package cl.awakelab.models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.models.cnn.Conexion;
import cl.awakelab.models.dto.Accidente;
import cl.awakelab.models.dto.Asesoria;

public class AsesoriaDAO implements IAsesoria {

	@Override
	public void create(Asesoria a) {

		String sql = "insert into accidente (nombre, detalle, profesional_id, cliente_id) values ('" + a.getNombre()
				+ "', '" + a.getDetalle() + "', '" + a.getProfesionalId() + "', '" + a.getClienteId() + "')";
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
	public List<Asesoria> read() {
		List<Asesoria> lista = new ArrayList<Asesoria>();

		try {

			Connection conn = Conexion.getConexion();

			Statement statement = conn.createStatement();
			String sql = "select id, nobmre, detalle, profesional_id, cliente_id";

			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {
				Asesoria a = new Asesoria();
				a.setId(result.getInt("id"));
				a.setNombre(result.getString("nombre"));
				a.setDetalle(result.getString("detalle"));
				a.setProfesionalId(result.getInt("profesional_id"));
				a.setClienteId(result.getInt("cliente_id"));

				lista.add(a);
			}

		} catch (SQLException e) {
			System.out.println("Error en el método read()");
			e.printStackTrace();
		}

		return lista;

	}

	@Override
	public Asesoria read(int id) {
		Asesoria asesoria = null;

		try {

			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();
			String sql = "select id, nombre, detalle, profesional_id, cliente_id from asesoria where id = " + id;

			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				asesoria = new Asesoria(rs.getInt("id"), rs.getString("nombre"), rs.getString("detalle"),
						rs.getInt("profesional_id"), rs.getInt("cliente_id"));

			}

		} catch (SQLException e) {
			System.out.println("Error en el método read(id)");
			e.printStackTrace();
		}

		return asesoria;
	}

	@Override
	public void update(Asesoria a) {
		String sql = "update asesoria set nombre = '" + a.getNombre() + "',  detalle = '" + a.getDetalle()
				+ "', profesional_id = '" + a.getProfesionalId() + "', cliente_id = '" + a.getClienteId()
				+ "',where id = " + a.getId();

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
		String sql = "delete from aseosria where id = " + id;
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
