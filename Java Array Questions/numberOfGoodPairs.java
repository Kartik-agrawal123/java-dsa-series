//Number of Good Pairs;


public class numberOfGoodPairs {
    public static void main(String[] args){
        int[] nums = {1,1,1,1};
         int count = 0;
        for(int i = 0;i<=nums.length-1;i++){
            for(int j  = i+1;j<=nums.length-1;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
}
