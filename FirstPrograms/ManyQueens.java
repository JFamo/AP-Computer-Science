public class ManyQueens{
    public static int width;
    public static int height;
    public static int[][] board;
    
    public static void getPlacement(int w, int h){
        width = w;
        height = h;
        board = new int[width][height];
        if(placeSafeQueen(0)){
            System.out.println("Solution : ");
        }
        else{
            System.out.println("No Solution : ");
        }
        printBoard();
    }
    
    public static boolean placeSafeQueen(int col){
        for(int row = 0; row < height; row ++){
            if(isSafe(row, col)){
               board[row][col] = 1;
               if(col == width - 1){
                    return true;
               }
               else{
                    if(placeSafeQueen(col+1)){
                        return true;
                    }
                    else{
                        board[row][col] = 0;
                    }
               }
            }
        }
        return false;
    }
    public static boolean isSafe(int row, int col){
        //check row
        for(int c = 0; c < width; c ++){
            if(board[row][c] != 0 && c != col){
                return false;
            }
        }
        //check diagonal going up
        int c = 1;
        for(int r = 1; r <= row; r ++){
            //going left
            if(col - c >= 0){
                if(board[row - r][col - c] != 0){
                    return false;
                }
            }
            //going right
            if(col + c < width){
                if(board[row - r][col + c] != 0){
                    return false;
                }
            }
            c++;
        }
        //check diagonal going down
        c = 1;
        for(int r = 1; r < height-row; r ++){
            //going left
            if(col - c >= 0){
                if(board[row + r][col - c] != 0){
                    return false;
                }
            }
            //going right
            if(col + c < width){
                if(board[row + r][col + c] != 0){
                    return false;
                }
            }
            c++;
        }
        //all else
        return true;
    }
    
    public static void printBoard(){
        for(int row = 0; row < width; row ++){
            for(int col = 0; col < height; col ++){
                if(board[row][col] == 1){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("_ ");
                }
            }
            System.out.println("");
        }
    }
}