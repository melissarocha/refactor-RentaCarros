/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 * Clase que Modela un Objeto Empleado.
 *
 * @author melissa
 * @since 20/11/2017
 * @version 2.0
 */
public class Empleado {

    public final static String TABLE = "empleados";
    public final static String ALL = "id, usuario, contrasena, nombre, "
            + "direccion, email, numero_celular, numero_telefono";

    public Integer id;
    public String usuario;
    public String contrasena;
    public String nombre;
    public String direccion;
    public String email;
    public String celular;
    public String telefono;

    /**
     * Constructor vacio.
     */
    public Empleado() {
    }

    /**
     * Constructor que trae de parametros el id, usuario, conteraseña, nombre,
     * direccion, email, celular y telefono.
     *
     * @param id que es el identificador del empleado.
     * @param usuario que es el usuario del empleado.
     * @param contrasena que es la contraseña del empleado.
     * @param nombre que es el nombre del empleado.
     * @param direccion que es la direccion del empleado.
     * @param email que es el email del empleado.
     * @param celular que es el celular del empleado.
     * @param telefono que es el telefono del empleado.
     *
     */
    public Empleado(Integer id, String usuario, String contrasena, String nombre, String direccion, String email, String celular, String telefono) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.celular = celular;
        this.telefono = telefono;
    }

    /**
     * Método que te obtiene el id del empleado.
     *
     * @return id que es el identificador del empleado.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Método que le asigna un id al empleado.
     *
     * @param id que es el identificador del empleado.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Método que te obtiene el usuario del empleado.
     *
     * @return usuario que es el usuario del empleado.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Método que le asigna un usuario al empleado.
     *
     * @param usuario que es el usuario del empleado.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Método que te obtiene la contraseña del empleado.
     *
     * @return contrasena que es la contraseña del empleado.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Método que le asigna una contraseña al empleado.
     *
     * @param contrasena que es la contraseña del empleado.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Método que te obtiene el nombre del empleado.
     *
     * @return nombre que es el nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que le asigna un nombre al empleado.
     *
     * @param nombre que es el nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que te obtiene la direccion del empleado.
     *
     * @return direccion que es la direccion del empleado.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método que le asigna una direccion al empleado.
     *
     * @param direccion que es la direccion del empleado.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método que te obtiene el email del empleado.
     *
     * @return email que es el email del empleado.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método que le asigna un email al empleado.
     *
     * @param email que es el email del empleado.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método que te obtiene el numero de celular del empleado.
     *
     * @return celular que es el numero del celular del empleado.
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Método que le asigna un numero de celular al empleado.
     *
     * @param celular que es el numero de celular del empleado.
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Método que te obtiene el numero de telefono del empleado.
     *
     * @return telefono que es el numero del telefono del empleado.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método que le asigna un numero de telefono al empleado.
     *
     * @param telefono que es el numero de telefono del empleado.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
