/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.empleado;

import dao.EmpleadoDao;
import dao.database.EmpleadoDaoJdbc;
import models.Empleado;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * Pruebas del Dao JDBC
 *
 * @author melissa
 * @since 20/11/2017
 * @version 2.0
 */
public class EmpleadoDaoTest {

    @Test
    public void testListas() {
        EmpleadoDao dao = new EmpleadoDaoJdbc();

        Empleado e = dao.findById(1);
        System.out.println("d = " + e);
        assertNotNull(e);

        assertEquals(e.getNombre(), "melissa");
    }
}
