//Finf the Highest Altitude

import java.util.Arrays;

public class highestAltitude {
    public static void main(String[] args) {

        int[] gain = {-5,1,5,0,-7};
        int[] result = new int[gain.length+1];

        int sum = 0;
        int max = 0;
        
        for(int i = 0;i<=gain.length-1;i++){
            sum = sum + gain[i];
            result[i+1] = sum;
        }
        for(int j = 0;j<=result.length-1;j++){
            if(max<result[j]){
                max = result[j];
            }
        }
        System.out.println(max);
    }
    
}
