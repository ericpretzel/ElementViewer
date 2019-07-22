package com.company.util;

import com.company.Chemistry;
import com.company.Element;
import com.company.display.ElementDisplay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public enum Button {

    //TODO SAVE THE PREVIOUS NEUTRONS/ELECTRONS AMOUNT WHEN YOU CHANGE TO A DIFFERENT ELEMENT


    ADD_PROTON ("+") {
        ActionListener getActionListener() {
            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ElementDisplay.currentElement = Element.getElement(ElementDisplay.currentElement.getZ() + 1);
                    Chemistry.getScreen().update();
                }
            };
        }
        @Override
        public GridBagConstraints JButtonConstraints() {
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = 0;
            c.gridwidth = 1;
            c.gridheight = 1;
            c.fill = GridBagConstraints.NONE;
            c.weightx = 0;
            c.weighty = 0;
            c.anchor = GridBagConstraints.SOUTH;
            c.insets = new Insets(50,50,50,50);;
            return c;
        }
        @Override
        public GridBagConstraints JLabelConstraints() {
            GridBagConstraints c = this.JButtonConstraints();
            c.anchor = GridBagConstraints.NORTH;
            c.insets = new Insets(0,0,0,0);
            return c;
        }
    },
    REMOVE_PROTON ("-") {
        ActionListener getActionListener() {
            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ElementDisplay.currentElement = Element.getElement(ElementDisplay.currentElement.getZ() - 1);
                    Chemistry.getScreen().update();
                }
            };
        }

        @Override
        public GridBagConstraints JButtonConstraints() {
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = 1;
            c.gridwidth = 1;
            c.gridheight = 1;
            c.fill = GridBagConstraints.NONE;
            c.anchor = GridBagConstraints.SOUTH;
            c.weightx = 0;
            c.weighty = 0;
            c.insets = new Insets(50,50,50,50);;
            return c;
        }
        @Override
        public GridBagConstraints JLabelConstraints() {
            GridBagConstraints c = this.JButtonConstraints();
            c.anchor = GridBagConstraints.NORTH;
            c.insets = new Insets(0,0,0,0);
            return c;
        }
    },

    ADD_ELECTRON ("+") {
        ActionListener getActionListener() {
            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ElementDisplay.currentElement.setElectrons(ElementDisplay.currentElement.getElectrons()+1);
                    Chemistry.getScreen().update();
                }
            };
        }
        @Override
        public GridBagConstraints JButtonConstraints() {
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 2;
            c.gridy = 0;
            c.gridwidth = 1;
            c.gridheight = 1;
            c.fill = GridBagConstraints.NONE;
            c.weightx = 0;
            c.weighty = 0;
            c.anchor = GridBagConstraints.SOUTH;
            c.insets = new Insets(50,50,50,50);;
            return c;
        }
        @Override
        public GridBagConstraints JLabelConstraints() {
            GridBagConstraints c = this.JButtonConstraints();
            c.anchor = GridBagConstraints.NORTH;
            c.insets = new Insets(0,0,0,0);
            return c;
        }
    },
    REMOVE_ELECTRON ("-") {
        ActionListener getActionListener() {
            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ElementDisplay.currentElement.setElectrons(ElementDisplay.currentElement.getElectrons()-1);
                    Chemistry.getScreen().update();
                }
            };
        }

        @Override
        public GridBagConstraints JButtonConstraints() {
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 2;
            c.gridy = 1;
            c.gridwidth = 1;
            c.gridheight = 1;

            c.fill = GridBagConstraints.NONE;
            c.weightx = 0;
            c.weighty = 0;
            c.anchor = GridBagConstraints.SOUTH;
            c.insets = new Insets(50,50,50,50);;
            return c;
        }
        @Override
        public GridBagConstraints JLabelConstraints() {
            GridBagConstraints c = this.JButtonConstraints();
            c.anchor = GridBagConstraints.NORTH;
            c.insets = new Insets(0,0,0,0);
            return c;
        }
    },

    ADD_NEUTRON ("+") {
        ActionListener getActionListener() {
            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ElementDisplay.currentElement.setNeutrons(ElementDisplay.currentElement.getNeutrons() + 1);
                    Chemistry.getScreen().update();
                }
            };
        }

        @Override
        public GridBagConstraints JButtonConstraints() {
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 1;
            c.gridy = 0;
            c.gridwidth = 1;
            c.gridheight = 1;
            c.fill = GridBagConstraints.NONE;
            c.weightx = 0;
            c.weighty = 0;
            c.anchor = GridBagConstraints.SOUTH;
            c.insets = new Insets(50,50,50,50);;
            return c;
        }
        @Override
        public GridBagConstraints JLabelConstraints() {
            GridBagConstraints c = this.JButtonConstraints();
            c.anchor = GridBagConstraints.NORTH;
            c.insets = new Insets(0,0,0,0);
            return c;
        }
    },
    REMOVE_NEUTRON ("-") {
        ActionListener getActionListener() {
            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ElementDisplay.currentElement.setNeutrons(ElementDisplay.currentElement.getNeutrons() - 1);
                    Chemistry.getScreen().update();
                }
            };
        }

        @Override
        public GridBagConstraints JButtonConstraints() {
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 1;
            c.gridy = 1;
            c.gridwidth = 1;
            c.gridheight = 1;
            c.fill = GridBagConstraints.NONE;
            c.weightx = 0;
            c.weighty = 0;
            c.anchor = GridBagConstraints.SOUTH;
            c.insets = new Insets(50,50,50,50);
            return c;
        }

        @Override
        public GridBagConstraints JLabelConstraints() {
            GridBagConstraints c = this.JButtonConstraints();
            c.anchor = GridBagConstraints.NORTH;
            c.insets = new Insets(0,0,0,0);
            return c;
        }
    };



    private GridBagConstraints buttonConstraints, labelConstraints;
    private JButton button;
    private JLabel label;
    Button(String text) {
        final int size = 50;

        buttonConstraints = this.JButtonConstraints();
        labelConstraints = this.JLabelConstraints();
        button = new JButton(text);
        button.setPreferredSize(new Dimension(size, size));
        button.addActionListener(this.getActionListener());
        button.setVisible(true);
        
        label = new JLabel(this.name().charAt(0) + 
                this.name().substring(1, this.name().indexOf('_')).toLowerCase() +
                " " +
                this.name().substring(this.name().indexOf('_') + 1).toLowerCase());
    }



    abstract ActionListener getActionListener();
    abstract GridBagConstraints JButtonConstraints();
    abstract GridBagConstraints JLabelConstraints();

    public JButton getButton() { return button; }
    public JLabel getLabel() { return label; }

    public GridBagConstraints getJButtonConstraints() { return buttonConstraints; }
    public GridBagConstraints getJLabelConstraints() { return labelConstraints; }
}
