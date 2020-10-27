
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
public class RomanNumerals {
    
    

    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter a number from 1 to 10 that you want to convert to a roman numeral:");
            int userInput = keyboard.nextInt();
            
            if (userInput > 10) {
                System.out.println("Enter a number between one and ten.");
            } else if (userInput < 1) {
                System.out.println("Enter a number between one and ten.");
            }
            

            switch (userInput) {
                case 1:
                    System.out.println("I");
                case 2:
                    System.out.println("III");
                case 3:
                    System.out.println("III");
                case 4:
                    System.out.println("IV");
                case 5:
                    System.out.println("V");
                case 6:
                    System.out.println("VI");
                case 7:
                    System.out.println("VII");
                case 8:
                    System.out.println("VIII");
                case 9:
                    System.out.println("IX");
                case 10:
                    System.out.println("X");
                
            }
         
    }
    
    
}
