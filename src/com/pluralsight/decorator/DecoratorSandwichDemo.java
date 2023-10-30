package com.pluralsight.decorator;

public class DecoratorSandwichDemo {

    public static void main(String[] args) {
        //we are adding functionality to SimpleSandwich
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
