
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
public class TestScoresAndGrade {
    
    private static void averageTestGrades(){
        Scanner keyboard = new Scanner(System.in);
        
        // Gathering test info from user
        System.out.println("Enter your first test score. ");
        double firstScore = keyboard.nextInt();
        System.out.println("Enter your second test score. ");
        double secondScore = keyboard.nextInt();
        System.out.println("Enter your third test score. ");
        double thirdScore = keyboard.nextInt();
        
        
        // Telling user letter score for first test
        if (firstScore >= 90){
            System.out.println("You got an A on your first test. ");
        } else if ((firstScore < 90) & (firstScore >= 80)){
            System.out.println("You got a B on your first test. ");
        } else if ((firstScore < 80) & (firstScore >= 70)){
            System.out.println("You got a C on your first test.");
        }  else if ((firstScore < 70) & (firstScore >= 60))
            System.out.println("You got a D on your first test. "); 
        else {
            System.out.println("You got an F on the first test");
        } 
        
        
        
        // Telling user letter score for second test
        if (secondScore >= 90){
            System.out.println("You got an A on your second test. ");
        } else if ((secondScore < 90) & (secondScore >= 80)){
            System.out.println("You got a B on your second test. ");
        } else if ((secondScore < 80) & (secondScore >= 70)){
            System.out.println("You got a C on your second test.");
        }  else if ((secondScore < 70) & (secondScore >= 60))
            System.out.println("You got a D on your second test. "); 
        else {
            System.out.println("You got an F on the second test. ");
        } 
        
        
        
        // Telling user letter score for third test
        if (thirdScore >= 90){
            System.out.println("You got an A on your third test. ");
        } else if ((thirdScore < 90) & (thirdScore >= 80)){
            System.out.println("You got a B on your third test. ");
        } else if ((thirdScore < 80) & (thirdScore >= 70)){
            System.out.println("You got a C on your third test.");
        }  else if ((thirdScore < 70) & (thirdScore >= 60))
            System.out.println("You got a D on your third test. "); 
        else {
            System.out.println("You got an F on the third test. ");
        } 
        
        // Calc average score
        double averageScore = (firstScore + secondScore + thirdScore)/3;
        
        
        // Telling user average score in percent and letter grade averaged
        System.out.println("You averaged a " + averageScore + "%");
        if (averageScore >= 90){
            System.out.println("You averaged an A. ");
        } else if ((averageScore < 90) & (averageScore >= 80)){
            System.out.println("You averaged a B. ");
        } else if ((averageScore < 80) & (averageScore >= 70)){
            System.out.println("You averaged a C.");
        }  else if ((averageScore < 70) & (averageScore >= 60))
            System.out.println("You averaged a D. "); 
        else {
            System.out.println("You averaged an F.");
        } 
        
        
    
         }
    
    
    public static void main(String[] args) {
        averageTestGrades();
    }

    }
    

