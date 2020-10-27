
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
public class MagicDates {
    
    private static void determineMagic() {

        Scanner keyboard = new Scanner(System.in);

        //Gather date from user
        System.out.println("Enter the day of the month.");
        int userDay = keyboard.nextInt();
        System.out.println("Enter the month of the year.");
        int userMonth = keyboard.nextInt();
        System.out.println("Enter the last 2 digits of the year.");
        int userYear = keyboard.nextInt();
        
        int userDayTimesMonth = userDay * userMonth;
        
        if (userDayTimesMonth == userYear){
            System.out.println("This is a magic date!");
        } else 
            System.out.println("This is not a magic date!");
        
        
    }
    
    public static void main(String[] args) {
        
        determineMagic();
        
    }
    
}
