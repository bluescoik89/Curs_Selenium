package curs8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter num1: ");
            int num1 = scan.nextInt();
            System.out.println("Enter num2: ");
            int num2 = scan.nextInt();

            num2 = (Integer) null;


            int sum = num1 / num2;
            System.out.println(sum);
        } catch (InputMismatchException e) {
            System.out.println("Please insert only numeric values");
        } catch (ArithmeticException e) {
            System.out.println("do not divide by 0");
        } catch (NullPointerException e) {
            System.out.println("null pointed occured");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }
}
