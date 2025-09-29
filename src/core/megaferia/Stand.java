/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.megaferia;

import java.util.ArrayList;

/**
 *
 * @author castillodj
 */
public class Stand {
    
    private long id;
    private double precio;
    private ArrayList<Editorial> editoriales;

    public Stand(long id, double precio) {
        this.id = id;
        this.precio = precio;
        this.editoriales = new ArrayList<>();
    }
    
    public void addEditorial(Editorial editorial) {
        this.editoriales.add(editorial);
    }

    public long getId() {
        return id;
    }
    
}
