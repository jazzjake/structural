package com.pluralsight.flyweight;

public class FlyweightEverydayDemo {

    public static void main(String[] args) {
        // object created and stored in literal pool
        Integer firstInt = Integer.valueOf(5);
        // just pulling iy out of literal pool
        Integer secondInt = Integer.valueOf(5);
        Integer thirdInt = Integer.valueOf(10);

        // first two will print same address
        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));

        System.out.println(System.identityHashCode(thirdInt));
    }
}
