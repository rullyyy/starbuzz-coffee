/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

import model.Beverage;

/**
 *
 * @author xfs85
 */
/**
 * La clase Milk representa un condimento que añade leche a una bebida.
 */
public class Milk extends Condiment{

    /**
     * Constructor de la clase Milk que recibe la bebida a la que se añadirá leche.
     * @param beverage La bebida a la que se añadirá leche.
     */
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    
  /**
     * Obtiene la descripción de la bebida con leche.
     * @return La descripción de la bebida con leche.
     */  
    @Override
    public String getDescription() {
        return beverage.getDescription() + " with milk ";
    }

    /**
     * Calcula el costo de la bebida con leche.
     * @return El costo de la bebida con leche.
     */
    @Override
    public double getCost() {
       return beverage.getCost() + 5;
    }
    
}
