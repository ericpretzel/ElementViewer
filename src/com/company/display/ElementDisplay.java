package com.company.display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import com.company.Element;

public class ElementDisplay extends JPanel {


    private static final int DEFAULT_SIZE = 600;
    public static int SIZE;

    public static Element currentElement;
    public ElementDisplay() {
        SIZE = DEFAULT_SIZE;
        currentElement = Element.HYDROGEN;
        setPreferredSize(new Dimension(SIZE, SIZE));
        setBorder(BorderFactory.createEtchedBorder(Color.red, Color.black));

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                updateSize();
            }
        });

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        currentElement.drawMe(g);



    }

    private void updateSize() {
        SIZE = Math.min(this.getWidth(), this.getHeight());
    }


    public void update() {



        repaint();
    }


}
