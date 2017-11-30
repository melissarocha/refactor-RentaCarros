/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import models.Empleado;

/**
 * Interfaz que provee los metodos para acceder a la base de datos.
 *
 * @author melissa
 * @since 20/11/2017
 * @version 2.0
 */
public interface EmpleadoDao {

    public void create(Empleado empleado);

    public Empleado find(String criterio, String constrasena);

    public Empleado findById(Integer id);

    public void Update(Empleado empleado);

    public Boolean Delete(Integer id);

}
