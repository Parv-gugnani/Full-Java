//2d matrix

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args){


        //input of 2darr

        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int [][] arr = new int[row][col];

        // for(int i = 0; i < row; i++){
        //     for(int j = 0; j <col; j++) {
        //         arr[i][j] = scanner.nextInt();
        //     }
        // }

        // System.out.println("This is how it looks like: ");
        

        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < col; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        

        /// Q 1
        // You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.

        // int rows = A.size();
        // int cols = A.get(0).size();
        // ArrayList<Integer> columnSums = new ArrayList<>();



        // // Calculate column-wise sums
        // for (int j = 0; j < cols; j++) {
        //     int sum = 0;
        //     for (int i = 0; i < rows; i++) {
        //         sum += A.get(i).get(j);
        //     }
        //     columnSums.add(j, sum);
        // }

        // return columnSums;  
    }


//Q 5  Rotate the image by 90 degrees m
    public void solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = A.get(i).get(j);
                A.get(i).set(j, A.get(j).get(i));
                A.get(j).set(i, temp);
            }
        }
        

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = A.get(i).get(left);
                A.get(i).set(left, A.get(i).get(right));
                A.get(i).set(right, temp);
                left++;
                right--;
            }
        }
    }
    
}
