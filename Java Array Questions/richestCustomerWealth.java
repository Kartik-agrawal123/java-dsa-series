//Richest Customer Wealth
public class richestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        
        int max = 0;
        for(int i = 0;i<=accounts.length-1;i++){
            int sum = 0;
            for(int j = 0;j<=accounts[i].length-1;j++){
                sum = sum + accounts[i][j];
            }
            if(sum>max){
                max = sum;
            }
        }
        System.out.println(max);
    }
    
}
