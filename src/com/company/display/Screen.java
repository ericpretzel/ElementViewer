package com.company.display;

import com.company.util.InputHandler;
import com.company.util.Button;

import javax.swing.*;
import java.awt.*;


public class Screen extends JPanel {

    public static final int SCREEN_WIDTH = 1200,
            SCREEN_HEIGHT = 600;

    private static InputHandler inputHandler;

    /*private JButton addProtonButton, removeProtonButton,
            addElectronButton, removeElectronButton,
            addNeutronButton, removeNeutronButton;*/


    private ElementDisplay elementDisplay;
    private ElementInfo elementInfo;
    private GridBagLayout layout;
    public Screen() {

        layout = new GridBagLayout();
        setLayout(layout);
        setFocusable(true);
        setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));

        inputHandler = new InputHandler();
        addMouseListener(inputHandler);
        addKeyListener(inputHandler);

        setBackground(Color.white);

        initElementDisplay();
        initElementInfo();

        for (Button b : Button.values()) {
            layout.setConstraints(b.getButton(), b.getJButtonConstraints());
            layout.setConstraints(b.getLabel(), b.getJLabelConstraints());
            this.add(b.getButton());
            this.add(b.getLabel());
        }

        this.add(elementDisplay);
        this.add(elementInfo);
    }


    private void initElementDisplay() {
        elementDisplay = new ElementDisplay();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(elementDisplay, gbc);
    }

    private void initElementInfo() {
        elementInfo = new ElementInfo();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(elementInfo, gbc);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }


    public void update() {
        elementDisplay.update();
        elementInfo.update();
        repaint();
    }


    public static InputHandler getInputHandler() {
        return inputHandler;
    }
}
