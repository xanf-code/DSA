package OOPS.Super;

class Vehical {
    int maxSpeed;

    Vehical() {
        System.out.println("Vehical Constructor");
    }
}

class Car extends Vehical {
    Car() {
        super();
        System.out.println("Car Constructor");
    }
}