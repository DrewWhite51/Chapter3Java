
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
public class SpeedOfSound {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the material (air/water/steel)");
        String matType = keyboard.nextLine().toLowerCase().trim();
        System.out.println("Enter the distance traveled in feet");
        double distanceTraveled = keyboard.nextDouble();
        
        switch (matType) {
            case "air":
                airMedium(distanceTraveled);
                break;
            case "water":
                waterMedium(distanceTraveled);
                break;
            case "steel":
                steelMedium(distanceTraveled);
                break;
            default:
                System.out.println("You did not enter a valid medium.");
                break;
        }
        
    }
    
    private static void airMedium(double distanceTraveled){
        double airTime = distanceTraveled/1100;
        System.out.println("It took " + airTime + " seconds for the sound to travel that distance.");
    }
    
    private static void waterMedium(double distanceTraveled){
        double waterTime = distanceTraveled/4900;
        System.out.println("It took " + waterTime + " seconds for the sound to travel that distence.");
    }
    
    private static void steelMedium(double distanceTraveled) {
        double steelTime = distanceTraveled/16400;
        System.out.println("It took " + steelTime + " seconds for the sound to travel that distance.");
    }
    
    
}
