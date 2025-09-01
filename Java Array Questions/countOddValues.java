import java.util.Arrays;

public class countOddValues {

    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[] row = new int[m];
        int[] col= new int [n];
        int[][] indices = {{0,1},{1,1}};

        for (int[] index : indices) {
            row[index[0]]++;
            col[index[1]]++;
        }

        int oddCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((row[i] + col[j]) % 2 == 1) {
                    oddCount++;
                }
            }
        }
        System.out.print(oddCount);
    }
    
}
