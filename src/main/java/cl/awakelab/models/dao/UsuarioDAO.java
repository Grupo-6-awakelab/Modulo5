package cl.awakelab.models.dao;

import cl.awakelab.models.dto.Usuario;
import cl.awakelab.models.cnn.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    public void create(Usuario usuario) {
        String sql = "INSERT INTO usuario (nombre, username, password) VALUES ('" + usuario.getNombre() + "', '"
                + usuario.getUsername() + "', '" + usuario.getPassword() + "')";

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            System.out.println("Error en el método create");
            e.printStackTrace();
        }
    }

    public List<Usuario> read() {
        List<Usuario> listaUsuarios = new ArrayList<>();

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            String sql = "SELECT id, nombre, username, password FROM usuario";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                Usuario usuario = new Usuario(rs.getInt("id"), rs.getString("nombre"), rs.getString("username"),
                        rs.getString("password"));
                listaUsuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.out.println("Error en el método read");
            e.printStackTrace();
        }

        return listaUsuarios;
    }

    public Usuario read(int id) {
        Usuario usuario = null;

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            String sql = "SELECT id, nombre, username, password FROM usuario WHERE id = " + id;
            ResultSet rs = statement.executeQuery(sql);

            if (rs.next()) {
                usuario = new Usuario(rs.getInt("id"), rs.getString("nombre"), rs.getString("username"),
                        rs.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println("Error en el método read(id)");
            e.printStackTrace();
        }

        return usuario;
    }

    public void update(Usuario usuario) {
        String sql = "UPDATE usuario SET nombre = '" + usuario.getNombre() + "', username = '" + usuario.getUsername()
                + "', password = '" + usuario.getPassword() + "' WHERE id = " + usuario.getId();

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            System.out.println("Error en el método update");
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM usuario WHERE id = " + id;

        try {
            Connection conn = Conexion.getConexion();
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            System.out.println("Error en el método delete");
            e.printStackTrace();
        }
    }
    
    
    public Usuario buscarUsuario(String username) {
        String sql = "SELECT * FROM usuario WHERE username = ? ";
        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Usuario user = new Usuario();
                user.setId(result.getInt("id"));
                user.setNombre(result.getString("nombre"));
                user.setUsername(result.getString("username"));
                user.setPassword(result.getString("password"));
                return user;
            }
        } catch (SQLException e) {
            System.out.println("Error en el método findByUsername");
            e.printStackTrace();
        }
        return null;
    }
    
    public String getRol(String username) {
        String userType = null;
        String sql = "SELECT 'admin' AS tipo FROM administrativo WHERE username = ? UNION " +
                     "SELECT 'cliente' AS tipo FROM cliente WHERE username = ? UNION " +
                     "SELECT 'profesional' AS tipo FROM profesional WHERE username = ?";
        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, username);
            statement.setString(3, username);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                userType = result.getString("tipo");
            }
        } catch (SQLException e) {
            System.out.println("Error en el método getUserType");
            e.printStackTrace();
        }
        return userType;
    }    
    public String getName(String username) {
        String sql = "SELECT nombre FROM usuario WHERE username = ?";
        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                return result.getString("nombre");
            }
        } catch (SQLException e) {
            System.out.println("Error en el método findNameByUsername");
            e.printStackTrace();
        }
        return null;
    }
}