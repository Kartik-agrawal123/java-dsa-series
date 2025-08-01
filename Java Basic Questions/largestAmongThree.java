//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;

public class largestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.println("largest is "+ num1);
            }
            else{
                System.out.println("largest is "+ num3);
            }
        }
        else{
            if(num2>num3){
                System.out.println("largest is "+ num2);
            }
            else{
                System.out.println("largest is "+ num3);
            }
        }

    }
    
}
