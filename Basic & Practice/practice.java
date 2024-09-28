public class practice {
    public static void main(String[] args) {
        int n = 3;
        int size = (int) Math.pow(n, 2);
        int matrix[][] = new int[n][n];
        int val = 1;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                matrix[i][j] = val;
                val++;
            }
        }
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
