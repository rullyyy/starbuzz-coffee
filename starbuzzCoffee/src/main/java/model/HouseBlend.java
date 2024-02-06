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
 * La clase HouseBlend extiende la clase Beverage y representa una bebida de tipo House Blend.
 */
public class HouseBlend extends Beverage{

    /**
     * Constructor de la clase HouseBlend que inicializa la descripción de la bebida.
     */
    public HouseBlend() {
        description = "HouseBlend";
    }

   /**
     * Obtiene el costo de la bebida HouseBlend.
     * @return El costo de la bebida HouseBlend.
     */ 
    @Override
    public double getCost() {
       float cost = 38; 
        return cost;
    }

    
    
    
}
