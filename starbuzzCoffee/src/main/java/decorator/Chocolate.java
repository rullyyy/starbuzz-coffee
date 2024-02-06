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
 * La clase Chocolate representa un condimento que añade chocolate a una bebida.
 */
public class Chocolate extends Condiment {

    /**
     * Constructor de la clase Chocolate que recibe la bebida a la que se añadirá chocolate.
     * @param beverage La bebida a la que se añadirá chocolate.
     */
    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Obtiene la descripción de la bebida con chocolate.
     * @return La descripción de la bebida con chocolate.
     */
    @Override
    public String getDescription() {
       return beverage.getDescription() + " with Chocolate";
    }

    /**
     * Calcula el costo de la bebida con chocolate.
     * @return El costo de la bebida con chocolate.
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 10; 
    }
}