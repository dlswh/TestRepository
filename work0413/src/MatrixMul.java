public class MatrixMul {
    public static void main(String[] args){
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] AB = new int[2][2];

        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                AB[i][j] += A[i][j]*B[j][i];
            }
        }
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                System.out.printf("%3d", AB[i][j]);
            }
            System.out.println();
        }
    }    
}
