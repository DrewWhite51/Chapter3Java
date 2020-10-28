
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
public class SoftwareSales {
    
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the amount of sales");
        double numberOfSales = keyboard.nextDouble();
        
        double calcMoney = numberOfSales * 99;
        double below20Disc = calcMoney - (calcMoney * .2);
        double below50Disc = calcMoney - (calcMoney * .3);
        double below100Disc = calcMoney - (calcMoney * .4);
        double over100Disc = calcMoney - (calcMoney * .5);
        
        
        if ((numberOfSales >= 10) & (numberOfSales < 20)) {
            System.out.println("$" + below20Disc);
        } if ((numberOfSales >= 20) & (numberOfSales < 50)) {
            System.out.println("$" + below50Disc);
        } if ((numberOfSales >= 50) & (numberOfSales < 100)) {
            System.out.println("$" + below100Disc);
        } if (numberOfSales > 100) {
            System.out.println("$" + over100Disc);
        }
        
        
    }
}
