package main;

public abstract class Mercedes {

    public enum Cities {BT, BH, SF, EH, EB, PC}
    public enum Fuel {DIESEL, A95}

    protected String model;
    protected Fuel fuel;
    protected String engine;
    boolean vinAvailable;
    String vinNumber;
    String ownerPhone;
    protected String ownerName;
    protected int yearOfProduction;
    protected int horsePower;
    protected int kmClaimed;
    protected int kmProven;
    protected int yearOfProof;
    protected Cities city;
    protected int price;

    public Mercedes(Fuel fuel, String engine, int horsePower,int price, int yearOfProduction, int kmClaimed, Cities city, String ownerPhone) {
        this.fuel = fuel;
        this.engine = engine;
        this.horsePower = horsePower;
        this.ownerPhone = ownerPhone;
        this.yearOfProduction = yearOfProduction;
        this.kmClaimed = kmClaimed;
        this.city = city;
        this.price = price;
    }

    public void setVin(String vin) {
        vinAvailable = true;
        this.vinNumber = vin;
    }

    public void addProof(int km, int year) {
        if (vinAvailable) {
            this.kmProven = km;
            this.yearOfProof = year;
        }
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        String string1 = ("\n" + model + engine + ", " + fuel + ", " + horsePower + " hp, " + yearOfProduction +
               city + " - " + price + " lv," + ", claims to be " + kmClaimed + " km.");
        int annualKmProven = this.kmProven / (this.yearOfProof - this.yearOfProduction);
        String string2 = ("Annual km first " + (this.yearOfProof - this.yearOfProduction) + " years: "
                + annualKmProven + " \\ Approximate km now: " +
                (kmProven + (2024 - this.yearOfProof) * ((annualKmProven + 20000) / 2)) + " km.");
        if (vinAvailable && this.kmProven != 0) {
            return string1 + "\n" + string2 + "\n-----------------------------------------------------------------\n";
        }
        return string1 + "\n-----------------------------------------------------------------\n";

    }

    public String getOwnerPhone() {
        return ownerPhone;
    }
}
