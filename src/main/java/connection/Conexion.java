/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que crea las conexiones a utilizar en la base de datos y lo demas
 * metodos del sistema.
 *
 * @author melissa
 * @since 20/11/2017
 * @version 2.0
 */
public class Conexion {

    private static Conexion INSTANCE;
    private Connection con;

    /**
     * Constructor de la conexión a la base de datos.
     */
    private Conexion() {
        this.initConection();
    }

    /**
     * Método que crea la conexión a la base de datos.
     */
    private void initConection() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost/Renta?user=melissa&password=h01e02s94");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que obtiene la instancia de la conexión de la base de datos.
     *
     * @return INSTANCE que es la instancia que creamos.
     */
    public static Conexion getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Conexion();
        }
        return INSTANCE;
    }

    /**
     * Método que obtiene la conexión.
     *
     * @return con que es la conexión de la base de datos.
     */
    public Connection getCon() { return this.con; }
    
}
