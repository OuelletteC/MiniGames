package TicTacToe;

public class Main {

    static Board b = new Board();
    final static int x = 1;
    final static int o = 3;

    

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

        //int aiMove = getAIMove(b, 1);

        //launch(args);
    	
    	int moves = 0;
        while ((!b.getGameOver()) && moves < 9) {
            new AI();
            System.out.println(b.toString());
            moves++;
        }
        
        if ((b.getWhosMove() == 1) && (b.getGameOver() == true)) {
            System.out.println("O Wins!!!!!!!!!");
        }
        else if ((b.getWhosMove() == 3) && (b.getGameOver() == true)) {
            System.out.println("X Wins!!!!!!!!!");
        }
        else {
            System.out.println("It's a Draw");
        }
    	

    }
    
    public void playGame() {
    	
    	
        
    }

    

}
