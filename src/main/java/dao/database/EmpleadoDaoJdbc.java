/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.database;

import connection.Conexion;
import dao.EmpleadoDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.Empleado;

/**
 * Modelo que se encarga de realizar la logica para la busqueda, actualizacion,
 * creacion y eliminacion de los datos.
 *
 * @author melissa
 * @since 20/11/2017
 * @version 2.0
 */
public class EmpleadoDaoJdbc implements EmpleadoDao {

    /**
     * Metodo para hacer un empleado
     * @return e
     */
    private static Empleado makeEmpleado(ResultSet rs) throws SQLException {
        Empleado e = new Empleado();
        Integer i = 1;
        e.setId(rs.getInt(i++));
        e.setUsuario(rs.getString(i++));
        e.setContrasena(rs.getString(i++));
        e.setNombre(rs.getString(i++));
        e.setDireccion(rs.getString(i++));
        e.setEmail(rs.getString(i++));
        e.setCelular(rs.getString(i++));
        e.setTelefono(rs.getString(i++));
        return e;

    }
    
     /**
     * Metodo para crear un nuevo empleado en la base de datos
     * 
     * @param empleado
     */
    
    @Override
    public void create(Empleado empleado) {

        try {
            Conexion c = Conexion.getInstance();
            Statement statement = c.getCon().createStatement();
            statement
                    .executeUpdate(String.format("INSERT INTO %s VALUES (%d, '%s', '%s', '%s', '%s','%s', '%s', '%s')",
                            Empleado.TABLE, empleado.getId(), empleado.getUsuario(), empleado.getContrasena(),
                            empleado.getNombre(), empleado.getDireccion(), empleado.getEmail(), empleado.getCelular(),
                            empleado.getTelefono()));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
     /**
     * Metodo para buscar el usuario y contraseña del empleado en la base de datos
     * 
     * @param criterio
     * @param contrasena
     */
    @Override
    public Empleado find(String criterio, String contrasena) {
        
         Empleado empleado = new Empleado();

        try {
            Conexion c = Conexion.getInstance();
            Statement statement = c.getCon().createStatement();
            ResultSet resultSet = statement
                    .executeQuery(String.format("SELECT %s FROM %s WHERE usuario = '%s' AND contrasena = '%s'", Empleado.ALL, Empleado.TABLE, criterio, contrasena));
            while (resultSet.next()) {
                empleado = EmpleadoDaoJdbc.makeEmpleado(resultSet);

            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return empleado;
    }
    
    /**
     * Metodo que busca por id a un empleado en la base de datos
     * @param id
     * @return empleado
     */
    @Override
    public Empleado findById(Integer id) {
        Empleado empleado = new Empleado();

        try {
            Conexion c = Conexion.getInstance();
            Statement statement = c.getCon().createStatement();
            ResultSet resultSet = statement
                    .executeQuery(String.format("SELECT %s FROM %s WHERE id = %d", Empleado.ALL, Empleado.TABLE, id));
            while (resultSet.next()) {
                empleado = EmpleadoDaoJdbc.makeEmpleado(resultSet);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleado;
    }

    @Override
    public void Update(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo que elimina un empleado de la base de datos
     * @param id
     * @return true
     */
    @Override
    public Boolean Delete(Integer id) {
        
        try {
            Conexion c = Conexion.getInstance();
            Statement statement = c.getCon().createStatement();
            statement.executeUpdate(String.format("DELETE FROM %s WHERE id = %d", Empleado.TABLE, id));

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
