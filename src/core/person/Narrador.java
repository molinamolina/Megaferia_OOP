/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.book.Audiolibro;
import java.util.ArrayList;

/**
 *
 * @author castillodj
 */
public class Narrador extends Persona {
    
    private ArrayList<Audiolibro> libros;

    public Narrador(String nombre, long cedula) {
        super(nombre, cedula);
        this.libros = new ArrayList<>();
    }
    
    public void addLibro(Audiolibro libro) {
        this.libros.add(libro);
    }
    
}
