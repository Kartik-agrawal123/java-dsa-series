//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all

import java.util.Scanner;

public class userEnter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Please enter a word ");
        String word = sc.next();
        while(!word.equalsIgnoreCase("x")){
            System.out.print ("Please enter a number");
            int num = sc.nextInt();
            sum = sum + num;
            System.out.print("Please enter a word ");
             word = sc.next();
        }
        System.out.println(sum);
    }
}