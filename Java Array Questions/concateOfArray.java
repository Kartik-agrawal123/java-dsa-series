/// Concatenation of Array
import java.util.Arrays;

public class concateOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] newConct = new int[2*nums.length];
        int j = 0;
        if(j<newConct.length){
        for(int i = 0;i<=nums.length-1;i++){
            newConct[j] = nums[i];
            newConct[nums.length+j] = nums[i];
            j++;
        }
        }
        System.out.println(Arrays.toString(newConct));
    }
    
}
