//To find out whether the given String is Palindrome or not

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        int i  =0 , j = ch.length-1;
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        String result = String.valueOf(ch);
        if(s.equals(result)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    
}
