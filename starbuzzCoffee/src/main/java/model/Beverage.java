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
 * La clase Beverage es una abstracción para representar bebidas.
 */
public abstract class Beverage {

    String description;

    double cost;

    /**
     * Obtiene la descripción de la bebida.
     *
     * @return La descripción de la bebida.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Obtiene el costo de la bebida.
     *
     * @return El costo de la bebida.
     */
    public abstract double getCost();

}
