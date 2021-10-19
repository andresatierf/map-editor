package org.academiadecodigo.bootcamp65.utils;


import java.awt.*;

public class JavaColors {
    public static final Color[] colors = {
            Color.YELLOW,
            Color.CYAN,
            Color.BLACK,
            Color.BLUE,
            Color.DARK_GRAY,
            Color.GRAY,
            Color.GREEN,
            Color.LIGHT_GRAY,
            Color.MAGENTA,
            Color.ORANGE,
            Color.PINK,
            Color.RED,
            Color.WHITE
    };

    public static int getColorIndex(Color color) {
        for (int i = 0; i < colors.length; i++) {
            if (colors[i] == color) {
                return i;
            }
        }
        return -1;
    }
}
