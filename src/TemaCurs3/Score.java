package TemaCurs3;

import java.util.Scanner;

public class Score {

    int score;

    public void askScore() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu punctajul obtinut la test: ");
        score = scan.nextInt();
    }

    public void validateSore() {
        if (score <= 65) {
            System.out.println("Ai picat. Mai incearca");
        } else {
            System.out.println("Felicitari ai trecut");
        }
    }

}
