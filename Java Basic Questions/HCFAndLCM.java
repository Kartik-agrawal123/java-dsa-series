//Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class HCFAndLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int forLCM = a*b;
        // For HCF
        while(b!=0){
            int temp = b;
            b = a% b;
            a = temp;
        }
        System.out.println("HCF will be "+a);

        // LCM
        int lcm = forLCM/a;
        System.out.println("LCM will be " + lcm);
        
    }
}