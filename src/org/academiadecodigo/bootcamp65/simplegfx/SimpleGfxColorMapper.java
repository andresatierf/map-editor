package org.academiadecodigo.bootcamp65.simplegfx;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class SimpleGfxColorMapper {

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

    public static Color getColor(java.awt.Color color) {
        Color sGfxColor = null;

        if (java.awt.Color.YELLOW.equals(color)) {
            sGfxColor = colors[0];
        } else if (java.awt.Color.CYAN.equals(color)) {
            sGfxColor = colors[1];
        } else if (java.awt.Color.BLACK.equals(color)) {
            sGfxColor = colors[2];
        } else if (java.awt.Color.BLUE.equals(color)) {
            sGfxColor = colors[3];
        } else if (java.awt.Color.DARK_GRAY.equals(color)) {
            sGfxColor = colors[4];
        } else if (java.awt.Color.GRAY.equals(color)) {
            sGfxColor = colors[5];
        } else if (java.awt.Color.GREEN.equals(color)) {
            sGfxColor = colors[6];
        } else if (java.awt.Color.LIGHT_GRAY.equals(color)) {
            sGfxColor = colors[7];
        } else if (java.awt.Color.MAGENTA.equals(color)) {
            sGfxColor = colors[8];
        } else if (java.awt.Color.ORANGE.equals(color)) {
            sGfxColor = colors[9];
        } else if (java.awt.Color.PINK.equals(color)) {
            sGfxColor = colors[10];
        } else if (java.awt.Color.RED.equals(color)) {
            sGfxColor = colors[11];
        } else if (java.awt.Color.WHITE.equals(color)) {
            sGfxColor = colors[12];
        }

        return sGfxColor;
    }
}
