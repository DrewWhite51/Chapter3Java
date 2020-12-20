
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
public class BookClubPoints {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of books you have purchsed: ");
        int numberOfBooks = keyboard.nextInt();
        int numberOfPoints = 1;
        
        if (numberOfBooks == 0){
            numberOfPoints = 0;
        } else if (numberOfBooks == 1) {
            numberOfPoints = 5;
        } else if (numberOfBooks == 2) {
            numberOfPoints = 15;
        } else if (numberOfBooks == 3) {
            numberOfPoints = 30;
        } else if (numberOfBooks >= 4) {
            numberOfPoints = 60;
        }
    
        System.out.println("The number of points you got for the purchase is " + numberOfPoints);

    }
    
    
}
