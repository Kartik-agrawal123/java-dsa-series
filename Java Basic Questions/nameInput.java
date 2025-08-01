//Take name as input and print a greeting message for that particular name

import java.util.Scanner;

public class nameInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name :");
        String name = sc.next();
        System.out.println("Nice to meet you " + name);
    }
    
}
