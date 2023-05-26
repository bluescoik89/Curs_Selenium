package TemaCurs3;

import java.util.Scanner;

public class DaysOfWeek {
    int dayofweek;


    public void askDayOfWeek() {
        Scanner scan = new Scanner(System.in);
        dayofweek = scan.nextInt();
        if (dayofweek <= 0) {
            System.out.println("Te rog sa introduci un numari mai mare decat 0");
            askDayOfWeek();
        } else if (dayofweek > 7) {
            System.out.println("Saptamana are doar 7 zile, te rog sa introduci un numar valid");
            askDayOfWeek();
        }
    }

    public void verifyDayOfWeek() {
        if (dayofweek == 1) {
            System.out.println("Astazi este luni");
        } else if (dayofweek == 2) {
            System.out.println("Astazi este marti");
        } else if (dayofweek == 3) {
            System.out.println("Astazi este miercuri");
        } else if (dayofweek == 4) {
            System.out.println("Astazi este joi");
        } else if (dayofweek == 5) {
            System.out.println("Astazi este vineri");
        } else if (dayofweek == 6) {
            System.out.println("Astazi este sambata");
        } else{
            System.out.println("Astazi este duminica");
        }
    }



}
