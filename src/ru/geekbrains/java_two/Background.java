package ru.geekbrains.java_two;

import java.awt.*;

public class Background {
    private int sleepCount = 1;
    GameCanvas listener;

    Background(GameCanvas listener) {
        this.listener = listener;
    }

    public void ChangeBackground() {
        if (sleepCount == 1) {
            Color color = new Color(
                    (int) (Math.random() * 255),
                    (int) (Math.random() * 255),
                    (int) (Math.random() * 255)
            );
            this.listener.setBackground(color);
            sleepCount ++;
        } else if (sleepCount > 100)
            sleepCount = 1;
        else
            sleepCount ++;
    }
}
