package javaapplications1;

import java.util.Scanner;

public class JavaApplications1 {
   private static final Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        int input = 0, age = 0;
        double ans = 0;
        
        for(int a = 0; a < 10; a++){
            System.out.println("Enter an age");
            while (!SC.hasNextInt()){
                System.out.println("That's not a number!");
                SC.next();
            }
            input = SC.nextInt();
            age += input;
        
        
    }
    
    ans = 1.0 * age / 10;
    System.out.print("Average is: " + ans);
    }
}