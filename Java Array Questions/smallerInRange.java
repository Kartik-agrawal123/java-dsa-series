//How many numbers are smaller than the Current number
import java.util.Arrays;

public class smallerInRange {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int count = 0;
        int[] smaller = new int[nums.length];
        for(int i = 0;i<=nums.length-1;i++){
            count = 0;
            for(int j  = 0;j<=nums.length-1;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            smaller[i] = count;
        }
        System.out.println(Arrays.toString(smaller));
    }
    
}
