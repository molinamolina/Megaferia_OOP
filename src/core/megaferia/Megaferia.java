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
public class Megaferia {
    
    private static Megaferia instance;
    
    private ArrayList<Stand> stands;
    private ArrayList<Editorial> editoriales;

    private Megaferia() {
        this.stands = new ArrayList<>();
        this.editoriales = new ArrayList<>();
    }
    
    public static Megaferia getInstance() {
        if (instance == null) {
            instance = new Megaferia();
        }
        return instance;
    }
    
    public void addEditorial(Editorial editorial) {
        this.editoriales.add(editorial);
    }
    
    public void createStand(long id, double precio) {
        this.stands.add(new Stand(id, precio));
    }
    
    public Stand getStand(long id) {
        for (Stand stand : this.stands) {
            if (stand.getId() == id) {
                return stand;
            }
        }
        return null;
    }
    
}
