/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.megaferia.Editorial;

/**
 *
 * @author castillodj
 */
public class Gerente extends Persona {
    
    private Editorial editorial;

    public Gerente(String nombre, long cedula) {
        super(nombre, cedula);
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
}
