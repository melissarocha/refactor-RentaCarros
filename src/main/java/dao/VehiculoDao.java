/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.Vehiculo;

/**
 * Interfaz que provee los metodos para acceder a la base de datos.
 *
 * @author melissa
 * @since 20/11/2017
 * @version 2.0
 */
public interface VehiculoDao {

    public void create(Vehiculo vehiculo);

    public List<Vehiculo> find(String criterio);

    public Vehiculo findByID(Integer id);

    public void Update(Vehiculo vehiculo);

    public Boolean Delete(Integer id);

}
