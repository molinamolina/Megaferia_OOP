/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.book.Libro;
import java.util.ArrayList;

/**
 *
 * @author castillodj
 */
public class Autor extends Persona {
    
    private ArrayList<Libro> libros;

    public Autor(String nombre, long cedula) {
        super(nombre, cedula);
        this.libros = new ArrayList<>();
    }
    
    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }
    
}
