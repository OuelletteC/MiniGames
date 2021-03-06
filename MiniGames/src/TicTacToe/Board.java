package TicTacToe;

class Board {

    // 3x3 TicTacToe board where 0 represents empty, 1 represent X, 2 represents O
    private int board[][] = new int[3][3];
    
    private boolean gameOver = false;
    private int whosMove = 1;
    private int numMoves = 0;
    
    Board() {
        createBoard();
    }

    // Initializing board squares to empty
    public void createBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.board[i][j] = 0;
            }
        }
    }
    
    public boolean checkIfWin() {

        for (int i = 0; i < 3; i++) {
            
            if (this.board[i][0] != 0 && (this.board[i][0] == this.board[i][1] && this.board[i][1] == this.board[i][2])) {
            	
                return true;
            }
            
            if (this.board[0][i] != 0 && (this.board[0][i] == this.board[1][i] && this.board[1][i] == this.board[2][i])) {
            	           
                return true;
            }
        }
       
        if (this.board[0][0] != 0 && (this.board[0][0] == this.board[1][1] && this.board[1][1] == this.board[2][2])) {
        	
            return true;
        }
        if (this.board[0][2] != 0 && (this.board[0][2] == this.board[1][1] && this.board[1][1] == this.board[2][0])) {
        	
            return true;
        }

        // Returning false if no result was found
        return  false;

    }


    // Takes the coordinates and enters 1 or 3 representing X or O
    public boolean setSquare(int X, int Y, int value) {
        if (X >= 0 && X <= 2) {
            if (Y >= 0 && Y <= 2) {
                if (this.board[X][Y] == 0) {
                    if (value == 1 || value == 3) {
                        this.board[X][Y] = value;
                                          
                        this.numMoves++;
                        this.whosMove = (this.whosMove + 2) % 4;
                        
                        return true;
                    }
                    else {
                        System.out.println("X or O not specified correctly");
                        return false;
                    }
                }
                else {
                	System.out.println("Square already occupied");
                    return false;
                }
            }
            else {
                System.out.println("Y out of bounds");
                return false;
            }
        }
        else {
            System.out.println("Y out of bounds");
            return false;
        }

    }

    public String toString() {
        String s = "";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.board[i][j] == 1) {
                    s = s + "X";
                }
                else if (this.board[i][j] == 3) {
                    s = s + "O";
                }
                else {
                	
                	int formula = (j + 1) + (i * 3);
                	
                	s = s + formula;
                	
                    //s = s + "-";
                }
                s = s + "  ";
            }
            s = s + "\n";
        }
        
        return s;
    }
    
    public int[][] getBoard() {
        return board;
    }
    
    public int getWhosMove() {
    	return this.whosMove;
    }
    
    public boolean getGameOver() {
    	return this.gameOver;
    }
    
    public void setGameOver(boolean status) {
    	this.gameOver = status;
    }

    public int getNumMoves() {
    	return this.numMoves;
    }

}
