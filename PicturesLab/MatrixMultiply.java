public class MatrixMultiply{
    public static void main(String args[]){
        int a[][] = {{1,2,-2,0},{-3,4,7,2},{6,0,3,1}};
        int b[][] = {{-1,3},{0,9},{1,-11},{4,-5}};
        printArray(multiply(a,b));
    }
    
    public static int[][] multiply(int[][] a, int[][] b){
        int[][] out = new int[a.length][b[0].length];
        for(int col = 0; col < b[0].length; col ++){
            for(int row = 0; row < a.length; row ++){
                int sum = 0;
                for(int count = 0; count < a[0].length; count ++){
                    sum += (a[row][count] * b[count][col]);
                }
                out[row][col] = sum;
            }
        }
        return out;
    }
    
    public static void printArray(int[][] o){
        for(int row = 0; row < o.length; row ++){
            for(int col = 0; col < o[0].length; col ++){
                System.out.print(o[row][col] + "\t");
            }
            System.out.print("\n");
        }
    }
}