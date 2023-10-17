package main.Test2;

import java.time.LocalDate;
import java.time.Period;

public class DidoAndAnnieHalfLifeCelebrations {

    public static void main(String[] args) {

        LocalDate theDayWeMet = LocalDate.of(2003,3,21);
        LocalDate didoBirthday = LocalDate.of(1981, 5, 17);
        LocalDate annieBirthday = LocalDate.of(1985, 6, 9);

        Period timeDidoLivedAlone =  Period.between(didoBirthday, theDayWeMet);
        Period timeAnnieLivedAlone =  Period.between(annieBirthday, theDayWeMet);

        LocalDate annieHalfLifeCeleb = (theDayWeMet.plus(timeAnnieLivedAlone) );
        LocalDate didoHalfLifeCeleb = (theDayWeMet.plus(timeDidoLivedAlone));

        System.out.println("Annie \"Half Life Celeb Day\" is on " + annieHalfLifeCeleb + " and \n" +
                "Dido \"Half Life Celeb Day\" is on " + didoHalfLifeCeleb + ".");

    }
}
