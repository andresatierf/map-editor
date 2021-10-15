package org.academiadecodigo.bootcamp65.handlers;

import org.academiadecodigo.bootcamp65.MapEditor;
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
        addKey(KeyboardEvent.KEY_RIGHT);
        addKey(KeyboardEvent.KEY_DOWN);
        addKey(KeyboardEvent.KEY_LEFT);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_SPACE:
                System.out.println("Pressed Space");
                break;
            case KeyboardEvent.KEY_UP:
                System.out.println("Pressed Up");
                break;
            case KeyboardEvent.KEY_RIGHT:
                System.out.println("Pressed Right");
                break;
            case KeyboardEvent.KEY_DOWN:
                System.out.println("Pressed Down");
                break;
            case KeyboardEvent.KEY_LEFT:
                System.out.println("Pressed Left");
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
        keyboardEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEvent.setKey(key);
        this.keyboard.addEventListener(keyboardEvent);
    }
    //endregion
}
