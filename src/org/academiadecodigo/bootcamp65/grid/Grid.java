package org.academiadecodigo.bootcamp65.grid;

import org.academiadecodigo.bootcamp65.grid.position.GridPosition;

public interface Grid {

    public void init();

    public int getCols();

    public int getRows();

    public GridPosition makeGridPosition();

    public GridPosition makeGridPosition(int col, int row);
}
