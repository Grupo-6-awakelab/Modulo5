package cl.awakelab.models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cl.awakelab.models.cnn.Conexion;
import cl.awakelab.models.dto.Administrativo;
import java.sql.Statement;
import java.util.ArrayList;

public class AdministrativoDAO implements IAdministrativo{

	@Override
	public void create(Administrativo a) {
		String sql = "insert into administrativo (run, nombre, apellido, correo, area, usuario_id) values ('" + a.getRun() + "', '" + a.getApellido() + a.getCorreo() + "', '" + a.getArea() + "', '" + a.getUsuarioId() +  "')";
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
	public List<Administrativo> read() {
List<Administrativo> lista = new ArrayList<Administrativo>();
		
		try {
			
			Connection conn = Conexion.getConexion();
			
			Statement statement = conn.createStatement();
			String sql = "select id, run, nombre, apellido, correo, area, usuario_id from administrativo";
			
			ResultSet result = statement.executeQuery(sql);
			
			while (result.next()) {
				Administrativo a = new Administrativo();
				a.setId(result.getInt("id"));
				a.setRun(result.getString("run"));
				a.setNombre(result.getString("nombre"));
				a.setApellido(result.getString("apellido"));
				a.setCorreo(result.getString("correo"));
				a.setArea(result.getString("area"));
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
	public Administrativo read(int id) {
		Administrativo administrativo = null;
		
		try {
			
			Connection conn = Conexion.getConexion();
			Statement statement = conn.createStatement();
			String sql = "select id, run, nombre, apellido, correo, area, usuario_id from administrativo where id = " + id;
			
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				administrativo = new Administrativo(
						rs.getInt("id"), 
						rs.getString("run"), 
						rs.getString("nombre"),
						rs.getString("apellido"),
						rs.getString("correo"),
						rs.getString("area"),
						rs.getInt("usuario_id")
						
						);
			}			
			
		} catch (SQLException e) {
			System.out.println("Error en el método read(id)");
			e.printStackTrace();
		}
		
		return administrativo;
	}

	@Override
	public void update(Administrativo a) {
String sql = "update administrativo set run = '" + a.getRun() + "', nombre = '" + a.getNombre() + "', apellido = '" + a.getApellido() + "', correo = '" + a.getCorreo() + "', area = '" + a.getArea() + "', usuario_id = '" + a.getUsuarioId() + "' where id = " + a.getId();
		
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
		String sql = "delete from administrativo where id = " + id;
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
