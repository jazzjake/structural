package com.pluralsight.composite;

public class CompositeMenuDemo {

    //notice we are treating children the same as object itself
    public static void main(String[] args) {

        Menu mainMenu = new Menu("Main", "/main");
        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");
        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal claim", "/personal claims");

        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());

    }
}
