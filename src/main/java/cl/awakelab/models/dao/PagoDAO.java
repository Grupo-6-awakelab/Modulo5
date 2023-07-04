package cl.awakelab.models.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.models.cnn.Conexion;
import cl.awakelab.models.dto.Pago;

public class PagoDAO implements IPago {

    @Override
    public void create(Pago p) {
        String sql = "INSERT INTO pago (cliente_id, monto, fecha_pago) VALUES (" + p.getClienteId() + ", " + p.getMonto()
                + ", '" + p.getFechaPago() + "')";
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
    public List<Pago> read() {
        List<Pago> lista = new ArrayList<>();

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            String sql = "SELECT id, cliente_id, monto, fecha_pago FROM pago";
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Pago p = new Pago();
                p.setId(result.getInt("id"));
                p.setClienteId(result.getInt("cliente_id"));
                p.setMonto(result.getBigDecimal("monto"));
                p.setFechaPago(result.getDate("fecha_pago"));
                lista.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Error en el método read()");
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public Pago read(int id) {
        Pago pago = null;

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            String sql = "SELECT id, cliente_id, monto, fecha_pago FROM pago WHERE id = " + id;
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                pago = new Pago(rs.getInt("id"), rs.getInt("cliente_id"), rs.getBigDecimal("monto"),
                        rs.getDate("fecha_pago"));
            }

        } catch (SQLException e) {
            System.out.println("Error en el método read(id)");
            e.printStackTrace();
        }

        return pago;
    }

    @Override
    public void update(Pago p) {
        String sql = "UPDATE pago SET cliente_id = " + p.getClienteId() + ", monto = " + p.getMonto()
                + ", fecha_pago = '" + p.getFechaPago() + "' WHERE id = " + p.getId();

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
        String sql = "DELETE FROM pago WHERE id = " + id;

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