package TicTacToe;

public class AI extends Main {

    AI() {
        getAIMove();
    }

    public void getAIMove() {

        // Strategy
        // Look for win
        // Block win
        // Split
        // Block Split
        // Build

        if (lookForWin()) {
            gameOver = true;
        }
        else if (blockWin()) {}
        else if (split()) {}
        else if (blockSplit()) {}
        else {
            build();
        }

    }

    private boolean lookForWin() {

        for (int i = 0; i < 3; i++) {
            // Checking if a win exists in the Horizontal Direction
            if ((b.getBoard()[i][0] + b.getBoard()[i][1] + b.getBoard()[i][2]) == whosMove*2) {
            	System.out.println("h" + i);
                if (b.getBoard()[i][0] == 0) {
                    b.setSquare(i,0,whosMove);
                }
                else if (b.getBoard()[i][1] == 0) {
                    b.setSquare(i,1,whosMove);
                }
                else {
                    b.setSquare(i,2,whosMove);
                }
                return true;
            }
            // Checking if a win exists in the Vertical Direction
            if ((b.getBoard()[0][i] + b.getBoard()[1][i] + b.getBoard()[2][i]) == whosMove*2) {
            	System.out.println("v" + i);
                if (b.getBoard()[0][i] == 0) {
                    b.setSquare(0,i,whosMove);
                }
                else if (b.getBoard()[1][i] == 0) {
                    b.setSquare(1,i,whosMove);
                }
                else {
                    b.setSquare(2,i,whosMove);
                }
                return true;
            }
        }
        // Checking if a win exists in the Diagonal direction
        if ((b.getBoard()[0][0] + b.getBoard()[1][1] + b.getBoard()[2][2]) == whosMove*2) {
        	System.out.println("d1");
            if (b.getBoard()[0][0] == 0) {
                b.setSquare(0,0,whosMove);
            }
            else if (b.getBoard()[1][1] == 0) {
                b.setSquare(1,1,whosMove);
            }
            else {
                b.setSquare(2,2,whosMove);
            }
            return true;
        }
        if ((b.getBoard()[0][2] + b.getBoard()[1][1] + b.getBoard()[2][0]) == whosMove*2) {
        	System.out.println("d2");
            if (b.getBoard()[0][2] == 0) {
                b.setSquare(0,2,whosMove);
            }
            else if (b.getBoard()[1][1] == 0) {
                b.setSquare(1,1,whosMove);
            }
            else {
                b.setSquare(2,0,whosMove);
            }
            return true;
        }

        System.out.println("Look for Win: False");
        // Returning 0 if no result was found
        return  false;

    }

    private boolean blockWin() {

        for (int i = 0; i < 3; i++) {
            // Checking if a win exists in the Horizontal Direction
            if ((b.getBoard()[i][0] + b.getBoard()[i][1] + b.getBoard()[i][2]) == (((whosMove + 2) % 4)*2)) {
            	System.out.println("h" + i);
                if (b.getBoard()[i][0] == 0) {
                    b.setSquare(i,0,whosMove);
                }
                else if (b.getBoard()[i][1] == 0) {
                    b.setSquare(i,1,whosMove);
                }
                else {
                    b.setSquare(i,2,whosMove);
                }
                return true;
            }
            // Checking if a win exists in the Vertical Direction
            if ((b.getBoard()[0][i] + b.getBoard()[1][i] + b.getBoard()[2][i]) == (((whosMove + 2) % 4)*2)) {
            	System.out.println("h" + i);
                if (b.getBoard()[0][i] == 0) {
                    b.setSquare(0,i,whosMove);
                }
                else if (b.getBoard()[1][i] == 0) {
                    b.setSquare(1,i,whosMove);
                }
                else {
                    b.setSquare(2,i,whosMove);
                }
                return true;
            }
        }
        // Checking if a win exists in the Diagonal direction
        if ((b.getBoard()[0][0] + b.getBoard()[1][1] + b.getBoard()[2][2]) == (((whosMove + 2) % 4)*2)) {
        	System.out.println("d1");
            if (b.getBoard()[0][0] == 0) {
                b.setSquare(0,0,whosMove);
            }
            else if (b.getBoard()[1][1] == 0) {
                b.setSquare(1,1,whosMove);
            }
            else {
                b.setSquare(2,2,whosMove);
            }
            return true;
        }
        if ((b.getBoard()[0][2] + b.getBoard()[1][1] + b.getBoard()[2][0]) == (((whosMove + 2) % 4)*2)) {
        	System.out.println("d2");
            if (b.getBoard()[0][2] == 0) {
                b.setSquare(0,2,whosMove);
            }
            else if (b.getBoard()[1][1] == 0) {
                b.setSquare(1,1,whosMove);
            }
            else {
                b.setSquare(2,0,whosMove);
            }
            return true;
        }

        System.out.println("Block Win: False");
        // Returning 0 if no result was found
        return  false;

    }

    public boolean split() {



        return false;
    }

    public boolean blockSplit() {



        return false;
    }

    public boolean build() {

        while ((b.setSquare((int)(Math.random() * 3), (int)(Math.random() * 3), whosMove)) == false) {

        }

        return false;
    }

}


