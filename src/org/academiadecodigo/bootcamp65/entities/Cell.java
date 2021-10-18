package org.academiadecodigo.bootcamp65.entities;

import org.academiadecodigo.bootcamp65.grid.position.GridPosition;
import org.academiadecodigo.bootcamp65.simplegfx.SimpleGfxColorMapper;

import java.awt.*;

public class Cell {

    private GridPosition position;
    private Color color;
    private boolean painted;

    public Cell(GridPosition position) {
        this.position = position;
        this.color = Color.BLACK;
        this.position.setColor(Color.BLACK);
        this.painted = false;
    }

    public void show() {
        if (painted) {
            this.position.show();
        } else {
            this.position.draw();
        }
    }

    public GridPosition getPosition() {
        return position;
    }

    public boolean isPainted() {
        return painted;
    }

    public void setPainted(boolean painted) {
        this.painted = painted;
    }

    public void setColor(Color color) {
        this.color = color;
        this.position.setColor(color);
    }

    public Color getColor() {
        return color;
    }
}
