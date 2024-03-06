//2d matrix

public class main {

    public static void main(String[] args, int mat, int n, int m){

        

        for(int row=0; row<n;row++){
            int sum = 0;
            for(col =0;col<m;col++){
                sum += mat[row][col];
            }
        }
        
    }
    
}
