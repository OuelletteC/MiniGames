package TicTacToe;

public class Main extends GUI {

    public static Board b = new Board();
    final static int x = 1;
    final static int o = 3;

    static boolean gameOver = false;
    int whosMove = 1;

    public static enum Player {
    	X,O
    }

    public static void main(String[] args){



        // Test Game
        /*
        b.setSquare(0,0,x);
        System.out.println(b.toString());
        b.setSquare(1,0,o);
        System.out.println(b.toString());
        b.setSquare(0,2,x);
        System.out.println(b.toString());
        b.setSquare(0,1,o);
        System.out.println(b.toString());
        b.setSquare(1,1,x);
        System.out.println(b.toString());
        */

    	/*
        int moves = 0;
        while ((!gameOver) && moves < 9) {
            AI aiMove = new AI();
            System.out.println(b.toString());
            moves++;
        }

        if ((whosMove == 1) && (gameOver)) {
            System.out.println("O Wins!!!!!!!!!");
        }
        else if ((whosMove == 3) && (gameOver)) {
            System.out.println("X Wins!!!!!!!!!");
        }
        else {
            System.out.println("It's a Draw");
        }
        */


        //int aiMove = getAIMove(b, 1);

        launch(args);

    }

    public int getWhosMove() {
    	return whosMove;
    }

}
