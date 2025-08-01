//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class largestAmongTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("A is largest");
        }
        else if(b>a){
            System.out.println("B is largest");
        }
        else{
            System.out.println("Both are same");
        }
    }
    
}
