package org.academiadecodigo.bootcamp65;

import org.academiadecodigo.bootcamp65.grid.Grid;
import org.academiadecodigo.bootcamp65.grid.position.GridPosition;

import java.awt.*;

public class Cursor {

    private GridPosition position;
    private Grid grid;
    private Color color;

    public Cursor(Grid grid) {
        this.grid = grid;
        this.position = grid.makeGridPosition();
    }

    public Cursor(Grid grid, GridPosition position) {
        this.grid = grid;
        this.position = position;
    }

    public GridPosition getPosition() {
        return position;
    }

    public void setPosition(GridPosition position) {
        this.position = position;
    }
}
