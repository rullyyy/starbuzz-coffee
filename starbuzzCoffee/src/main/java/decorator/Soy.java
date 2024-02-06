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
 * La clase Soy representa un condimento que añade leche de soya a una bebida.
 */
public class Soy extends Condiment {

    /**
     * Constructor de la clase Soy que recibe la bebida a la que se añadirá leche de soya.
     * @param beverage La bebida a la que se añadirá leche de soya.
     */
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Obtiene la descripción de la bebida con leche de soya.
     * @return La descripción de la bebida con leche de soya.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + " with soy";
    }

    /**
     * Calcula el costo de la bebida con leche de soya.
     * @return El costo de la bebida con leche de soya.
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 10; 
    }
}

