import java.util.Scanner;

public class rupeesToUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value in INR");
        int n = sc.nextInt();
        float usd = (float) (n * 0.011);
        System.out.println("Your USD amount is " + usd );
    }
}