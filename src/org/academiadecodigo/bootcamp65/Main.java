package org.academiadecodigo.bootcamp65;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        MapEditor mapEditor = new MapEditor(30,30);
        mapEditor.init();
        mapEditor.start();
    }
}
