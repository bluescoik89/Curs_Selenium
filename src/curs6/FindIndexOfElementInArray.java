package curs6;

public class FindIndexOfElementInArray {
    /*
    avem un array si vrem sa aflam indexul unui anumit element
    Ex: index pentru element 8 este 3
    rezolvam cu :
    FOR EACH
    WHILE
    DO WHILE
    */

    static int[] numbers = {3, 5, 7, 8, 9, 2, 12};

    public static void main(String[] args) {
        System.out.println("----FOR");
        rezolvareCuFor(8);
        System.out.println("----FOREACH");
        rezolvareCuForEach(8);
        System.out.println("----While");
        rezolvareCuWhile(8);
        System.out.println("----DoWhile");
        rezolvareCuDo(8);


    }


    public static void rezolvareCuFor(int element) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == element) {
                System.out.println("Index pentru " + element + " este " + i);
            }
        }
    }

    public static void rezolvareCuForEach(int number) {
        int i = 0;
        for (int element : numbers) {
            if (number == element) {
                System.out.println("Index pentru " + element + " este " + i);
            }
            i++;
        }

    }

    public static void rezolvareCuWhile(int number) {
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] == number) {
                System.out.println("Index pentru " + number + " este " + i);
            }
            i++;
        }
    }

    public static void rezolvareCuDo(int number) {
        int j = 0;
        do {
            if (numbers[j] == number) {
                System.out.println("Index pentru " + number + " este " + j);
            }
            j++;
        } while (j < numbers.length);
    }
}


