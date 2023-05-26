package TemaCurs3;

import java.util.Scanner;

public class VerifyAge {

    int age;

    public void askAge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Te rog introdu varta: ");
        age = scan.nextInt();
    }

    public void checkAge() {
        if (age < 18) {
            System.out.println("Esti minor");
        } else if (age >= 18 && age <= 65) {
            System.out.println("Esti adult");
        } else {
            System.out.println("Esti batran");
        }
    }

}
