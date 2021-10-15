package org.academiadecodigo.bootcamp65.grid.position;

import org.academiadecodigo.bootcamp65.grid.GridDirection;

import java.awt.*;

public interface GridPosition {

    public int getCol();

    public int getRow();

    public void setPos(int col, int row);

    public Color getColor();

    public void setColor(Color color);

    public void show();

    public void hide();

    public void moveInDirection(GridDirection direction);

    public boolean equals(GridPosition position);
}
