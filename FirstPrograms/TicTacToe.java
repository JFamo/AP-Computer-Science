import java.util.Scanner;

public class TicTacToe{
    public static void main(String args[]){
        //vars
        Scanner scan = new Scanner(System.in);
        int[][] board = new int[3][3];
        boolean exit = false;
        int go = -1, turn = 0;
        
        //setup
        int count = 1;
        for(int row = 0; row < board.length; row ++){
            for(int col = 0; col < board[row].length; col ++){
                board[row][col] = count;
                count++;
            }
        }
    
        //game loop
        while(!exit){
            //clear board
            System.out.print('\u000C');
            //print
            printBoard(board);
            //input
            System.out.println((turn == 0) ? "It is the X's turn." : "It is the O's turn.");
            System.out.println("Enter the space you want to go in : ");
            try{
                go = scan.nextInt();
            }catch(Exception e){
                System.out.println("Invalid Input!");
            }
            //check if we can
            for(int row = 0; row < board.length; row ++){
                for(int col = 0; col < board[row].length; col ++){
                    if(board[row][col] == go && board[row][col] != 0 && board[row][col] != -1){
                        board[row][col] = (turn == 0) ? -1 : 0;
                    }
                    else if(board[row][col] == 0 && board[row][col] == -1){
                        System.out.println("Invalid move! Turn forfeit!");
                    }
                }
            }
            //we have moved, change turn
            turn = (turn == 0) ? 1 : 0;
            //check for winners
            int win = isWinner(board);
            System.out.println(win);
            if(win < 1){
                if(win == 0){
                    System.out.println("--- X's WIN! ---");
                }else{
                    System.out.println("--- O's WIN! ---");
                }
                exit = true;
                printBoard(board);
            }
            else if(win == 2){
                System.out.println("--- NO WINNER! ---");
                exit = true;
                printBoard(board);    
            }
        }
    }
    
    public static int isWinner(int[][] board){
        //validate rows
        for(int row = 0; row < board.length; row ++){
            if(board[row][0] == board[row][1] && board[row][0] == board[row][2]){
                if(board[row][0] == -1){
                    return -1;
                }else{
                    return 0;
                }
            }
        }
        //validate columns
        for(int col = 0; col < board[0].length; col ++){
            if(board[0][col] == board[1][col] && board[0][col] == board[2][col]){
                if(board[0][col] == -1){
                    return -1;
                }else{
                    return 0;
                }
            }    
        }
        //validate diagonals
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2]){
            if(board[0][0] == -1){
                return -1;
            }else{
                return 0;
            }
        }
        if(board[0][2] == board[1][1] && board[0][2] == board[2][0]){
            if(board[0][0] == -1){
                return -1;
            }else{
                return 0;
            }
        }
        boolean hasOpenSpace = false;
        for(int row = 0; row < board.length; row ++){
            for(int col = 0; col < board[row].length; col ++){
                if(board[row][col] > 0){
                        hasOpenSpace = true;
                }
            }
        }
        if(!hasOpenSpace){
            return 2;
        }
        return 1;
    }
    
    public static void printBoard(int[][] board){
        for(int row = 0; row < board.length; row ++){
            System.out.println("-------------");
            for(int col = 0; col < board[row].length; col ++){
                if(board[row][col] > 0){
                    System.out.print("- " + board[row][col] + " ");
                }
                else if(board[row][col] == 0){
                    System.out.print("- O ");
                }
                else{
                    System.out.print("- X ");
                }
            }
            System.out.print("-\n");
        }
        System.out.println("-------------");
    }
}