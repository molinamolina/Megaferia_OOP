/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.megaferia.Editorial;
import core.megaferia.Megaferia;
import core.person.Gerente;
import core.person.Narrador;

/**
 *
 * @author castillodj
 */
public class Main {
    
    public static void main(String[] args) {
        // Paso (1)
        Megaferia megaferia = Megaferia.getInstance();
        
        // Paso (2)
        megaferia.createStand(15772000, 75000.0);
        megaferia.createStand(15772100, 90000.0);
        megaferia.createStand(15772200, 100000.0);
        megaferia.createStand(15772300, 145000.0);
        megaferia.createStand(15772400, 50000.0);
        
        // Paso (3)
        Narrador narrador = new Narrador("Juan Perez", 1234871246);
        
        // Paso (4) x3
        Gerente gerente1 = new Gerente("Pablo Ramos", 1234951134);
        Gerente gerente2 = new Gerente("John Doe", 1234951134);
        Gerente gerente3 = new Gerente("Maria Mercedes", 1234951134);
        
        // Paso (5) x3
        Editorial editorial1 = new Editorial("980147523-9", "Planeta", "Cra 52 # 45 - 62", gerente1);
        Editorial editorial2 = new Editorial("980897423-3", "Nova", "Cra 72 # 98 - 153", gerente2);
        Editorial editorial3 = new Editorial("981874133-6", "Norma", "Cra 21 # 27 - 35", gerente3);
        
        // Paso (6) x3
        megaferia.addEditorial(editorial1);
        megaferia.addEditorial(editorial2);
        megaferia.addEditorial(editorial3);
        
        // Paso (7) x5
        megaferia.getStand(15772000).addEditorial(editorial1);
        editorial1.addStand(megaferia.getStand(15772000));
        
        megaferia.getStand(15772100).addEditorial(editorial1);
        editorial1.addStand(megaferia.getStand(15772100));
        
        megaferia.getStand(15772200).addEditorial(editorial2);
        editorial2.addStand(megaferia.getStand(15772200));
        
        megaferia.getStand(15772300).addEditorial(editorial3);
        editorial3.addStand(megaferia.getStand(15772300));
        
        megaferia.getStand(15772400).addEditorial(editorial2);
        editorial2.addStand(megaferia.getStand(15772400));
        
        // Paso (8)
        
    }
    
}
