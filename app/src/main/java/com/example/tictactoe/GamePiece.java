package com.example.tictactoe;

/**
 * Enumeration of the possible game pieces in tic-tac-toe.
 */

public enum GamePiece {
    CROSS(R.drawable.cross),
    EMPTY(0),
    NOUGHT(R.drawable.nought);

    private final int resourceId;

    GamePiece(int resourceId) {
        this.resourceId = resourceId;
    }

    public int getResourceId() {
        return resourceId;
    }
}
