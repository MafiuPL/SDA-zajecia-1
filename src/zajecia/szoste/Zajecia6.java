package zajecia.szoste;

import zajecia.czwarte.ZadaniaZeScannerem;

/**
 * Created by RENT on 2017-02-07.
 */
public class Zajecia6 {
    public static void main(String[] args) {
        // int numberOfElements = sumUntil(15);
        // int numberOfElements = avgUntil(15);
        //  System.out.println("Podano" + numberOfElements + "liczb");
        calculator();
    }

    public static int sumUntil(int sum) {
        boolean flag = true;
        int counter = 0;
        int numberFromUserSum = 0;
        while (flag) {
            if (numberFromUserSum < sum) {
                int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
                numberFromUserSum += numberFromUser;
                counter++;
            } else {
                flag = false;
            }
        }
        return counter;

    }


    public static int avgUntil(int avg) {
        boolean flag = true;
        int sum = 0;
        int counter = 0;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            sum += numberFromUser;
            counter++;
            if ((double) sum / counter > avg) {
                flag = false;
            }
        }
        return counter;
    }

    public static void calculator() {
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnozenie");
        System.out.println("4. Dzielenie");
        System.out.println("0. Koniec");
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Podaj dzialanie");
            int firstNumber = ZadaniaZeScannerem.getNumberFromUser("Podaj pierwsza liczbe");
            int secondNumber = ZadaniaZeScannerem.getNumberFromUser("Podaj druga liczbe");
            switch (numberFromUser) {
                case 1:
                    System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));
                    break;
                case 2:
                    System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.println(firstNumber + "*" + secondNumber + "=" + (firstNumber * secondNumber));
                    break;
                case 4:
                    if (secondNumber == 0) {
                        System.out.println("Nie dziel przez 0!");
                    } else {
                        System.out.println(firstNumber + "/" + secondNumber + "=" + (firstNumber / secondNumber));
                    }
                    break;

                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Nie poprawne dane");
                    break;
            }
        }
    }
}





