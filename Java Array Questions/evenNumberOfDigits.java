public class evenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {437,315,322,431,686,264,442};
        int result = 0;
        int count = 0;
        for(int i = 0;i<=nums.length-1;i++){
            while(nums[i]!=0){
                int n = nums[i]%10;
                count++;
                nums[i] = nums[i]/10;
                }
                if(count%2 == 0){
                    result++;
                }
                count =0;
        }
        System.out.println(result);
    }
    
}
