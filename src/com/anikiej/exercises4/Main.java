package com.anikiej.exercises4;

abstract class Machine {
    protected String brand;
    protected String name;
    protected double engineCapacity;
    protected EngineType engineType;

    enum EngineType {
        ELECTRIC,
        GASOLINE,
        DIESEL
    }
}

class LawnMower extends Machine {
    private boolean hasBlender;
    private boolean hasDrive;
    private int numberOfBlades;

    public LawnMower(String brand, String name, double engineCapacity, EngineType engineType, boolean hasBlender,
                     boolean hasDrive, int numberOfBlades) {
        this.brand = brand;
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.engineType = engineType;
        this.hasBlender = hasBlender;
        this.hasDrive = hasDrive;
        this.numberOfBlades = numberOfBlades;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
        System.out.println("Engine Capacity: " + engineCapacity);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Has Blender: " + hasBlender);
        System.out.println("Has Drive: " + hasDrive);
        System.out.println("Number of Blades: " + numberOfBlades);
    }

    public boolean hasBlender() {
        return hasBlender;
    }

    public void setHasBlender(boolean hasBlender) {
        this.hasBlender = hasBlender;
    }

    public boolean hasDrive() {
        return hasDrive;
    }

    public void setHasDrive(boolean hasDrive) {
        this.hasDrive = hasDrive;
    }

    public int getNumberOfBlades() {
        return numberOfBlades;
    }

    public void setNumberOfBlades(int numberOfBlades) {
        this.numberOfBlades = numberOfBlades;
    }
}


public class Main {
    public static void main(String[] args) {
        LawnMower lawnMower = new LawnMower("Honda", "HRX217VKA", 200,
                Machine.EngineType.GASOLINE, true, true, 3);

        lawnMower.display();

        lawnMower.setHasBlender(false);
        lawnMower.setHasDrive(false);
        lawnMower.setNumberOfBlades(4);

        System.out.println("\nAfter modification:");
        System.out.println("Has Blender: " + lawnMower.hasBlender());
        System.out.println("Has Drive: " + lawnMower.hasDrive());
        System.out.println("Number of Blades: " + lawnMower.getNumberOfBlades());
    }
}
