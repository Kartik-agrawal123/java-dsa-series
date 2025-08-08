import java.util.ArrayList;
import java.util.Arrays;
//Create Target array in the given order
public class targetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        ArrayList<Integer> res = new ArrayList<>();

            for(int i = 0;i<=nums.length-1;i++){
                    res.add(index[i], nums[i]);
                }
            
            System.out.println(res);
    }
    
}
