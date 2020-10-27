
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drew
 */
public class MassAndWeight {
    
    private static void determineIfHeavy(){
        Scanner keyboard = new Scanner(System.in);
        
        //Gathering object mass from user
        System.out.println("What is the mass of the object in kilograms? ");
        double objectMass = keyboard.nextDouble();
        
        
        // Equation for object weight 
        double objectWeight = objectMass * 9.8;
        
        
        // Decides if heavy or light
        System.out.println("The object you have is " + objectWeight + " newtons.");
        if (objectWeight > 1000) {
            System.out.println("This object is too heavy.");
        } else if (objectWeight < 10) {
            System.out.println("This objet is too light. ");
        } else {
            System.out.println("This object is just right");
        }
        
    }
    
    public static void main(String[] args) {
        determineIfHeavy();
    }
    
}
