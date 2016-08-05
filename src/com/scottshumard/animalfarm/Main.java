package com.scottshumard.animalfarm;

public class Main {

    public static void main(String[] args) {
        String appName = "Animal Farm";
        int patchVersion = 1;
        int majorVersion = 1;
        int minorVersion = 1;

	    System.out.printf("Welcome to %s, version %d.%d.%d\n",
                            appName, patchVersion, majorVersion, minorVersion);

        //System.out.println("welcome to " + appName + ", version " + patchVersion + "." + majorVersion + "." + minorVersion);

        /*Gorilla g = new Gorilla("Harambae" , 69, "black");
        Gorilla g2 = new Gorilla("Joe", 29, "brown", true);
        g.setName("Zandor");
        zoo.listGorillas();
        zoo.addGorilla(g);
        zoo.addGorilla(g2);
        zoo.addGorilla(new Gorilla("Bob", 43, "purple"));
        zoo.listGorillas();*/
        Zoo zoo = new Zoo("Victoria Zoo", "Victoria BC Canada");
        boolean addGorilla = true;
        while (addGorilla) {
            System.out.print("Add a gorilla? ");
            String input = System.console().readLine().replace("\n", "").replace("\r", "");
            if (input.equals("y")) {
                System.out.print("Pick a name: ");
                String name = System.console().readLine().replace("\n", "").replace("\r", "");
                System.out.print("What age is this gorilla? ");
                String age = System.console().readLine().replace("\n", "").replace("\r", "");
                System.out.print("What color are they? ");
                String color = System.console().readLine().replace("\n", "").replace("\r", "");
                Gorilla g = new Gorilla(name, Integer.parseInt(age), color);
                zoo.addGorilla(g);
            } else if (input.equals("n")) {
                addGorilla = false;
            } else {
                System.out.println("Invalid option, please enter 'y' or 'n'");
            }
        }
        zoo.listGorillas();

    }

}
