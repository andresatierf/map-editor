package org.academiadecodigo.bootcamp65.handlers;

import org.academiadecodigo.bootcamp65.MapEditor;
import org.academiadecodigo.bootcamp65.grid.GridDirection;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KbHandler implements KeyboardHandler {

    private MapEditor mapEditor;
    private Keyboard keyboard;

    public KbHandler(MapEditor mapEditor) {
        this.mapEditor = mapEditor;
        this.keyboard = new Keyboard(this);
        addKey(KeyboardEvent.KEY_SPACE);
        addKey(KeyboardEvent.KEY_UP);
        addKey(KeyboardEvent.KEY_LEFT);
        addKey(KeyboardEvent.KEY_DOWN);
        addKey(KeyboardEvent.KEY_RIGHT);
        addKey(KeyboardEvent.KEY_W);
        addKey(KeyboardEvent.KEY_A);
        addKey(KeyboardEvent.KEY_S);
        addKey(KeyboardEvent.KEY_D);
        addKey(KeyboardEvent.KEY_G);
        addKey(KeyboardEvent.KEY_L);
        addKey(KeyboardEvent.KEY_C);
        addKey(KeyboardEvent.KEY_N);
        addKey(KeyboardEvent.KEY_P);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_SPACE:
                System.out.println("Pressed Space");
                this.mapEditor.paint();
                break;
            case KeyboardEvent.KEY_W:
            case KeyboardEvent.KEY_UP:
                System.out.println("Pressed Up/W");
                this.mapEditor.getCursor().move(GridDirection.UP);
                break;
            case KeyboardEvent.KEY_A:
            case KeyboardEvent.KEY_LEFT:
                System.out.println("Pressed Left/A");
                this.mapEditor.getCursor().move(GridDirection.LEFT);
                break;
            case KeyboardEvent.KEY_S:
            case KeyboardEvent.KEY_DOWN:
                System.out.println("Pressed Down/S");
                this.mapEditor.getCursor().move(GridDirection.DOWN);
                break;
            case KeyboardEvent.KEY_D:
            case KeyboardEvent.KEY_RIGHT:
                System.out.println("Pressed Right/D");
                this.mapEditor.getCursor().move(GridDirection.RIGHT);
                break;
            case KeyboardEvent.KEY_G:
                System.out.println("Pressed G");
                this.mapEditor.saveGrid();
                break;
            case KeyboardEvent.KEY_L:
                System.out.println("Pressed L");
                this.mapEditor.loadGrid();
                break;
            case KeyboardEvent.KEY_C:
                System.out.println("Pressed C");
                this.mapEditor.clearGrid();
                break;
            case KeyboardEvent.KEY_N:
                System.out.println("Pressed N");
                this.mapEditor.nextColor();
                break;
            case KeyboardEvent.KEY_P:
                System.out.println("Pressed P");
                this.mapEditor.previousColor();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }

    //region Key adding methods
    public void addKey(int key) {
        addKeyPressed(key);
        addKeyReleased(key);
    }

    public void addKeyPressed(int key) {
        KeyboardEvent keyboardEvent = new KeyboardEvent();
        keyboardEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEvent.setKey(key);
        this.keyboard.addEventListener(keyboardEvent);
    }

    public void addKeyReleased(int key) {
        KeyboardEvent keyboardEvent = new KeyboardEvent();
        keyboardEvent.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboardEvent.setKey(key);
        this.keyboard.addEventListener(keyboardEvent);
    }
    //endregion
}
