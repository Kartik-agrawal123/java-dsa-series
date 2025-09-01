public class matrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
              {4,5,6},
              {7,8,9}};
        
        int length = mat.length;
        int sum = 0;

        for(int i = 0;i<=mat.length-1;i++){
            for(int j = 0;j<=mat[i].length-1;j++){
                if(i == j || (i+j) == length-1){
                    sum = sum + mat[i][j];
                }
            }
        }
        System.out.println(length);
        System.out.print(sum);
    }
    
}
