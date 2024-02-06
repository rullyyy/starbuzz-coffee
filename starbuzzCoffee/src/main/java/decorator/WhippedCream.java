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
 * La clase WhippedCream representa un condimento que añade crema batida a una bebida.
 */
public class WhippedCream extends Condiment {

    /**
     * Constructor de la clase WhippedCream que recibe la bebida a la que se añadirá crema batida.
     * @param beverage La bebida a la que se añadirá crema batida.
     */
    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Obtiene la descripción de la bebida con crema batida.
     * @return La descripción de la bebida con crema batida.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Whipped Cream";
    }

    /**
     * Calcula el costo de la bebida con crema batida.
     * @return El costo de la bebida con crema batida.
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 15; 
    }
}

