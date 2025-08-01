//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbersList = new ArrayList<>();
        int s = 0;
        int positiveEven = 0;
        int positiveOdd = 0;
        int negative = 0;
        while((s = sc.nextInt())!=0){
            numbersList.add(s);
        }
        System.out.println(numbersList);
        for(int i = 0;i<=numbersList.size()-1;i++){
            if(numbersList.get(i)>0){
                if(numbersList.get(i)%2 == 0){
                    positiveEven+=  numbersList.get(i);
                }
                else{
                    positiveOdd+=  numbersList.get(i);
                }
            }
            else if(numbersList.get(i)<0){
                negative+= numbersList.get(i);
            }
        }
        System.out.println(positiveEven+" "+positiveOdd+" "+negative);
        

        
    }
    
}
