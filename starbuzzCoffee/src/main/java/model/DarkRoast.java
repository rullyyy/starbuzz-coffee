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
 * La clase DarkRoast extiende la clase Beverage y representa una bebida de tipo Dark Roast.
 */

public class DarkRoast extends Beverage{

    /**
     * Constructor de la clase DarkRoast que inicializa la descripción de la bebida.
     */
    public DarkRoast() {
        description = "DarkRoast";
    }

    
      /**
     * Obtiene el costo de la bebida DarkRoast.
     * @return El costo de la bebida DarkRoast.
     */
    @Override
    public double getCost() {
        double cost = 45;
        return cost;
    }

 
    
}
