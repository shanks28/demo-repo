package datesAndCalendars;

import java.util.Calendar;
import java.util.Date;

public class DatesandCalendars {
    public static void main(String [] args){
        displaycurrentData();

    }
    public static void displaycurrentData(){
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);
        Date date=new Date();
        calendar.setTime(date);
        System.out.println(calendar.getTime());

    }
    public static void displaySetDate(){
        Calendar calendar=Calendar.getInstance();
        calendar.set(2031,02,02);
        Date date= calendar.getTime();
        System.out.println(date);



    }
}
