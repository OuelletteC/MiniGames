package TicTacToe;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

// Class to create the User Interface
public class GUI extends Application {

	final Label labelX = new Label("X");
	final Label labelY = new Label("Y");
	final Label labelSpace = new Label(" ");
	Stage s = new Stage();

    @Override
    public void start(Stage stage) throws Exception{

        this.s.setTitle("Games");
        this.s.setWidth(800);
        this.s.setHeight(600);

        this.s.setScene(createBoard());

        this.s.show();



    }

    // Creating the board
    private Scene createBoard() {

        GridPane gp = new GridPane();
        gp.setHgap(8);
        gp.setVgap(8);
        Scene s = new Scene(gp);

        int board[][] = Main.b.getBoard();

        Label labels[][] = new Label[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                labels[i][j] = new Label(Integer.toString(board[i][j]));
            }
        }

        /*
        labels[0][0] = new Label(Integer.toString(board[0][0]));
        labels[0][1] = new Label(Integer.toString(board[0][1]));
        labels[0][2] = new Label(Integer.toString(board[0][2]));
        labels[1][0] = new Label(Integer.toString(board[1][0]));
        labels[1][1] = new Label(Integer.toString(board[1][1]));
        labels[1][2] = new Label(Integer.toString(board[1][2]));
        labels[2][0] = new Label(Integer.toString(board[2][0]));
        labels[2][1] = new Label(Integer.toString(board[2][1]));
        labels[2][2] = new Label(Integer.toString(board[2][2]));
        */

        labels[0][0].addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
            	Main.b.setSquare(0,0,1);
            	labels[0][0].setText(Integer.toString(board[0][0]));
            	gp.requestLayout();

            }
        });


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gp.add(labels[i][j],i,j);
            }
        }





        return s;

    }


}
