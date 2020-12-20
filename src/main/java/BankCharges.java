
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
public class BankCharges {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Enter the number of checks you need to deposit");
        double numberOfChecks = keyboard.nextInt();
        double under20 = numberOfChecks*.1;
        double twentyToForty = numberOfChecks*.08;
        double fortyToSixty = numberOfChecks * .06;
        double moreThanSixty = numberOfChecks * .04;
        
        if (numberOfChecks < 20){
            System.out.println("The service fee for this month is: $" + under20 );
        } else if (numberOfChecks > 19 && numberOfChecks < 40){
            System.out.println("The service fee for this month is: $" + twentyToForty);
        } else if (numberOfChecks > 39 && numberOfChecks < 60) {
            System.out.println("The service fee for this month is: $" + fortyToSixty);
        } else if (numberOfChecks > 59) {
            System.out.println("The service fee for this month is: $" + moreThanSixty);
        }
    }
}
