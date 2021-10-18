package org.academiadecodigo.bootcamp65;

import org.academiadecodigo.bootcamp65.entities.Cell;
import org.academiadecodigo.bootcamp65.entities.Cursor;
import org.academiadecodigo.bootcamp65.grid.Grid;
import org.academiadecodigo.bootcamp65.grid.GridFactory;
import org.academiadecodigo.bootcamp65.handlers.KbHandler;
import org.academiadecodigo.bootcamp65.io.SaveLoad;
import org.academiadecodigo.bootcamp65.simplegfx.SimpleGfxColorMapper;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MapEditor {

    private Grid grid;
    private Cursor cursor;
    private Cell sample;

    private List<Cell> cells;

    private SaveLoad saveLoad;
    private int currentColor;

    public MapEditor(int cols, int rows) {
        this.grid = GridFactory.createGrid(cols, rows);
        this.saveLoad = new SaveLoad(this.grid);
    }

    public void init() {
        new KbHandler(this);
        this.grid.init();
        this.cells = new ArrayList<>();
        for (int i = 0; i < grid.getRows(); i++) {
            for (int j = 0; j < grid.getCols(); j++) {
                cells.add(new Cell(grid.makeGridPosition(j, i)));
                cells.get(i * grid.getCols() + j).show();
            }
        }
        this.sample = new Cell(grid.makeGridPosition(31, 0));
        this.currentColor = 12;
        this.sample.setColor(JavaColors.colors[this.currentColor]);
        this.sample.setPainted(true);
        this.sample.show();

        this.cursor = new Cursor(this.grid, this.grid.makeGridPosition(0,0));
    }

    public void start() throws InterruptedException {
        while (true) {
            update();
            Thread.sleep(200);
        }
    }

    //region Getters and Setters

    public Cursor getCursor() {
        return cursor;
    }

    public void setCursor(Cursor cursor) {
        this.cursor = cursor;
    }

    //endregion

    private void update() {
        this.cursor.update();
    }

    public void paint() {
        for (Cell cell : cells) {
            if (cursor.getPosition().equals(cell.getPosition())) {
                if (!cell.isPainted() || (cell.isPainted() && cell.getColor() != this.sample.getColor())) {
                    cell.setPainted(true);
                    cell.setColor(this.sample.getColor());
                } else {
                    cell.setPainted(false);
                    cell.setColor(JavaColors.colors[2]);
                }
            }
            cell.show();
        }
    }

    public void saveGrid() {
        this.saveLoad.writeFile(this.saveLoad.convertMapToString(this.cells));
    }

    public void loadGrid() {
        this.cells = this.saveLoad.convertStringToMap(this.saveLoad.readFile());
        for (Cell cell : cells) {
            cell.show();
        }
    }

    public void clearGrid() {
        for (Cell cell : cells) {
            cell.setPainted(false);
            cell.setColor(Color.BLACK);
            cell.show();
        }
    }

    public void nextColor() {
        this.currentColor  = (this.currentColor + 1 + 13) % 13;
        this.sample.setColor(JavaColors.colors[currentColor]);
        this.sample.show();
    }

    public void previousColor() {
        this.currentColor  = (this.currentColor - 1 + 13) % 13;
        this.sample.setColor(JavaColors.colors[currentColor]);
        this.sample.show();
    }
}
