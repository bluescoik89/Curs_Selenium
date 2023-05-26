package TemaCurs3;

public class TestDaysOfWeek {
    public static void main(String[] args) {
        System.out.println("Introdu numarul zilei din saptamana: ");
        DaysOfWeek ziua = new DaysOfWeek();
        ziua.askDayOfWeek();
        ziua.verifyDayOfWeek();
    }
}
