
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
public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Is anyone in your party vegan?");
        String isVegan = keyboard.nextLine().toLowerCase().trim();
        System.out.println("Is anyone in your party vegetarian?");
        String isVegetarian = keyboard.nextLine().toLowerCase().trim();
        System.out.println("Is anyone in your party gluten-free?");
        String isGlutenFree = keyboard.nextLine().toLowerCase().trim();
        
        if ("no".equals(isVegan) && "no".equals(isVegetarian) && "no".equals(isGlutenFree)) {
            System.out.println("Joe's gourmet burgers.");
            System.out.println("Main street pizza company.");
            System.out.println("Corner cafe.");
            System.out.println("Mama's fine italian.");
            System.out.println("The chef's kitchen.");
        } else if ("no".equals(isVegan) && "yes".equals(isVegetarian) && "no".equals(isGlutenFree)) {
            System.out.println("Corner cafe.");
            System.out.println("The chef's kitchen.");
            System.out.println("Mama's fine italian.");
            System.out.println("Main street pizza company.");

        } else if ("yes".equals(isVegan) && "yes".equals(isVegetarian) && "no".equals(isGlutenFree)) {
            System.out.println("Corner cafe.");
            System.out.println("The chef's kitchen.");
        } else if ("yes".equals(isVegan) && "yes".equals(isVegetarian) && "yes".equals(isGlutenFree)) {
            System.out.println("Corner cafe.");
            System.out.println("The chef's kitchen.");            
        } else if("no".equals(isVegan) && "yes".equals(isVegetarian) && "yes".equals(isGlutenFree)) {
            System.out.println("Main Street Pizza Company");
            System.out.println("Corner Cafe");
            System.out.println("The Chef's Kitchen");
        } else if ("no".equals(isVegan) && "no".equals(isVegetarian) && "yes".equals(isGlutenFree)) {
            System.out.println("Main Street Pizza Company");
            System.out.println("Corner Cafe");
            System.out.println("The Chef's Kitchen");            
        } else if ("yes".equals(isVegan) && "no".equals(isVegetarian) && "no".equals(isGlutenFree)) {
            System.out.println("Corner Cafe");
            System.out.println("The Chef's Kitchen"); 
        } else if ("yes".equals(isVegan) && "no".equals(isVegetarian) && "yes".equals(isGlutenFree)) {
            System.out.println("Corner Cafe");
            System.out.println("The Chef's Kitchen");    
        } else {
            System.out.println("Sorry I can't help you");
        }
    
    }
}
