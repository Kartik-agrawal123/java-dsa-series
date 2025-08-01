//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number ");
        int a = sc.nextInt();
        System.out.print("Please enter second number ");
        int b = sc.nextInt();
        System.out.print("Please enter which calculation you would be ");
        String s = sc.next();
        int result = 0;

        switch (s) {
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;

            case "*":
                result = a*b;
                break;

            case "/":
                result = a/b;
                break;

            case "%":
                result = a%b;
                break;    
            default:
            System.out.println("You have entered a wrong operator");
                break;
        }
        System.out.println("result will be " + result);
        
    }
    
}
