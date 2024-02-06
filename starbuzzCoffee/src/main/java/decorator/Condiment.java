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
 * La clase Condiment es una abstracción para representar condimentos que pueden ser agregados a una bebida.
 */
public abstract class Condiment extends Beverage{

    public Beverage beverage;

    /**
     * Obtiene la descripción del condimento.
     * Este método debe ser implementado por las subclases para proporcionar la descripción específica del condimento.
     * @return La descripción del condimento.
     */
    @Override
    public abstract String getDescription();
    
    
    
}
