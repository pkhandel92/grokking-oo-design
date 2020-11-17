package com.chess.piece;

import com.chess.box.Box;

public abstract class Piece {
    private boolean isWhite;
    private boolean isKilled;

    public abstract boolean move(Box start, Box end);
    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }
}
