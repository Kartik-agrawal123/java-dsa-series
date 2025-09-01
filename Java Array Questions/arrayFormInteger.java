import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayFormInteger {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        int i = num.length - 1; 
        int carry = k;
        List<Integer> list  = new ArrayList<>();
        while (i >= 0 || carry > 0) {
            if (i >= 0) {
                carry += num[i];
                i--;
             }
         list.add(carry % 10); 
         carry /= 10;        
            }
        Collections.reverse(list);
        System.out.println(list);
    }
    
}
