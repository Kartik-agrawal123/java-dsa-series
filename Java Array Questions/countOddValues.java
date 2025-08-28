public class countOddValues {

    public static void main(String[] args) {
        int m = 2;
        int n= 3;
        int[][] indices = {{0,1},{1,1}};
        int[][] result = new int[m][n];

        for(int i = 0;i<=indices.length-1;i++){
            for(int j = 0;j<=indices[i].length-1;j++){
                if(i == indices[i][j]){
                    result[i][j]++;
                }
            }
        }
    }
    
}
