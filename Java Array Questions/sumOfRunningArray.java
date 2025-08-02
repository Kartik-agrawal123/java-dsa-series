//Running sum of 1D Array;
import java.util.Arrays;

public class sumOfRunningArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
         int[] ansArr = new int[nums.length];
        int sum  = 0;
        for(int i = 0;i<=nums.length-1;i++){
            sum = sum + nums[i];
            ansArr[i] = sum;
        }
System.out.println(Arrays.toString(ansArr));    
}
    
}
