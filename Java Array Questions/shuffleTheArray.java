//Shuffle the Array
import java.util.Arrays;

public class shuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] nextArr = new int[nums.length/2];
        int j = 0;
        for(int i = 0;i<=nums.length-1;i++){
            if(i == n || i>n){
                if(j<nextArr.length){
                nextArr[j] = nums[i]; 
            }
              j++;
        }
    }
    int[] newArr = new int[nums.length];
    int k = 0;
    for(int m = 0;m<=nextArr.length-1; m++){
        newArr[k] = nums[m];
        newArr[k+1] = nextArr[m];
        k += 2;
    }
        System.out.println(Arrays.toString(newArr));
    }
    
}
