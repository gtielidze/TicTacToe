package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private Player playerX = new Player("O");
    private Player playerO = new Player("X");
    private Game game = new Game(playerX, playerO);

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane mainLayout = new BorderPane();

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(20, 20, 20, 20));

        mainLayout.setTop(end());

        mainLayout.setCenter(layout);

        Button buttonOne = createButton();
        Button buttonTwo = createButton();
        Button buttonThree = createButton();
        Button buttonFour = createButton();
        Button buttonFive = createButton();
        Button buttonSix = createButton();
        Button buttonSeven = createButton();
        Button buttonEight = createButton();
        Button buttonNine = createButton();

        layout.add(buttonOne, 0, 0);
        layout.add(buttonTwo, 0, 1);
        layout.add(buttonThree, 0, 2);
        layout.add(buttonFour, 1, 0);
        layout.add(buttonFive, 1, 1);
        layout.add(buttonSix, 1, 2);
        layout.add(buttonSeven, 2, 0);
        layout.add(buttonEight, 2, 1);
        layout.add(buttonNine, 2, 2);

        buttonOne.setOnAction((event) -> {
            game.move(0, 0);
            buttonOne.setText(game.getSymbol());
            buttonOne.setDisable(true);
            mainLayout.setTop(end());
        });

        buttonTwo.setOnAction((event) -> {
            game.move(1, 0);
            buttonTwo.setText(game.getSymbol());
            buttonTwo.setDisable(true);
            mainLayout.setTop(end());
        });

        buttonThree.setOnAction((event) -> {
            game.move(2, 0);
            buttonThree.setText(game.getSymbol());
            buttonThree.setDisable(true);
            mainLayout.setTop(end());
        });

        buttonFour.setOnAction((event) -> {
            game.move(0, 1);
            buttonFour.setText(game.getSymbol());
            buttonFour.setDisable(true);
            mainLayout.setTop(end());
        });

        buttonFive.setOnAction((event) -> {
            game.move(1, 1);
            buttonFive.setText(game.getSymbol());
            buttonFive.setDisable(true);
            mainLayout.setTop(end());
        });

        buttonSix.setOnAction((event) -> {
            game.move(2, 1);
            buttonSix.setText(game.getSymbol());
            buttonSix.setDisable(true);
            mainLayout.setTop(end());
        });

        buttonSeven.setOnAction((event) -> {
            game.move(0, 2);
            buttonSeven.setText(game.getSymbol());
            buttonSeven.setDisable(true);
            mainLayout.setTop(end());
        });

        buttonEight.setOnAction((event) -> {
            game.move(1, 2);
            buttonEight.setText(game.getSymbol());
            buttonEight.setDisable(true);
            mainLayout.setTop(end());
        });

        buttonNine.setOnAction((event) -> {
            game.move(2, 2);
            buttonNine.setText(game.getSymbol());
            buttonNine.setDisable(true);
            mainLayout.setTop(end());
        });

        Scene view = new Scene(mainLayout);

        stage.setScene(view);
        stage.show();

    }

    private Button createButton() {
        Button button = new Button(" ");
        button.setFont(Font.font("Monospaced", 40));
        return button;
    }

    private Label end() {
        Label end = new Label(" ");
        if (game.win()) {
            end.setText("The end!");
        } else {
            end.setText("Turn: " + game.symbol());
        }
        return end;
    }
}
