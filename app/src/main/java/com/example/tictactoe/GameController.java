package com.example.tictactoe;

import android.databinding.BaseObservable;

/**
 * Controller class for the tic-tac-toe game.
 */

public class GameController extends BaseObservable {
    private final GamePiece[][] board = new GamePiece[3][3];
    private GamePiece currentPiece;

    public GameController() {
        reset();
    }

    public GamePiece getPieceAt(int row, int column) {
        return board[row][column];
    }

    public void mark(int row, int column) {
        if (getPieceAt(row, column) != GamePiece.EMPTY)
            return;
        setPieceAt(row, column, currentPiece);
        currentPiece = (currentPiece == GamePiece.CROSS) ? GamePiece.NOUGHT : GamePiece.CROSS;
    }

    private void setPieceAt(int row, int column, final GamePiece piece) {
        board[row][column] = piece;
        // This method does not follow the contract for @Bindable, so report a generic change, which
        // will refresh everything dependent on this object.
        notifyChange();
    }

    public void reset() {
        for (int i = 0; i < board.length; ++i)
            for (int j = 0; j < board[i].length; ++j)
                setPieceAt(i, j, GamePiece.EMPTY);
        currentPiece = GamePiece.CROSS;
    }
}
