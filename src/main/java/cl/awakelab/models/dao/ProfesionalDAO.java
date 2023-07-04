package cl.awakelab.models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.models.cnn.Conexion;
import cl.awakelab.models.dto.Profesional;

public class ProfesionalDAO implements IProfesional {

    @Override
    public void create(Profesional p) {
        String sql = "INSERT INTO profesional (run, nombre, apellido, correo, telefono, cargo, usuario_id) VALUES ('"
                + p.getRun() + "', '" + p.getNombre() + "', '" + p.getApellido() + "', '" + p.getCorreo() + "', '"
                + p.getTelefono() + "', '" + p.getCargo() + "', " + p.getUsuarioId() + ")";
        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            System.out.println("Error en método create");
            e.printStackTrace();
        }
    }

    @Override
    public List<Profesional> read() {
        List<Profesional> lista = new ArrayList<>();

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            String sql = "SELECT id, run, nombre, apellido, correo, telefono, cargo, usuario_id FROM profesional";
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Profesional p = new Profesional();
                p.setId(result.getInt("id"));
                p.setRun(result.getString("run"));
                p.setNombre(result.getString("nombre"));
                p.setApellido(result.getString("apellido"));
                p.setCorreo(result.getString("correo"));
                p.setTelefono(result.getString("telefono"));
                p.setCargo(result.getString("cargo"));
                p.setUsuarioId(result.getInt("usuario_id"));
                lista.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Error en el método read()");
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public Profesional read(int id) {
        Profesional profesional = null;

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            String sql = "SELECT id, run, nombre, apellido, correo, telefono, cargo, usuario_id FROM profesional WHERE id = "
                    + id;
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                profesional = new Profesional(rs.getInt("id"), rs.getString("run"), rs.getString("nombre"),
                        rs.getString("apellido"), rs.getString("correo"), rs.getString("telefono"),
                        rs.getString("cargo"), rs.getInt("usuario_id"));
            }

        } catch (SQLException e) {
            System.out.println("Error en el método read(id)");
            e.printStackTrace();
        }

        return profesional;
    }

    @Override
    public void update(Profesional p) {
        String sql = "UPDATE profesional SET run = '" + p.getRun() + "', nombre = '" + p.getNombre() + "', apellido = '"
                + p.getApellido() + "', correo = '" + p.getCorreo() + "', telefono = '" + p.getTelefono() + "', cargo = '"
                + p.getCargo() + "', usuario_id = " + p.getUsuarioId() + " WHERE id = " + p.getId();

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            System.out.println("Error en método update");
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM profesional WHERE id = " + id;
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