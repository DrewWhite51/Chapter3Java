
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
public class WiFiDiagnosticTree {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Reboot the computer and try to connect.");
        System.out.print("Did that fix the problem? ");
        String response = sc.nextLine();
      
        if(response.toLowerCase().equals("no")) {
            System.out.println("Reboot the router and try to connect.");
            System.out.print("Did that fix the problem? ");
            response = sc.nextLine();

            if(response.toLowerCase().equals("no")){
                System.out.println("Make sure the cables between the router & modem are plugged in firmly.");
                System.out.print("Did that fix the problem? ");
                response = sc.nextLine();
      
                    if(response.toLowerCase().equals("no")){
                        System.out.println("Move the router to a new location and try to connect.");
                        System.out.print("Did that fix the problem? ");
                        response = sc.nextLine();
      
                        if(response.toLowerCase().equals("no")){
                            System.out.println("Get a new router.");
                    }
                }
            }
        }
   }
    
    
}
