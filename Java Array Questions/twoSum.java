public class twoSum {
    public static void main(String[] args) {
        int[] nums = {-3,4,3,90};
        int target = 0;

        int[] result = new int[2];
        int m = 0;
        int count = 0;
        for(int i = 0;i<=nums.length-1;i++){
            for(int j = 0;j<=nums.length-1;j++){
                if(((nums[i]+nums[j]) == target) && i!=j){
                    result[m] = i;
                    result[m+1] = j;
                    count++;
                    break;
                }
            }
             if(count == 1){
                    break;
                }
        }
        for(int k = 0;k<=result.length-1;k++){
            System.out.print(result[k]+" ");
        }
    }
    }