//Take a number as input and print the multiplication table for it

import java.util.Scanner;

public class MultiplyOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a no.");
        int n = sc.nextInt();
        for(int i = 1;i<=105;i++){
            System.out.println(n + "*" + i +"=" + n*i);
        }
        
    }
    
}
