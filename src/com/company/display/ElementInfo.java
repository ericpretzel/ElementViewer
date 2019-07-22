package com.company.display;

import com.company.Element;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;



//displays the info of the current element in ElementDisplay
public class ElementInfo extends JPanel {





    public static final int SIZE = 250;


    private JLabel symbol, Z, mass, X, group, name;

    private GridBagLayout layout;
    public ElementInfo() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        setPreferredSize(new Dimension(SIZE, SIZE));
        layout = new GridBagLayout();
        this.setLayout(layout);


        symbol = new JLabel();
        symbol.setFont(new Font("SansSerif", Font.BOLD, 50));

        Z = new JLabel();
        Z.setFont(new Font("SansSerif", Font.PLAIN, 25));

        mass = new JLabel();
        mass.setFont(new Font("SansSerif", Font.PLAIN, 25));

        X = new JLabel();
        X.setFont(new Font("SansSerif", Font.PLAIN, 25));

        group = new JLabel();
        group.setFont(new Font("SansSerif", Font.PLAIN, 10));

        name = new JLabel();
        updateInfo();
        setConstraints();
        this.add(Z);
        this.add(group);
        this.add(symbol);
        this.add(mass);
        this.add(X);
        this.add(name);
    }

    private void updateInfo() {
        Element e = ElementDisplay.currentElement;

        symbol.setText(e.getSymbol());
        name.setText(e.getName());
        Z.setText(String.valueOf(e.getZ()));
        mass.setText(String.valueOf(e.getMass()));
        X.setText(String.valueOf(e.getX()));



        group.setText(e.getGroupName());

    }

    private void setConstraints() {

        GridBagConstraints cZ = new GridBagConstraints();
        cZ.anchor = GridBagConstraints.NORTHWEST;
        cZ.gridx = cZ.gridy = 0;
        cZ.gridwidth = cZ.gridheight = 1;
        cZ.weightx = 1;
        cZ.weighty = 1;
        layout.setConstraints(Z, cZ);

        GridBagConstraints cSymbol = new GridBagConstraints();
        cSymbol.gridx = cSymbol.gridy = 1;
        cSymbol.gridwidth = cSymbol.gridheight = 1;
        cSymbol.weightx = 1;
        cSymbol.weighty = 1;
        cSymbol.anchor = GridBagConstraints.CENTER;
        layout.setConstraints(symbol, cSymbol);

        GridBagConstraints cMass = new GridBagConstraints();
        cMass.gridx = 0;
        cMass.gridy = 4;
        cMass.gridwidth = cMass.gridheight = 1;
        cMass.anchor = GridBagConstraints.SOUTHWEST;
        cMass.weightx = cMass.weighty = 1;
        layout.setConstraints(mass, cMass);

        GridBagConstraints cX = new GridBagConstraints();
        cX.gridx = cX.gridy = 4;
        cX.gridwidth = cX.gridheight = 1;
        cMass.weightx = cMass.weighty = 1;
        cX.anchor = GridBagConstraints.SOUTHEAST;
        layout.setConstraints(X, cX);

        GridBagConstraints cGroup = new GridBagConstraints();
        cGroup.gridx = 4;
        cGroup.gridy = 0;
        cGroup.gridwidth = cGroup.gridheight = 1;
        cGroup.anchor = GridBagConstraints.NORTHEAST;
        cGroup.weightx = cGroup.weighty = 1;
        layout.setConstraints(group, cGroup);

        GridBagConstraints cName = cSymbol;
        cName.anchor = GridBagConstraints.SOUTH;
        layout.setConstraints(name, cName);


    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(ElementDisplay.currentElement.getGroupColor());

    }


    public void update() {
        updateInfo();
        repaint();
    }


}
