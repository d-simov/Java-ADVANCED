package main;

public class Viano extends Mercedes {

    int numberOfSeats;

    public Viano(Fuel fuel, String engine, int horsePower, int price, int yearOfProduction, int kmClaimed, int numberOfSeats, Cities city, String ownerPhone) {
        super(fuel, engine, horsePower, price, yearOfProduction, kmClaimed, city, ownerPhone);
        this.numberOfSeats = numberOfSeats;
        this.model = "Viano";

    }

    @Override
    public String toString() {
        return super.toString() + " seats: " + numberOfSeats;
    }
}
