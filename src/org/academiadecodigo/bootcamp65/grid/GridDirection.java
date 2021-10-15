package org.academiadecodigo.bootcamp65.grid;

public enum GridDirection {
    UP,
    RIGHT,
    DOWN,
    LEFT;

    public GridDirection getRandom() {
        return GridDirection.values()[((int) (Math.random() * GridDirection.values().length))];
    }
}
