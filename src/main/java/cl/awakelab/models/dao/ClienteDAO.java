package cl.awakelab.models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.models.cnn.Conexion;
import cl.awakelab.models.dto.Cliente;

public class ClienteDAO implements ICliente {

    @Override
    public void create(Cliente c) {
        String sql = "INSERT INTO cliente (rut, nombre, apellido, correo, telefono, afp, sistema_salud, direccion, comuna, edad, usuario_id) VALUES ('"
                + c.getRut() + "', '" + c.getNombre() + "', '" + c.getApellido() + "', '" + c.getCorreo() + "', '"
                + c.getTelefono() + "', '" + c.getAfp() + "', '" + c.getSistemaSalud() + "', '" + c.getDireccion()
                + "', '" + c.getComuna() + "', " + c.getEdad() + ", " + c.getUsuarioId() + ")";
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
    public List<Cliente> read() {
        List<Cliente> lista = new ArrayList<>();

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            String sql = "SELECT id, rut, nombre, apellido, correo, telefono, afp, sistema_salud, direccion, comuna, edad, usuario_id FROM cliente";
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Cliente c = new Cliente();
                c.setId(result.getInt("id"));
                c.setRut(result.getString("rut"));
                c.setNombre(result.getString("nombre"));
                c.setApellido(result.getString("apellido"));
                c.setCorreo(result.getString("correo"));
                c.setTelefono(result.getString("telefono"));
                c.setAfp(result.getString("afp"));
                c.setSistemaSalud(result.getString("sistema_salud"));
                c.setDireccion(result.getString("direccion"));
                c.setComuna(result.getString("comuna"));
                c.setEdad(result.getInt("edad"));
                c.setUsuarioId(result.getInt("usuario_id"));
                lista.add(c);
            }

        } catch (SQLException e) {
            System.out.println("Error en el método read()");
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public Cliente read(int id) {
        Cliente cliente = null;

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            String sql = "SELECT id, rut, nombre, apellido, correo, telefono, afp, sistema_salud, direccion, comuna, edad, usuario_id FROM cliente WHERE id = "
                    + id;
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                cliente = new Cliente(rs.getInt("id"), rs.getString("rut"), rs.getString("nombre"),
                        rs.getString("apellido"), rs.getString("correo"), rs.getString("telefono"),
                        rs.getString("afp"), rs.getString("sistema_salud"), rs.getString("direccion"),
                        rs.getString("comuna"), rs.getInt("edad"), rs.getInt("usuario_id"));
            }

        } catch (SQLException e) {
            System.out.println("Error en el método read(id)");
            e.printStackTrace();
        }

        return cliente;
    }

    @Override
    public void update(Cliente c) {
        String sql = "UPDATE cliente SET rut = '" + c.getRut() + "', nombre = '" + c.getNombre() + "', apellido = '"
                + c.getApellido() + "', correo = '" + c.getCorreo() + "', telefono = '" + c.getTelefono() + "', afp = '"
                + c.getAfp() + "', sistema_salud = '" + c.getSistemaSalud() + "', direccion = '" + c.getDireccion()
                + "', comuna = '" + c.getComuna() + "', edad = " + c.getEdad() + ", usuario_id = " + c.getUsuarioId()
                + " WHERE id = " + c.getId();

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
        String sql = "DELETE FROM cliente WHERE id = " + id;
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