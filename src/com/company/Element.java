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

    ALUMINIUM("Al", 13, 26.98, 1.61, Group.POST_TRANSITION_METAL),

    SILICON("Si", 14, 28.09, 1.90, Group.NONMETAL),

    PHOSPHOROUS("P", 15, 30.97, 2.19, Group.PNICTOGEN),

    SULFUR("S", 16, 32.06, 2.58, Group.CHALCOGEN),

    CHLORINE("Cl", 17, 35.45, 3.16, Group.HALOGEN),

    ARGON("Ar", 18, 39.95, -1, Group.NOBLE_GAS),

    POTASSIUM("K", 19, 39.10, 0.82, Group.ALKALI_METAL),

    CALCIUM("Ca", 20, 40.08, 1.00, Group.ALKALINE_EARTH_METAL),

    SCANDIUM("Sc", 21, 44.96, 1.36, Group.TRANSITION_METAL),

    TITANIUM("Ti", 22, 47.87, 1.54, Group.TRANSITION_METAL),

    VANADIUM("V", 23, 50.94, 1.63, Group.TRANSITION_METAL),

    CHROMIUM("Cr", 24, 52.00, 1.66, Group.TRANSITION_METAL),

    MANGANESE("Mn", 25, 54.94, 1.55, Group.TRANSITION_METAL),

    IRON("Fe", 26, 55.85, 1.83, Group.TRANSITION_METAL),

    COBALT("Co", 27, 58.93, 1.88, Group.TRANSITION_METAL),

    NICKEL("Ni", 28, 58.69, 1.91, Group.TRANSITION_METAL),

    COPPER("Cu", 29, 63.55, 1.9, Group.TRANSITION_METAL),

    ZINC("Zn", 30, 65.38, 1.65, Group.TRANSITION_METAL),

    GALLIUM("Ga", 31, 69.72, 1.81, Group.POST_TRANSITION_METAL),

    GERMANIUM("Ge", 32, 72.63, 2.01, Group.POST_TRANSITION_METAL),

    ARSENIC("As", 33, 74.92, 2.18, Group.PNICTOGEN),

    SELENIUM("Se", 34, 78.97, 2.55, Group.CHALCOGEN),

    BROMINE("Br", 35, 79.90, 2.96, Group.HALOGEN),

    KRYPTON("Kr", 36, 83.80, 3.00, Group.NOBLE_GAS),

    RUBIDIUM("Rb", 37, 85.47, 0.82, Group.ALKALI_METAL),

    STRONTIUM("Sr", 38, 87.62, 0.95, Group.ALKALINE_EARTH_METAL),

    YTTRIUM("Y", 39, 88.91, 1.22, Group.TRANSITION_METAL),

    ZIRCONIUM("Zr", 40, 91.22, 1.33, Group.TRANSITION_METAL),

    NIOBIUM("Nb", 41, 92.91, 1.60, Group.TRANSITION_METAL),

    MOLYBDENUM("Mo", 42, 95.95, 2.16, Group.TRANSITION_METAL),

    TECHNETIUM("Tc", 43, 98.00, 1.90, Group.TRANSITION_METAL),

    RUTHENIUM("Ru", 44, 101.07, 2.20, Group.TRANSITION_METAL),

    RHODIUM("Rh", 45, 102.91, 2.28, Group.TRANSITION_METAL),

    PALLADIUM("Pd", 46, 106.42, 2.20, Group.TRANSITION_METAL),

    SILVER("Ag", 47, 107.87, 1.93, Group.TRANSITION_METAL),

    CADMIUM("Cd", 48, 112.41, 1.69, Group.TRANSITION_METAL),

    INDIUM("In", 49, 114.82, 1.78, Group.POST_TRANSITION_METAL),

    TIN("Sn", 50, 118.71, 1.96, Group.POST_TRANSITION_METAL),

    ANTIMONY("Sb", 51, 121.76, 2.05, Group.PNICTOGEN),

    TELLURIUM("Te", 52, 127.60, 2.10, Group.CHALCOGEN),

    IODINE("I", 53, 126.90, 2.66, Group.HALOGEN),

    XENON("Xe", 54, 131.29, 2.60, Group.NOBLE_GAS),

    CAESIUM("Cs", 55, 132.91, 0.79, Group.ALKALI_METAL),

    BARIUM("Ba", 56, 137.33, 0.89, Group.ALKALINE_EARTH_METAL),

    LANTHANUM("La", 57, 138.91, 1.10,  Group.LANTHANOID),

    CERIUM("Ce", 58, 140.12, 1.12, Group.LANTHANOID),

    PRASEODYMIUM("Pr", 59, 140.91, 1.13, Group.LANTHANOID),

    NEODYMIUM("Nd", 60, 144.24, 1.14, Group.LANTHANOID),

    PROMETHIUM("Pm", 61, 145.00, 1.13, Group.LANTHANOID),

    SAMARIUM("Sm", 62, 150.36, 1.17, Group.LANTHANOID),

    EUROPIUM("Eu", 63, 151.96, 1.20, Group.LANTHANOID),

    GADOLINIUM("Gd", 64, 157.25, 1.20, Group.LANTHANOID),

    TERBIUM("Tb", 65, 158.93, 1.20, Group.LANTHANOID),

    DYSPROSIUM("Dy", 66, 162.50, 1.22, Group.LANTHANOID),

    HOLMIUM("Ho", 67, 164.93, 1.23, Group.LANTHANOID),

    ERBIUM("Er", 68, 167.26, 1.24, Group.LANTHANOID),

    THULIUM("Tm", 69, 168.93, 1.25, Group.LANTHANOID),

    YTTERBIUM("Yb", 70, 173.05, 1.10, Group.LANTHANOID),

    LUTETIUM("Lu", 71, 174.97, 1.27, Group.LANTHANOID),

    HAFNIUM("Hf", 72, 178.49, 1.30, Group.TRANSITION_METAL),

    TANTALUM("Ta", 73, 180.95, 0.14, Group.TRANSITION_METAL),

    TUNGSTEN("W", 74, 183.84, 0.13, Group.TRANSITION_METAL),

    RHENIUM("Re", 75, 186.21, 0.14, Group.TRANSITION_METAL),

    OSMIUM("Os", 76, 190.23, 0.13, Group.TRANSITION_METAL),

    IRIDIUM("Ir", 77, 192.22, 0.13, Group.TRANSITION_METAL),

    PLATINUM("Pt", 78, 195.01, 0.13, Group.TRANSITION_METAL),

    GOLD("Au", 79, 196.97, 0.13, Group.TRANSITION_METAL),

    MERCURY("Hg", 80, 200.59, 0.14, Group.TRANSITION_METAL),

    THALLIUM("Tl", 81, 204.38,  0.13, Group.POST_TRANSITION_METAL),

    LEAD("Pb", 82, 207.2, 0.13, Group.POST_TRANSITION_METAL),

    BISMUTH("Bi", 83, 208.98, 0.12, Group.PNICTOGEN),

    POLONIUM("Po", 84,  209.00,  2.00, Group.CHALCOGEN),

    ASTATINE("At", 85, 210.00,  2.20, Group.HALOGEN),

    RADON("Ra",86, 222.00, 2.20, Group.NOBLE_GAS),

    FRANCIUM("Fr", 87, 223.00, 0.70, Group.ALKALI_METAL),

    RADIUM("Ra", 88, 226.00, 0.90, Group.ALKALINE_EARTH_METAL),

    ACTINIUM("Ac", 89, 227.00, 1.10, Group.ACTINOID),

    THORIUM("Th", 90, 232.04, 1.30, Group.ACTINOID),

    PROTACTINIUM("Pa", 91, 231.04, 1.50, Group.ACTINOID),

    URANIUM("U", 92, 238.03, 1.38, Group.ACTINOID),

    NEPTUNIUM("Np", 93, 237.00, 1.38, Group.ACTINOID),

    PLUTONIUM("Pu", 94, 244.00, 1.28, Group.ACTINOID),

    AMERICIUM("Am", 95, 243.00, 1.13, Group.ACTINOID),

    CURIUM("Cm", 96, 247.00, 1.28, Group.ACTINOID),

    BERKELIUM("Bk", 97, 247.00, 1.30, Group.ACTINOID),

    CALIFORNIUM("Cf", 98, 251.00, 1.30, Group.ACTINOID),

    EINSTEINIUM("Es", 99, 252.00, 1.30, Group.ACTINOID),

    FERMIUM("Fm", 100, 257.00, 1.30, Group.ACTINOID),

    MENDELEVIUM("Md", 101, 258.00, 1.30, Group.ACTINOID),

    NOBELIUM("No", 102, 259.00, 1.30, Group.ACTINOID),

    LAWRENCIUM("Lr", 103, 266.00, 1.30, Group.ACTINOID);





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
        POST_TRANSITION_METAL(new Color(95, 111, 93)),
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
        while (type.equals("proton") && protons > protonCoords.size()) {
            protonCoords.add(coords);
        }
        while (type.equals("neutron") && neutrons > neutronCoords.size()) {
            neutronCoords.add(coords);
        }

        //check if you need to remove proton/neutron
        while (type.equals("proton") && protons < protonCoords.size()) {
            protonCoords.remove(0);
        }
        while (type.equals("neutron") && neutrons < neutronCoords.size()) {
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
