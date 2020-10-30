
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
public class RunningTheRace {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        


        // Gathering input from user
        System.out.println("Enter the name of the first runner");
        String firstRunner = keyboard.nextLine();
        System.out.println("Enter the time of the first runner in minutes");
        double firstRunnerTime = keyboard.nextDouble();
        
        
        System.out.println("Enter the name of the second runner");
        String secondRunner = keyboard.nextLine();
        System.out.println("Enter the time of the second runner in minutes");
        double secondRunnerTime = keyboard.nextDouble();
        
        System.out.println("Enter the name of the third runner");
        String thirdRunner = keyboard.nextLine();
        System.out.println("Enter the time of the third runner in minutes");
        double thirdRunnerTime = keyboard.nextDouble();
        
        
        // Ouput
        
        if ((firstRunnerTime > secondRunnerTime) & (firstRunnerTime > thirdRunnerTime)) {
            System.out.println(firstRunner + " finihsed in first place.");
        } else if ((secondRunnerTime > firstRunnerTime) & (secondRunnerTime > thirdRunnerTime)) {
            System.out.println(secondRunner + " finished in first.");
        } else if ((thirdRunnerTime > firstRunnerTime) & (thirdRunnerTime > secondRunnerTime)) {
            System.out.println(thirdRunner + " finished in first.");
        }
        
        
    }
    
}
