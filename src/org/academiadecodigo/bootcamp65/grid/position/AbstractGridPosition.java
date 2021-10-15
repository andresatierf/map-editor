package org.academiadecodigo.bootcamp65.grid.position;

import org.academiadecodigo.bootcamp65.grid.Grid;
import org.academiadecodigo.bootcamp65.grid.GridDirection;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

public abstract class AbstractGridPosition implements GridPosition{

    private int col;
    private int row;
    private Color color;
    private Grid grid;

    public AbstractGridPosition(int col, int row, Grid grid) {
        this.col = col;
        this.row = row;
        this.grid = grid;
    }

    @Override
    public int getCol() {
        return this.col;
    }

    @Override
    public int getRow() {
        return this.row;
    }

    @Override
    public void setPos(int col, int row) {
        this.col = col;
        this.row = row;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void moveInDirection(GridDirection direction) {
        switch (direction) {
            case UP:
                moveUp();
                break;
            case RIGHT:
                moveRight();
                break;
            case DOWN:
                moveDown();
                break;
            case LEFT:
                moveLeft();
                break;
        }
    }

    private void moveUp() {
        setPos(getCol(), getRow() == 0 ? getRow() : getRow() - 1);
    }

    private void moveRight() {
        setPos(getCol() == grid.getCols() - 1 ? getCol() : getCol() + 1, getRow());
    }

    private void moveDown() {
        setPos(getCol(), getRow() == 0 ? getRow() : getRow() + 1);
    }

    public void moveLeft() {
        setPos(getCol() == 0 ? getCol() : getCol() - 1, getRow());

    }

    @Override
    public boolean equals(GridPosition position) {
        return false;
    }

}
