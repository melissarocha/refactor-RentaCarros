/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 * Clase que Modela un Objeto Vehiculo.
 *
 * @author melissa
 * @since 20/11/2017
 * @version 2.0
 */
public class Vehiculo {

    public final static String TABLE = "vehiculos";
    public final static String ALL = "id, marca, modelo, color, numero_serie, precio";

    public Integer id;
    public String marca;
    public String color;
    public Float precio;
    public String modelo;
    public String numeroSerie;

    /**
     * Constructor vacio.
     */
    public Vehiculo() {
    }

    /**
     * Constructor que trae de parametros el id, marca, color, precio, modelo,
     * numero de serie del vehiculo.
     *
     * @param id que es el identificador del vehiculo.
     * @param marca que es la marca del vehiculo.
     * @param color que es el color del vehiculo.
     * @param precio que es el precio de la renta del vehiculo.
     * @param modelo que es el modelo del vehiculo.
     * @param numeroSerie que es el numero de serie del vehiculo.
     *
     */
    public Vehiculo(Integer id, String marca, String color, Float precio, String modelo, String numeroSerie) {
        this.id = id;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    /**
     * Método que te obtiene el id del vehiculo.
     *
     * @return id que es el identificador del vehiculo.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Método que le asigna un id al vehiculo.
     *
     * @param id que es el identificador del vehiculo.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Método que te obtiene la marca del vehiculo.
     *
     * @return marca que es la marca del vehiculo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método que le asigna una marca al vehiculo.
     *
     * @param marca que es la marca del vehiculo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método que te obtiene el color del vehiculo.
     *
     * @return color que es el color del vehiculo.
     */
    public String getColor() {
        return color;
    }

    /**
     * Método que le asigna un color al vehiculo.
     *
     * @param color que es la marca del vehiculo.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método que te obtiene el precio del vehiculo.
     *
     * @return precio que es el precio de la renta del vehiculo.
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * Método que le asigna un precio del vehiculo.
     *
     * @param precio que es el precio de la renta del vehiculo.
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    /**
     * Método que te obtiene el modelo del vehiculo.
     *
     * @return modelo que es el modelo del vehiculo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método que le asigna un modelo al vehiculo.
     *
     * @param modelo que es el modelo del vehiculo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método que te obtiene el Numero de Serie del vehiculo.
     *
     * @return numSerie que es el numero del serie del vehiculo.
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * Método que le asigna un Numero de Serie al vehiculo.
     *
     * @param numeroSerie que es el numero de serie del vehiculo.
     */
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

}
