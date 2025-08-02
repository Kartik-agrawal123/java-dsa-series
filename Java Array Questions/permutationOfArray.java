//Buid Array From Permutation

import java.util.Arrays;

public class permutationOfArray {
    
    public static void main(String[] args) {
        int[] nums ={0,2,1,5,3,4};
        int[] arr = new int[6];
        for(int i = 0;i<=nums.length-1;i++){
            arr[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(arr));

    }
}
