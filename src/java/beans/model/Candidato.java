/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author Desarrollo2
 */
@ManagedBean
@RequestScoped
public class Candidato {

    /**
     * Creates a new instance of Candidato
     */
    public Candidato() {
    }
    
    private String nombre;
    private String apellido;
    private String sueldoDeseado;

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the sueldoDeseado
     */
    public String getSueldoDeseado() {
        return sueldoDeseado;
    }

    /**
     * @param sueldoDeseado the sueldoDeseado to set
     */
    public void setSueldoDeseado(String sueldoDeseado) {
        this.sueldoDeseado = sueldoDeseado;
    }

    
}
