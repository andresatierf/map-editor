package org.academiadecodigo.bootcamp65.entities;

import org.academiadecodigo.bootcamp65.grid.Grid;
import org.academiadecodigo.bootcamp65.grid.GridDirection;
import org.academiadecodigo.bootcamp65.grid.position.GridPosition;

import java.awt.*;

public class Cursor {

    private GridPosition position;
    private Grid grid;
    private Color color;

    public Cursor(Grid grid) {
        this.grid = grid;
        this.position = grid.makeGridPosition();
        this.color = Color.GREEN;
    }

    public Cursor(Grid grid, GridPosition position) {
        this.grid = grid;
        this.position = position;
        this.position.setColor(Color.GREEN);
        this.color = Color.GREEN;
    }

    public GridPosition getPosition() {
        return position;
    }

    public void setPosition(GridPosition position) {
        this.position = position;
    }

    public void update() {
        this.position.hide();
        this.position.show();
    }

    public void move(GridDirection direction) {
        this.position.moveInDirection(direction);
    }
}
