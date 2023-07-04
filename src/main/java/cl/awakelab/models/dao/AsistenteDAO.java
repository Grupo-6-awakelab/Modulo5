package cl.awakelab.models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.models.cnn.Conexion;
import cl.awakelab.models.dto.Asistente;

public class AsistenteDAO implements IAsistente {

	@Override
	public void create(Asistente a) {
		String sql = "insert into asistente (capacitacion_id, usuario_id) values ('" + a.getCapacitacionId() + "', '" + a.getUsuarioId() + "')";
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
	public List<Asistente> read() {
List<Asistente> lista = new ArrayList<Asistente>();
		
		try {
			
			Connection conn = Conexion.getConexion();
			
			Statement statement = conn.createStatement();
			String sql = "select capacitacion_id, usuario_id from asistente";
			
			ResultSet result = statement.executeQuery(sql);
			
			while (result.next()) {
				Asistente a = new Asistente();
				a.setCapacitacionId(result.getInt("capacitacion_id"));
				a.setUsuarioId(result.getInt("usuario_id"));
								
				lista.add(a);
			}
			
		} catch (SQLException e) {
			System.out.println("Error en el método read()");
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public Asistente read(int id) {
Asistente asistente = null;
		
		try {
			
			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();
			String sql = "select capacitacion_id, usuario_id from asistente where capacitacion_id = " + id;
			
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				asistente = new Asistente(
						rs.getInt("capacitacion_id"), 
						rs.getInt("usuario_id")			
						);
			}			
			
		} catch (SQLException e) {
			System.out.println("Error en el método read(id)");
			e.printStackTrace();
		}
		
		return asistente;
	}

	@Override
	public void update(Asistente a) {
String sql = "update asistente set run = '" + a.getCapacitacionId() + "', capacitacion_id = '" + a.getUsuarioId() + "', usuario_id = '" + "' where capacitacion_id = " + a.getCapacitacionId();
		
		try {
			
			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();
			
			System.out.println(sql);
			statement.execute(sql);
			
			
		} catch (SQLException e) {
			System.out.println("Error en método update");
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		String sql = "delete from asistente where capacitacion_id = " + id;
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
