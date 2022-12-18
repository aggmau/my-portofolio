/*
You are given a 3x3 matrix with numbers:
int[][] matrix = {
    {8, 1, 6},
    {3, 5, 7},
    {4, 9, 0},
} 
Output the numbers of the array, each on a new line.
*/

public class Main {
   public static void main(String[] args) {
       int[][] matrix = {
               {8, 1, 6},
               {3, 5, 7},
               {4, 9, 0},
       };
       //output the numbers
       for (int i=0;i< matrix.length; i++){
            for (int j=0;j< matrix.length; j++){
                System.out.println(matrix[i][j]);
            }
       }
   }
}
