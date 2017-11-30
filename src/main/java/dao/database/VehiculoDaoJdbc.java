/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.database;

import connection.Conexion;
import dao.VehiculoDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import models.Vehiculo;

/**
 * Modelo que se encarga de realizar la logica para la busqueda, actualizacion,
 * creacion y eliminacion de los datos.
 *
 * @author melissa
 * @since 20/11/2017
 * @version 2.0
 */
public class VehiculoDaoJdbc implements VehiculoDao {

    /**
     * Metodo para hacer un vehiculo.
     *
     * @return v
     */
    private static Vehiculo makeVehiculo(ResultSet rs) throws SQLException {
        Vehiculo v = new Vehiculo();
        Integer i = 1;
        v.setId(rs.getInt(i++));
        v.setMarca(rs.getString(i++));
        v.setModelo(rs.getString(i++));
        v.setColor(rs.getString(i++));
        v.setNumeroSerie(rs.getString(i++));
        v.setPrecio(rs.getFloat(i++));
        return v;
    }

    /**
     * Metodo para crear un vehiculo en la base de datos.
     *
     * @param vehiculo
     */
    @Override
    public void create(Vehiculo vehiculo) {

        try {
            Conexion c = Conexion.getInstance();
            Statement statement = c.getCon().createStatement();
            statement
                    .executeUpdate(String.format("INSERT INTO %s VALUES (%d, '%s', '%s', '%s', '%s', %f)",
                            Vehiculo.TABLE, vehiculo.getId(), vehiculo.getMarca(), vehiculo.getModelo(),
                            vehiculo.getColor(), vehiculo.getNumeroSerie(), vehiculo.getPrecio()));

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Vehiculo> find(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo para buscar el vehiculo por id.
     *
     * @param id
     * @return vehiculo
     */
    @Override
    public Vehiculo findByID(Integer id) {

        Vehiculo vehiculo = new Vehiculo();

        try {
            Conexion c = Conexion.getInstance();
            Statement statement = c.getCon().createStatement();
            ResultSet resultSet = statement
                    .executeQuery(String.format("SELECT %s FROM %s WHERE id = %d", Vehiculo.ALL, Vehiculo.TABLE, id));
            while (resultSet.next()) {
                vehiculo = VehiculoDaoJdbc.makeVehiculo(resultSet);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehiculo;
    }

    @Override
    public void Update(Vehiculo vehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo para borrar un vehiculo de la base de datos.
     *
     * @param id
     * @return true
     */
    @Override
    public Boolean Delete(Integer id) {

        try {
            Conexion c = Conexion.getInstance();
            Statement statement = c.getCon().createStatement();
            statement.executeUpdate(String.format("DELETE FROM %s WHERE id = %d", Vehiculo.TABLE, id));

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
