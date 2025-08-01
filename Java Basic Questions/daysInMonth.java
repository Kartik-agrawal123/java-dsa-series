//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
import java.time.YearMonth;
import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        YearMonth yearOfMonth = YearMonth.of(2025, 8);
        int days = yearOfMonth.lengthOfMonth();
        int evenDays = 0;
        for(int i = 1;i<=days;i++){
            if(i%2 == 0){
                evenDays++;
            }
        }  
        System.out.println(evenDays);
      }
    
}
