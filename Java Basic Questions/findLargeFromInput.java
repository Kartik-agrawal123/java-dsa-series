//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class findLargeFromInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int large = 0;
        int num;
        do{
            num = sc.nextInt();
            if(num>large){
                large = num;
            }

        }while(num!=0);

        System.out.println(large);

    }
    
}
