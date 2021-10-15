package org.academiadecodigo.bootcamp65.grid;

import org.academiadecodigo.bootcamp65.simplegfx.SimpleGfxGrid;

public class GridFactory {

    public static Grid createGrid(int cols, int rows) {
        return new SimpleGfxGrid(cols, rows);
    }
}
