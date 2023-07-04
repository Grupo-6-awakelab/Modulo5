package cl.awakelab.models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.models.cnn.Conexion;
import cl.awakelab.models.dto.Capacitacion;

public class CapacitacionDAO implements ICapacitacion {

    @Override
    public void create(Capacitacion c) {
        String sql = "INSERT INTO capacitacion (nombre, detalle, fecha, hora, lugar, duracion, cantidad, cliente_id) VALUES ('"
                + c.getNombre() + "', '" + c.getDetalle() + "', '" + c.getFecha() + "', '" + c.getHora() + "', '"
                + c.getLugar() + "', " + c.getDuracion() + ", " + c.getCantidad() + ", " + c.getClienteId() + ")";
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
    public List<Capacitacion> read() {
        List<Capacitacion> lista = new ArrayList<>();

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            String sql = "SELECT id, nombre, detalle, fecha, hora, lugar, duracion, cantidad, cliente_id FROM capacitacion";
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Capacitacion c = new Capacitacion();
                c.setId(result.getInt("id"));
                c.setNombre(result.getString("nombre"));
                c.setDetalle(result.getString("detalle"));
                c.setFecha(result.getDate("fecha"));
                c.setHora(result.getTime("hora"));
                c.setLugar(result.getString("lugar"));
                c.setDuracion(result.getFloat("duracion"));
                c.setCantidad(result.getInt("cantidad"));
                c.setClienteId(result.getInt("cliente_id"));

                lista.add(c);
            }

        } catch (SQLException e) {
            System.out.println("Error en el método read()");
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public Capacitacion read(int id) {
        Capacitacion capacitacion = null;

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            String sql = "SELECT id, nombre, detalle, fecha, hora, lugar, duracion, cantidad, cliente_id FROM capacitacion WHERE id = "
                    + id;

            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                capacitacion = new Capacitacion();
                capacitacion.setId(result.getInt("id"));
                capacitacion.setNombre(result.getString("nombre"));
                capacitacion.setDetalle(result.getString("detalle"));
                capacitacion.setFecha(result.getDate("fecha"));
                capacitacion.setHora(result.getTime("hora"));
                capacitacion.setLugar(result.getString("lugar"));
                capacitacion.setDuracion(result.getFloat("duracion"));
                capacitacion.setCantidad(result.getInt("cantidad"));
                capacitacion.setClienteId(result.getInt("cliente_id"));
            }

        } catch (SQLException e) {
            System.out.println("Error en el método read(id)");
            e.printStackTrace();
        }

        return capacitacion;
    }

    @Override
    public void update(Capacitacion c) {
        String sql = "UPDATE capacitacion SET nombre = '" + c.getNombre() + "', detalle = '" + c.getDetalle()
                + "', fecha = '" + c.getFecha() + "', hora = '" + c.getHora() + "', lugar = '" + c.getLugar()
                + "', duracion = " + c.getDuracion() + ", cantidad = " + c.getCantidad() + ", cliente_id = "
                + c.getClienteId() + " WHERE id = " + c.getId();

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
        String sql = "DELETE FROM capacitacion WHERE id = " + id;
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