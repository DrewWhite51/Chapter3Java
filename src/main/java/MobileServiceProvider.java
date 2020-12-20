
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
public class MobileServiceProvider {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);        

        startMenu();
        System.out.println("Enter the package that you are using: ");
        double userPackage = keyboard.nextInt();
        System.out.println("Enter the total number of minutes that were used. ");
        double userMinutes = keyboard.nextInt();
        calculations(userPackage, userMinutes);
        
    }
    
    
    public static void startMenu(){
        System.out.println("Package 1:   For $39.99 per month, 450 minutes are provided. Additional minutes are $0.45 mer minutes. (Type 1)");
        System.out.println("Package 2:   For $59.99 per month, 900 minutes are provided. Additional minutes are $0.40 mer minutes. (Type 2)");
        System.out.println("Package 3:   For $69.99 per month, unlimited minutes are provided. (Type 3)");
    }
    
    public static void calculations(double userPackage, double userMinutes) {
        double extraPackageAMinutes = ((userMinutes-450)*.45)+39.99;
        double extraPackageBMinutes = ((userMinutes-900)*.40)+59.99;
        
        if (userPackage == 1 && userMinutes > 450) {
            System.out.println("Your total is $" + extraPackageAMinutes);
        } else if (userPackage == 1 && userMinutes < 450) {
            System.out.println("Your total is $39.99.");
        } else if (userPackage == 2 && userMinutes > 900) {
            System.out.println("Your total is $" + extraPackageBMinutes);
        } else if (userPackage == 2 && userMinutes < 900) {
            System.out.println("Your total is $59.99.");
        } else if (userPackage == 3) {
            System.out.println("Your total is $69.99.");
        }
    
    
    
    }
    
    public static void moneySaver(double userPackage, double userMinutes) {
        
    }
}
