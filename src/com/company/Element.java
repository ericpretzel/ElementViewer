package com.company;

import com.company.display.ElementDisplay;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Element {


    /**
     * symbol = element symbol
     *
     * Z = atomic number
     *
     * mass = average mass to 2 decimal places
     *
     * X = electronegativity to 2 decimal places. -1 if not applicable
     *
     * group = what group the element is in
     **/


    HYDROGEN("H", 1, 1.01, 2.20, Group.HYDROGEN),

    HELIUM("He", 2, 4.00, -1, Group.NOBLE_GAS),

    LITHIUM("Li", 3, 6.94, 0.98, Group.ALKALI_METAL),

    BERYLLIUM("Be", 4, 9.01, 1.57, Group.ALKALINE_EARTH_METAL),

    BORON("B", 5, 10.81, 2.04, Group.NONMETAL),

    CARBON("C", 6, 12.01, 2.55, Group.NONMETAL),

    NITROGEN("N", 7, 14.01, 3.04, Group.PNICTOGEN),

    OXYGEN("O", 8, 16.00, 3.44, Group.CHALCOGEN),

    FLUORINE("F", 9, 19.00, 3.98, Group.HALOGEN),

    NEON("Ne", 10, 20.18, -1, Group.NOBLE_GAS),

    SODIUM("Na", 11, 23.00, 0.93, Group.ALKALI_METAL),

    MAGNESIUM("Mg", 12, 24.31, 1.31, Group.ALKALINE_EARTH_METAL),

    ALUMINIUM("Al", 13, 26.98, 1.61, Group.POOR_METAL),

    SILICON("Si", 14, 28.09, 1.90, Group.NONMETAL),

    PHOSPHOROUS("P", 15, 30.97, 2.19, Group.PNICTOGEN),

    SULFUR("S", 16, 32.06, 2.58, Group.CHALCOGEN);




    private String symbol;
    private int Z;
    private int protons, neutrons, electrons;
    private double mass;
    private double X;
    private Group group;
    private static List<int[]> protonCoords = new ArrayList<>();
    private static List<int[]> neutronCoords = new ArrayList<>();
    Element(String symbol, int Z, double mass, double X, Group group) {
        this.symbol = symbol;
        this.Z = Z;
        this.mass = mass;
        this.X = X;
        this.group = group;
        protons = Z;
    }

    enum Group {
        ALKALI_METAL(new Color(255, 176, 50)),
        ALKALINE_EARTH_METAL(new Color(254, 255, 53)),
        TRANSITION_METAL(new Color(255, 160, 224)),
        POOR_METAL(new Color(95, 111, 93)),
        PNICTOGEN(new Color(114, 130, 255)),
        CHALCOGEN(new Color(192, 255, 85)),
        HALOGEN(new Color(255, 117, 103)),
        LANTHANOID(new Color(255, 0, 154)),
        ACTINOID(new Color(255, 223, 245)),
        NONMETAL(new Color(26, 255, 0)),
        NOBLE_GAS(new Color(46, 199, 255)),
        HYDROGEN(new Color(255, 255, 255));


        private Color color;

        Group(Color color) {
            this.color = color;
        }

        public Color getColor() {
            return color;
        }
    }

    public void drawMe(Graphics g) {

        /*
         * drawing the electron orbits.
         *
         * Electron energy level capacities follow equation:
         * capacity (n) = 2*(n*n)
         */
        int energyLevel = 1;
        int electronCount = electrons;
        while (electronCount > 0) {
            int capacity = 2 * (energyLevel * energyLevel);

            int radius = 50 * energyLevel;

            g.setColor(Color.black);
            int x = ElementDisplay.SIZE/2 - radius;
            int y = ElementDisplay.SIZE/2 - radius;
            g.drawOval(x, y, radius*2, radius*2);

            double angle = Math.toRadians(360.0/(Math.min(electronCount, capacity)));
            for (int j = 0; j < capacity; j++) {
                if (electronCount-- <= 0) break;

                int electronX = (int)(ElementDisplay.SIZE/2 + Math.cos(angle * j) * radius) - 2;
                int electronY = (int)(ElementDisplay.SIZE/2 + Math.sin(angle * j) * radius) - 2;

                g.setColor(Color.blue);
                g.fillOval(electronX, electronY, 5, 5);
                g.setColor(Color.black);
                g.drawOval(electronX, electronY, 5, 5);
            }
            energyLevel++;
        }

        /*
         * drawing the nucleus
         * now it does not randomize the positions every single time the screen is updated :)
         */
        int protonCount = protons,
            neutronCount = neutrons;
        for (int i = 0; i < protons + neutrons; i++) {

            if (protonCount > 0) {
                drawPoint(g, "proton");
                protonCount--;
            }

            if (neutronCount > 0) {
                drawPoint(g, "neutron");
                neutronCount--;
            }
        }
        for (int[] coords : protonCoords) {
            g.setColor(Color.red);
            g.fillOval(coords[0], coords[1], 7, 7);
            g.setColor(Color.black);
            g.drawOval(coords[0], coords[1], 7, 7);
        }
        for (int[] coords : neutronCoords) {
            g.setColor(Color.gray);
            g.fillOval(coords[0], coords[1], 7, 7);
            g.setColor(Color.black);
            g.drawOval(coords[0], coords[1], 7, 7);
        }

    }
    private void drawPoint(Graphics g, String type) {
        int randomX, randomY;
        int[] coords;
        do {
            randomX = ElementDisplay.SIZE / 2 + (int) (Math.random() * 50 - 25);
            randomY = ElementDisplay.SIZE / 2 + (int) (Math.random() * 50 - 25);
            coords = new int[]{randomX, randomY};
        } while (!valid(coords));

        //check if you need to add proton/neutron
        if (type.equals("proton") && protons > protonCoords.size()) {
            protonCoords.add(coords);
        } else if (type.equals("neutron") && neutrons > neutronCoords.size()) {
            neutronCoords.add(coords);
        }

        //check if you need to remove proton/neutron
        if (type.equals("proton") && protons < protonCoords.size()) {
            protonCoords.remove(0);
        } else if (type.equals("neutron") && neutrons < neutronCoords.size()) {
            neutronCoords.remove(0);
        }

    }

    private boolean valid(int[] b) {
        for (int[] a : protonCoords) if (Arrays.equals(b, a)) return false;
        for (int[] a : neutronCoords) if (Arrays.equals(b, a)) return false;
        return true;
    }

    public String getSymbol() { return symbol; }

    public Color getGroupColor() { return (group != null) ? group.getColor() : Color.white; }

    public int getZ() { return Z; }

    public int getProtons() { return protons; }

    public int getNeutrons() { return neutrons; }

    public int getElectrons() { return electrons; }

    public double getMass() { return mass; }

    public double getX() { return X; }

    public Group getGroup() { return group; }

    public String getGroupName() {
        //splitting lines for long group names
        String name = "<html>";
        for (String s : group.name().split("_")) {
            name += (s.charAt(0)) + s.substring(1).toLowerCase() + "<br>";
        }
        return name + "</html>";
    }

    public void setNeutrons(int n) { if (n >= 0) neutrons = n; }

    public void setElectrons(int e) { if (e >= 0) electrons = e; }

    public String getName() { return this.name().charAt(0) + this.name().substring(1).toLowerCase(); }

    public static Element getElement(int Z) {
        for (Element e : Element.values())
            if (Z == e.getZ()) return e;

        System.out.println("Error: no element found");
        return HYDROGEN;
    }

}
