package cl.awakelab.models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.models.cnn.Conexion;
import cl.awakelab.models.dto.Visita;

public class VisitaDAO implements IVisita {

    @Override
    public void create(Visita v) {
        String sql = "INSERT INTO visita (cliente_id, fecha, hora, lugar, realizado, detalle, profesional_id) VALUES ("
                + v.getClienteId() + ", '" + v.getFecha() + "', '" + v.getHora() + "', '" + v.getLugar() + "', "
                + v.isRealizado() + ", '" + v.getDetalle() + "', " + v.getProfesionalId() + ")";
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
    public List<Visita> read() {
        List<Visita> lista = new ArrayList<>();

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            String sql = "SELECT id, cliente_id, fecha, hora, lugar, realizado, detalle, profesional_id FROM visita";
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Visita v = new Visita();
                v.setId(result.getInt("id"));
                v.setClienteId(result.getInt("cliente_id"));
                v.setFecha(result.getDate("fecha"));
                v.setHora(result.getTime("hora"));
                v.setLugar(result.getString("lugar"));
                v.setRealizado(result.getBoolean("realizado"));
                v.setDetalle(result.getString("detalle"));
                v.setProfesionalId(result.getInt("profesional_id"));
                lista.add(v);
            }

        } catch (SQLException e) {
            System.out.println("Error en el método read()");
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public Visita read(int id) {
        Visita visita = null;

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            String sql = "SELECT id, cliente_id, fecha, hora, lugar, realizado, detalle, profesional_id FROM visita WHERE id = "
                    + id;
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                visita = new Visita(rs.getInt("id"), rs.getInt("cliente_id"), rs.getDate("fecha"), rs.getTime("hora"),
                        rs.getString("lugar"), rs.getBoolean("realizado"), rs.getString("detalle"),
                        rs.getInt("profesional_id"));
            }

        } catch (SQLException e) {
            System.out.println("Error en el método read(id)");
            e.printStackTrace();
        }

        return visita;
    }

    @Override
    public void update(Visita v) {
        String sql = "UPDATE visita SET cliente_id = " + v.getClienteId() + ", fecha = '" + v.getFecha() + "', hora = '"
                + v.getHora() + "', lugar = '" + v.getLugar() + "', realizado = " + v.isRealizado() + ", detalle = '"
                + v.getDetalle() + "', profesional_id = " + v.getProfesionalId() + " WHERE id = " + v.getId();

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
        String sql = "DELETE FROM visita WHERE id = " + id;
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