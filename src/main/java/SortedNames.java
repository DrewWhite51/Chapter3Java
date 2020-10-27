
import java.util.ArrayList;
import java.util.Collections;
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
public class SortedNames {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        ArrayList<String> names = new ArrayList<String>();
        
        
        // Gathering names from user and adding it to the list
        System.out.println("Enter the first name. ");
        String firstName = keyboard.nextLine();
        names.add(firstName);
        
        System.out.println("Enter the second name. ");
        String secondName = keyboard.nextLine();
        names.add(secondName);
        
        System.out.println("Enter the third name. ");
        String thirdName = keyboard.nextLine();
        names.add(thirdName);
        
        System.out.println("Enter the fourth name. ");
        String fourthName = keyboard.nextLine();
        names.add(fourthName);
        
        System.out.println("Enter the fifth name. ");
        String fifthName = keyboard.nextLine();
        names.add(fifthName);
        
        System.out.println("Enter the sixth name. ");
        String sixthName = keyboard.nextLine();
        names.add(sixthName);
        
        
        
        // Sorts the names 
        Collections.sort(names);
        System.out.println(names);
        }
    }
    

