import java.util.Scanner;


public class ExerMatriz {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

       
        System.out.println();

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){ 
                
                if(mat[i][j] == x) {
                    System.out.println("Postion " + i + "," + j + ":");
                
                    if (j < mat[i].length - 1){
                    int right = mat[i][j + 1];
                    System.out.println("Right: " + right );
                    }

                if (j > 0){
                    int left = mat[i][j - 1];
                    System.out.println("Left: " + left );
                }

                    if (i > 0){
                    int up = mat[i - 1][j];
                    System.out.println("Up: " + up );
                }

                if (i < mat.length - 1){
                    int down = mat[i + 1][j];
                    System.out.println("Down: " + down);
            }
        
        }
        
       
        sc.close();
    }
   }
  }
}

