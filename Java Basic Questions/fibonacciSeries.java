//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for where you want to fibonacci serirs");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = a+b;
        System.out.print(a+" "+b+" ");
        for(int i = 2;i<n;i++){
            a = b;
            b = c;
            System.out.print(c+" ");
            c = a+b;

        }        
    }
    
}
