package zajecia;

/**
 * Created by RENT on 2017-02-04.
 */
public class Zajecia4 {
    public static void main(String[] args) {
        int[] array = {-2, 3, -5, 4, 9, 7, -5};
        printLessThan(5);
        System.out.println(celsiusForFahrenheit(10));
        System.out.println(fahrenheitToCelsius(15));
        statistics(array);
        System.out.println(statistics(array));
        dlugoscTablicy(array);
        System.out.println(dlugoscTablicy(array));
        average(array);
        System.out.println(average(array));
        iloczyn(array);
        System.out.println(iloczyn(array));
        numberOfEven(array);
        System.out.println(numberOfEven(array));
        numberOfOdd(array);
        System.out.println(numberOfOdd(array));


    }

    public static void sumOfLessThan(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {

        }

    }


    public static void printLessThan(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println(i + " ");
        }

    }

    public static void printEvenLessThan(int number) {
        for (int i = 0; i < number; i += 2) {
            System.out.println(i);
        }

    }

    public static double celsiusForFahrenheit(int value) {
        return (value * (9.0 / 5.0)) + 32;
    }



    public static double fahrenheitToCelsius(int value) {
        return (value - 32) / 1.8;

    }


    public static int statistics(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum;
    }

    public static int dlugoscTablicy (int[] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length = array.length;
        }
        return length;
    }

    public static double average (int[] array) {
        int srednia = 0;
        for (int i = 0; i < array.length; i++) {
            srednia = statistics(array) / dlugoscTablicy(array);
        }
        return srednia;
    }

    public static double iloczyn (int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product = statistics(array) * dlugoscTablicy(array);
        }
        return product;
    }

    public static int numberOfEven (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }

        }
        return sum;
    }

    public static int numberOfOdd (int[] array) {
        return array.length - numberOfEven(array);
        }

    }






