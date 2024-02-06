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
 * La clase Expresso extiende la clase Beverage y representa una bebida de tipo Expresso.
 */
public class Expresso extends Beverage{

    
    /**
     * Constructor de la clase Expresso que inicializa la descripción de la bebida.
     */
    public Expresso() {
        description = "expresso";
    }

    
     /**
     * Obtiene el costo de la bebida Expresso.
     * @return El costo de la bebida Expresso.
     */
    @Override
    public double getCost() {
        float cost = 36;
        return cost;
    }
        

  
    
}
