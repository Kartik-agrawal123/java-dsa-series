import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = new ArrayList<>(matrix.length*2);
        int i = 0;
        int j = 0;
        while(i<=j && j<=matrix.length-1){
            result.add(matrix[i][j]);
            j++;
        }
         System.out.println(result);
        
    }
    
}
