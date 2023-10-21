package main.Test2_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeExamples {

    public static void main(String[] args) {

//        Extract the month value of a sql.Date variable and display it:
        public static String getMonthFromDB(java.sql.Date date) {
            return date.toLocalDate().getMonth().name();
        }

//        Get the days passed between now and the last user login:
        public static long daysIdle(LocalDate lastLogin) {
            return ChronoUnit.DAYS.between(lastLogin, LocalDate.now());
        }

//        Extend user subscription with 31 days and display new date:
        public static LocalDate extendSub(LocalDate subEnd, int days) {
            return subEnd.plus(Period.ofDays(days));
        }



    }
}
