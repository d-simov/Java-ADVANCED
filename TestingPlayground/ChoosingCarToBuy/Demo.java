package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {

        HashMap<String, Mercedes> wannabeDidoCars = new HashMap<>();
        wannabeDidoCars.put("0883363955", new EClass(Mercedes.Fuel.DIESEL, "220", 125, 2500,
                1999, 360000, Mercedes.Cities.BT, "0883363955"));
        wannabeDidoCars.put("0899545475", new EClass(Mercedes.Fuel.DIESEL, "220", 170, 12500,
                2010, 343000, Mercedes.Cities.SF, "0899545475"));
        wannabeDidoCars.get("0883363955").setVin("WDB2102061A859740");
        wannabeDidoCars.get("0883363955").addProof(214000,2010);
        wannabeDidoCars.get("0899545475").setVin("wdd2122021a185633");
//        wannabeDidoCars.put("")


        System.out.println(wannabeDidoCars);






    }
}
