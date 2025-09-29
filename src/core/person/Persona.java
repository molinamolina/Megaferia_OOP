/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

/**
 *
 * @author castillodj
 */
public abstract class Persona {
    
    protected String nombre;
    protected long cedula;

    public Persona(String nombre, long cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    
}
