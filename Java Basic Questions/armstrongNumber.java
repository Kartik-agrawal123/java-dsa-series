//To find Armstrong Number between two given number.

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orgNum = n;
        int res = 0;
        int length = String.valueOf(n).length();
        while(n>0){
            int num = n%10;
            res = res + (int)Math.pow(num, length);
            n = n/10;
        }       
        if(res == orgNum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    
}
