package org.academiadecodigo.bootcamp65.simplegfx;

import org.academiadecodigo.bootcamp65.grid.GridDirection;
import org.academiadecodigo.bootcamp65.grid.position.AbstractGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

public class SimpleGfxGridPosition extends AbstractGridPosition {

    private SimpleGfxGrid simpleGfxGrid;
    private Rectangle rectangle;

    public SimpleGfxGridPosition(SimpleGfxGrid grid) {
        super((int) (Math.random() * grid.getCols()), ((int) (Math.random() * grid.getRows())), grid);
        simpleGfxGrid = grid;
        this.rectangle = new Rectangle(grid.colToX(getCol()), grid.rowToY(getRow()), SimpleGfxGrid.CELL_SIZE, SimpleGfxGrid.CELL_SIZE);
    }

    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid) {
        super(col, row, grid);
        simpleGfxGrid = grid;
        this.rectangle = new Rectangle(grid.colToX(getCol()), grid.rowToY(getRow()), SimpleGfxGrid.CELL_SIZE, SimpleGfxGrid.CELL_SIZE);
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
