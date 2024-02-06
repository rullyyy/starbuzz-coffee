/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import decorator.Chocolate;
import decorator.Milk;
import decorator.Soy;
import decorator.WhippedCream;
import java.util.Scanner;
import model.Beverage;
import model.DarkRoast;
import model.Decaf;
import model.Expresso;
import model.HouseBlend;

/**
 *
 * @author xfs85
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        Beverage b1 = new HouseBlend();
        Beverage b2 = new DarkRoast();
        Beverage b3 = new Expresso();
        Beverage b4 = new Decaf();
        
        System.out.println("--------------------------");
        System.out.println("Starbuzz Coffee - Menu");
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("1. " + b1.getDescription() + " -> $" + b1.getCost());
        System.out.println("2. "+ b2.getDescription() + " -> $" + b2.getCost());
        System.out.println("3. " + b3.getDescription() + " -> $" + b3.getCost());
        System.out.println("4. " + b4.getDescription() + " -> $" + b4.getCost());
        System.out.println();
        System.out.println("--------------------------");
        
        System.out.println("Pick a beverage: ");
        
        int option = tec.nextInt();
        
        Beverage selectedBeverage = null;
        
        switch(option){
            case 1:
                selectedBeverage = b1;
                break;
            case 2:
                selectedBeverage = b2;
                break;
            case 3:
                selectedBeverage = b3;
                break;
            case 4: 
                selectedBeverage = b4;
                break;
        }
        
        if(selectedBeverage != null) {
            do {
                selectedBeverage = addCondiment(selectedBeverage);
                System.out.println("Total price: $" + selectedBeverage.getCost());
                System.out.println("Do you want to add another condiment? (yes/no): ");
                tec.nextLine(); 
            } while (tec.nextLine().equalsIgnoreCase("yes"));
            
            System.out.println("--------------------------");
            System.out.println("Final beverage: " + selectedBeverage.getDescription());
            System.out.println("Final price: $" + selectedBeverage.getCost());
        } else {
            System.out.println("Invalid option.");
        }
    }
    
    public static Beverage addCondiment(Beverage beverage){
        Scanner tec = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Extras");
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("1. Milk" + " -> $5" );
        System.out.println("2. Chocolate" + " -> $10" );
        System.out.println("3. Soy" + " -> $10" );
        System.out.println("4. Whipped Cream" + " -> $15");
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Pick an extra condiment: ");
        int option = tec.nextInt();
        
        switch(option){
            case 1:
                beverage = new Milk(beverage);
                break;
            case 2:
                beverage = new Chocolate(beverage);
                break;
            case 3:
                beverage = new Soy(beverage);
                break;
            case 4:
                beverage = new WhippedCream(beverage);
                break;
            
            default:
                break;
            
        }
        return beverage;
    }
}


