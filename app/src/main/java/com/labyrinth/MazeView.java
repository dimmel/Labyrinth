package com.labyrinth;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public class MazeView extends View {
    private GameManager gameManager;

    public MazeView(Context context, GameManager gameManager) {
        super(context);
        this.gameManager = gameManager;
        gameManager.setView(this);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        gameManager.draw(canvas);
    }
}
