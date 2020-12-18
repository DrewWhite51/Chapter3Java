
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
        System.out.println("Enter the name of the first runner.");
        String firstRunner = keyboard.nextLine();
        System.out.println("Enter the name of the second runner.");
        String secondRunner = keyboard.nextLine();
        System.out.println("Enter the name of the third runner.");
        String thirdRunner = keyboard.nextLine();
        
        System.out.println("Enter the time it took for the first runner to finish the race in minutes");
        int firstRunnerTime = keyboard.nextInt();
        System.out.println("Enter the time it took for the second runner to finish the race in minutes");
        int secondRunnerTime = keyboard.nextInt();
        System.out.println("Enter the time it took for the third runner to finish the race in minutes");
        int thirdRunnerTime = keyboard.nextInt();
        
        if (firstRunnerTime < secondRunnerTime && secondRunnerTime < thirdRunnerTime){
            System.out.println(firstRunner + " came in first");
            System.out.println(secondRunner + " came in second");
            System.out.println(thirdRunner + " came in third");
        } else if (firstRunnerTime < thirdRunnerTime && thirdRunnerTime < secondRunnerTime) {
            System.out.println(firstRunner + " came in first");
            System.out.println(thirdRunner + " came in second");
            System.out.println(secondRunner + " came in third");
        } else if (secondRunnerTime < firstRunnerTime && firstRunnerTime < thirdRunnerTime) {
            System.out.println(secondRunner + " came in first");
            System.out.println(firstRunner + " came in second");
            System.out.println(thirdRunner + " came in third");
        } else if (secondRunnerTime < thirdRunnerTime && thirdRunnerTime < firstRunnerTime){
            System.out.println(secondRunner + " came in first");
            System.out.println(thirdRunner + " came in second");
            System.out.println(firstRunner + " came in third");
        } else if (thirdRunnerTime < secondRunnerTime && secondRunnerTime < firstRunnerTime) {
            System.out.println(thirdRunner + " came in first");
            System.out.println(secondRunner + " came in second");
            System.out.println(firstRunner + " came in third");
        } else if (thirdRunnerTime < firstRunnerTime && firstRunnerTime < secondRunnerTime) {
            System.out.println(thirdRunner + " came in first");
            System.out.println(firstRunner + " came in second");
            System.out.println(secondRunner + " came in third");
        }
    }
}
