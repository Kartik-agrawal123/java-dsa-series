//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter principle amount");
        int p = sc.nextInt();
        System.out.print("Please enetr rate of Interest");
        float r = sc.nextFloat();
        System.out.print("Please enter time");
        int t = sc.nextInt();

        float SI = (p*r*t)/100;

        System.out.println("Simple Interest is: "+ SI);
        
    }
    
}
