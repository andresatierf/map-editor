package org.academiadecodigo.bootcamp65;

import org.academiadecodigo.bootcamp65.grid.Grid;
import org.academiadecodigo.bootcamp65.grid.GridFactory;
import org.academiadecodigo.bootcamp65.handlers.KbHandler;

public class MapEditor {

    private Grid grid;
    private Cursor cursor;

    public MapEditor(int cols, int rows) {
        this.grid = GridFactory.createGrid(cols, rows);
    }

    public void init() {
        new KbHandler(this);
        this.grid.init();
        this.cursor = new Cursor(this.grid);

    }

    public void start() {


    }
}
