//Kids with Greatest Number of Candies
import java.util.ArrayList;
import java.util.List;

public class kidsCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        List<Boolean> kids = new ArrayList<>(candies.length);
        int sum = 0;
        int count = 0;
        int extraCandies = 3;
        for(int i = 0;i<=candies.length-1;i++){
            sum = extraCandies + candies[i];
             count = 0;
            for(int j = 0;j<=candies.length-1;j++){
                if(candies[j]<=sum){
                    count++;
                }
            }
            if(count == candies.length){
                kids.add(true);
            }
            else{
                kids.add(false);
            }
        }
        System.out.println(kids);
    }
    
}
