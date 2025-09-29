/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.book;

import core.megaferia.Editorial;
import core.person.Autor;
import java.util.ArrayList;

/**
 *
 * @author castillodj
 */
public class LibroDigital extends Libro {
    
    private boolean hasHipervinculo;
    private ArrayList<String> hipervinculos;

    public LibroDigital(String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, double valor, Editorial editorial) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.hasHipervinculo = false;
        this.hipervinculos = null;
    }
    
    public LibroDigital(String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, double valor, Editorial editorial, ArrayList<String> hipervinculos) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.hasHipervinculo = true;
        this.hipervinculos = hipervinculos;
    }
    
}
