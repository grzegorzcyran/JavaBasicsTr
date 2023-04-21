package edu.sda.java.advanced.interfaces;

public class InterfacesDemo {

    public static void main(String[] args) {
        Drone drone = new Drone("AX");
        Bird bird = new Bird("Eagle");
        Penquin penquin = new Penquin("Coco");

        System.out.println(drone.fly());
        System.out.println(bird.fly());
        System.out.println(penquin.fly());

        Flying drone2 = new Drone("ZY");
        Flying bird2 = new Bird("Falcon");
        Flying penquin2 = new Penquin("Bubu");

        System.out.println(drone2.fly());
        System.out.println(bird2.fly());
        System.out.println(penquin2.fly());

        Flying newObject = new Drone("xcv");
        newObject = new Penquin("Kiko");

    }
}


