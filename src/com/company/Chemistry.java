package com.company;

import com.company.display.Screen;

public class Chemistry implements Runnable {

    public static boolean RUNNING;

    public static final int SCREEN_WIDTH = 800,
            SCREEN_HEIGHT = 600;

    private static Screen screen;
    public Chemistry(Screen screen) {

        this.screen = screen;
    }


    public void run() {
        RUNNING = true;

        screen.update();
    }

    public static Screen getScreen() { return screen; }


}
