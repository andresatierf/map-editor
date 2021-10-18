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
    public void draw() {
        this.rectangle.draw();
    }

    @Override
    public void hide() {
        this.rectangle.delete();
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
        this.rectangle.setColor(SimpleGfxColorMapper.getColor(color));
    }

    @Override
    public void moveInDirection(GridDirection direction) {
        int startCol = getCol();
        int startRow = getRow();

        super.moveInDirection(direction);

        int colDiff = (getCol() - startCol) * SimpleGfxGrid.CELL_SIZE;
        int rowDiff = (getRow() - startRow) * SimpleGfxGrid.CELL_SIZE;

        this.rectangle.translate(colDiff, rowDiff);
    }
}
