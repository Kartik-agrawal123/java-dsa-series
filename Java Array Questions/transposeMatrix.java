public class transposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] result = new int[matrix[0].length][matrix.length];
        
        for(int i = 0;i<=result.length-1;i++){
            for(int j = 0;j<=result[i].length-1;j++){
                result[i][j] = matrix[j][i];
            }
        }

        for(int i = 0;i<=result.length-1;i++){
            for(int j = 0;j<=result[i].length-1;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
