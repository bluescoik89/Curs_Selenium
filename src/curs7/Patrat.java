package curs7;

public class Patrat extends Shape {


    public Patrat(String nume, String culoare) {
        super(nume, culoare);
    }

    String nume = "Patrat";
    String culoare = "Negru";

    public void printDetatils() {
        System.out.println("Numele este " + super.nume + " si culoarea este " + super.culoare);
    }

}
