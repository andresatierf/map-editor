package org.academiadecodigo.bootcamp65.simplegfx;

import org.academiadecodigo.bootcamp65.grid.Grid;
import org.academiadecodigo.bootcamp65.grid.position.AbstractGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;

    public SimpleGfxGridPosition(Grid grid) {
        super((int) (Math.random() * grid.getCols()), ((int) (Math.random() * grid.getRows())), grid);
    }

    public SimpleGfxGridPosition(int col, int row, Grid grid) {
        super(col, row, grid);
    }

    @Override
    public void show() {
        this.rectangle.fill();
    }

    @Override
    public void hide() {
        this.rectangle.delete();
    }
}
