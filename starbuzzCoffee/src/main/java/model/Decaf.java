/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author xfs85
 */
/**
 * La clase Decaf extiende la clase Beverage y representa una bebida de tipo Decaf.
 */
public class Decaf extends Beverage{

    /**
     * Constructor de la clase Decaf que inicializa la descripción de la bebida.
     */
    public Decaf() {
        description = "decaf";
    }

    
    /**
     * Obtiene el costo de la bebida Decaf.
     * @return El costo de la bebida Decaf.
     */ 
    @Override
    public double getCost() {
        float cost = 30;
        return cost;
    }

   
    
}
