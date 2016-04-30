package TicTacToe;

import java.util.Scanner;

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
    	
    	System.out.println(b.toString());
    	
    	int playerMove = 0;
    	Scanner s = new Scanner(System.in);
    	
    	while ((!b.getGameOver()) && b.getNumMoves() < 10) {
    		
    		boolean legalMove = false;
    		
    		while (!legalMove) {
    			
		    	System.out.println("Make a move by typing the square number you wish to play in");
		    	playerMove = s.nextInt();
		    	
		    	if (playerMove > 0 && playerMove < 10) {
		    		
		    		switch (playerMove) {
		    		
		    		case 1:
		    			legalMove = b.setSquare(0,0,b.getWhosMove());
		    			break;
		    		case 2:
		    			legalMove = b.setSquare(0,1,b.getWhosMove());
		    			break;
		    		case 3:
		    			legalMove = b.setSquare(0,2,b.getWhosMove());
		    			break;
		    		case 4:
		    			legalMove = b.setSquare(1,0,b.getWhosMove());
		    			break;
		    		case 5:
		    			legalMove = b.setSquare(1,1,b.getWhosMove());
		    			break;
		    		case 6:
		    			legalMove = b.setSquare(1,2,b.getWhosMove());
		    			break;
		    		case 7:
		    			legalMove = b.setSquare(2,0,b.getWhosMove());
		    			break;
		    		case 8:
		    			legalMove = b.setSquare(2,1,b.getWhosMove());
		    			break;
		    		case 9:
		    			legalMove = b.setSquare(2,2,b.getWhosMove());
		    			break;
		    		
		    		}
		    		
		    	}
    		}
	    	System.out.println(b.toString());
	    	
	    	if (b.checkIfWin()) {
	    		b.setGameOver(true);
	    		//System.out.println("You WIN!!!");
	    		break;
	    	}
	    	
	    	//if (playerMove == 9) {
	    	//	break;
	    	//}
	    	
	    	new AI();
            System.out.println(b.toString());
    	
    	}
    	
    	/*
    	int moves = 0;
        while ((!b.getGameOver()) && moves < 9) {
            new AI();
            System.out.println(b.toString());
            moves++;
        }
        */
        
        
        
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
