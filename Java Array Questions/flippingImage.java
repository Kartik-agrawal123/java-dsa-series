//Flipping and Image

import java.util.Arrays;

public class flippingImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] result = new int[image.length][image[0].length];

        for(int i = 0;i<=image.length-1;i++){
                int m = image[i].length-1;
            for(int j = 0;j<image[i].length/2;j++){
                    int replace = image[i][j];   
                    image[i][j] = image[i][m-j];
                    image[i][m-j] = replace;  
                }
        }
        for(int i = 0;i<=image.length-1;i++){
            for(int j = 0;j<=image[i].length-1;j++){
                if(image[i][j] == 0){
                    result[i][j] = 1;
                }
                if(image[i][j] == 1){
                    result[i][j] = 0;
                }
            }
            System.out.println();
        }
        for(int k = 0;k<=result.length-1;k++){
            for(int l = 0;l<=result[k].length-1;l++){
                System.out.print(result[k][l]+" ");
            }
            System.out.println();
        }

     }
    
}
