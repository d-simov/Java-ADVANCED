package main;

public class EClass extends  Mercedes {

    public EClass(Fuel fuel, String engine, int horsePower, int price, int yearOfProduction, int kmClaimed, Cities city, String ownerPhone) {
        super(fuel, engine, horsePower, price, yearOfProduction, kmClaimed, city, ownerPhone);
        this.model = "E";
    }

}
