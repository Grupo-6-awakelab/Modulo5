package cl.awakelab.models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.models.cnn.Conexion;
import cl.awakelab.models.dto.Chequeo;

public class ChequeoDAO implements IChequeo {

    @Override
    public void create(Chequeo c) {
        String sql = "INSERT INTO chequeo (visita_id, detalle, estado) VALUES (" + c.getVisitaId() + ", '"
                + c.getDetalle() + "', '" + c.getEstado() + "')";
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
    public List<Chequeo> read() {
        List<Chequeo> lista = new ArrayList<>();

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            String sql = "SELECT id, visita_id, detalle, estado FROM chequeo";
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Chequeo c = new Chequeo();
                c.setId(result.getInt("id"));
                c.setVisitaId(result.getInt("visita_id"));
                c.setDetalle(result.getString("detalle"));
                c.setEstado(result.getString("estado"));
                lista.add(c);
            }

        } catch (SQLException e) {
            System.out.println("Error en el método read()");
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public Chequeo read(int id) {
        Chequeo chequeo = null;

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            String sql = "SELECT id, visita_id, detalle, estado FROM chequeo WHERE id = " + id;
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                chequeo = new Chequeo(rs.getInt("id"), rs.getInt("visita_id"), rs.getString("detalle"),
                        rs.getString("estado"));
            }

        } catch (SQLException e) {
            System.out.println("Error en el método read(id)");
            e.printStackTrace();
        }

        return chequeo;
    }

    @Override
    public void update(Chequeo c) {
        String sql = "UPDATE chequeo SET visita_id = " + c.getVisitaId() + ", detalle = '" + c.getDetalle()
                + "', estado = '" + c.getEstado() + "' WHERE id = " + c.getId();

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
        String sql = "DELETE FROM chequeo WHERE id = " + id;
        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            System.out.println("Error en método delete");
            e.printStackTrace();
        }
    }
}
