package com.company;

import com.company.display.Screen;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame fr = new JFrame("Screen");
        Screen sc = new Screen();


        fr.add(sc);
        fr.pack();
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.setMinimumSize(new Dimension(Screen.SCREEN_WIDTH + 25, Screen.SCREEN_HEIGHT + 50));


        Chemistry c = new Chemistry(sc);
        new Thread(c).start();

    }
}
