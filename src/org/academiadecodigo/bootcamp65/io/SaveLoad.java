package org.academiadecodigo.bootcamp65.io;

import org.academiadecodigo.bootcamp65.JavaColors;
import org.academiadecodigo.bootcamp65.entities.Cell;
import org.academiadecodigo.bootcamp65.grid.Grid;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveLoad {

    private BufferedReader inputReader;
    private BufferedWriter outputReader;
    private static final String PATH = "resources/save/savefile";

    private Grid grid;

    public SaveLoad(Grid grid) {
        this.grid = grid;
    }

    public String convertMapToString(List<Cell> cellList) {
        String s = "";
        for (Cell cell : cellList) {
            s += (cell.isPainted() ? "1" : "0") + ":" + JavaColors.getColorIndex(cell.getColor()) + "\n";
        }
        return s;
    }

    public List<Cell> convertStringToMap(String string) {
        List<Cell> cellList = null;
        int numCells = this.grid.getRows() * this.grid.getCols();
        String[] nums = string.split("\n");
        if (numCells != nums.length) {
            System.out.println("File does not match current grid");
            return cellList;
        }
        cellList = new ArrayList<>();
        for (int i = 0; i < this.grid.getRows(); i++) {
            for (int j = 0; j < this.grid.getCols(); j++) {
                Cell cell = new Cell(grid.makeGridPosition(j, i));
                if (nums[i * this.grid.getCols() + j].split(":")[0].equals("1")) {
                    cell.setPainted(true);
                    cell.setColor(JavaColors.colors[Integer.parseInt(nums[i * this.grid.getCols() + j].split(":")[1])]);
                } else {
                    cell.setPainted(false);
                    cell.setColor(Color.BLACK);
                }
                cellList.add(cell);
            }
        }
        return cellList;
    }

    public String readFile() {
        String s = "";
        try {
            inputReader = new BufferedReader(new FileReader(PATH));
            String line = "";
            while ((line = inputReader.readLine()) != null) {
                s += line + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("No save found");
        } catch (IOException e) {
            System.out.println("Failed to read the file");
        } finally {
            try {
                inputReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return s;
    }

    public void writeFile(String string) {
        try {
            outputReader = new BufferedWriter(new FileWriter(PATH));
            outputReader.write(string);
            outputReader.flush();
        } catch (IOException e) {
            System.out.println("Failed to save file");
        } finally {
            try {
                outputReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
