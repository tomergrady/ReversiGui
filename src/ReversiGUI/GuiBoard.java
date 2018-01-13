package ReversiGUI;

import ReversiBase.Board;
import ReversiBase.GamePiece;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.IOException;

public class GuiBoard extends GridPane {
    private Board board;

    public GuiBoard(Board board) {
        this.board = board;
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GuiBoard.fxml"));
//        fxmlLoader.setRoot(this);
//        fxmlLoader.setController(this);
//
//        try {
//            fxmlLoader.load();
//        } catch (IOException exception) {
//            throw new RuntimeException(exception);
//        }
    }

    public void draw() {
        this.getChildren().clear();

        int height = 600;
        int width = 600;

        //this.add(new Label("Item Listing"), 1, 1);

        int cellHeight = height / board.getSize();
        int cellWidth = width / board.getSize();
        System.out.println(cellHeight);
        System.out.println(cellWidth);
        for (int i = 0; i < board.getSize(); i++) {
            for (int j = 0; j < board.getSize(); j++) {
                if (board.getGamePieces()[i][j].isEmpty()) {
                    this.add(new Rectangle(cellWidth, cellHeight, Color.rgb(37, 109, 140)), j, i);
                } else {
                    this.add(new Rectangle(cellWidth, cellHeight, board.getGamePieces()[i][j].getColor()), j, i);
                }
            }
        }
    }

    }