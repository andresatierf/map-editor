package org.academiadecodigo.bootcamp65.simplegfx;

import org.academiadecodigo.bootcamp65.grid.Grid;
import org.academiadecodigo.bootcamp65.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGfxGrid implements Grid {

    private int cols;
    private int rows;

    public static final int PADDING = 10;
    public static final int CELL_SIZE = 20;

    public SimpleGfxGrid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

    @Override
    public void init() {
        Rectangle grid = new Rectangle(PADDING, PADDING, cols * CELL_SIZE, rows * CELL_SIZE);
        grid.draw();
    }

    @Override
    public int getCols() {
        return this.cols;
    }

    @Override
    public int getRows() {
        return this.rows;
    }

    @Override
    public GridPosition makeGridPosition() {
        return new SimpleGfxGridPosition(this);
    }

    @Override
    public GridPosition makeGridPosition(int col, int row) {
        return new SimpleGfxGridPosition(col, row, this);
    }
}
