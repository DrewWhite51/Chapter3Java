
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
public class BodyMassIndex {
    
    private static void determineBMI(){
        Scanner keyboard = new Scanner(System.in);
        
        // Gathering input from user
        System.out.println("Enter your weight. ");
        double weight = keyboard.nextInt();
        System.out.println("Enter many feet tall are you?. ");
        double heightFeet = keyboard.nextInt();
        System.out.println("Enter many inches tall are you?. ");
        double heightInches = keyboard.nextInt();
        
        // Equations to calc BMI
        double heightFeetToInches = heightFeet * 12;
        double totalHeight = heightFeetToInches + heightInches;
        double BMI = weight * ((703)/(Math.pow(totalHeight,2)));
        
        System.out.println("Your BMI is " + BMI);
        
        // if statement determining if person is healthy weight
        if (BMI > 25) {
            System.out.println("You are overweight. Lose some pounds fatty.");
        } else if (BMI < 18.5) {
            System.out.println("You are underweight, gain some wight Jack Skellington.");
        } else 
            System.out.println("Looks like you are perfectly healthy weight wise.");
                
    }
    
    
    public static void main(String[] args) {

        // Calling method
        determineBMI();
    }
    
}
