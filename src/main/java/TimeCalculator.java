
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
public class TimeCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Input from users
        System.out.println("Enter a number of seconds. ");
        double userSeconds = keyboard.nextDouble();
        
        
        // Converisons
        double secondsToMinutes = userSeconds / 60;
        double secondsToHours = userSeconds / 3600;
        double secondsToDays = userSeconds / 86400;
        
        
        // Determines how to display seconds
        if (userSeconds < 3600){
            System.out.println(secondsToMinutes + " minutes.");
        } else if ((userSeconds >= 3600) & (userSeconds < 86400)) {
            System.out.println(secondsToHours + " hours.");
        } else if ((userSeconds >= 86400)) {
            System.out.println(secondsToDays + " days.");
        }
        
        
        
    }
}
