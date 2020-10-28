
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
public class FatGramCalc {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        
        // Gathers data
        System.out.println("Enter the food you are eating. ");
        String userFood = keyboard.nextLine();
        System.out.println("Enter the number of calories in the " + userFood);
        double numberOfCals = keyboard.nextDouble();
        System.out.println("Enter the grams of fat in the " + userFood);
        double gramsOfFat = keyboard.nextDouble();
        
        // Conversions 
        
        double calsFromFat = gramsOfFat * 9;
        double fatPercentage = calsFromFat / numberOfCals;
        
        
        // Output
        System.out.println("The " + userFood + " has " + calsFromFat + " calories from fat.");
        System.out.println("The " + userFood + " has " + fatPercentage + "% fat.");
        
        if (fatPercentage < 30) {
            System.out.println("This food is low in fat.");
        }
    }
    
}
