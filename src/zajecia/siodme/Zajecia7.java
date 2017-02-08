package zajecia.siodme;

import java.util.Random;

/**
 * Created by RENT on 2017-02-08.
 */
public class Zajecia7 {
    public static void main(String[] args) {
        //   printStringStatistics(stringStatistics("mat    eusz"));
        //   String randomString = randomLowerCase(100);
        //   System.out.println(randomString);
        //   printStringStatistics(stringStatistics(randomString));
        //   convertSpaces("ala_ma_kota");
        //   System.out.println(reverseString("mateusz mistrz"));
        //   System.out.println(isPalindrome("lech"));
        String message = "Ala ma 2 koty i 3 psy";
        int sum = sumFromString(message);
        System.out.println("Ala ma " + sum + " zwierzat");
    }

    public static int[] stringStatistics(String message) {
        int[] statisticsArray = new int[26];
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                int index = charArray[i] - 97;
                statisticsArray[index]++;
            }
        }
        return statisticsArray;
    }

    public static void printStringStatistics(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print((char) (i + 97));
            }
        }
    }

//    public static String randomLowerCase(int size) {
//        Random random = new Random();
//        char[] chars = new char[size];
//        for (int i = 0; i < chars.length; i++) {
//            int generatedValue = random.nextInt(26) + 97;
//            chars[i] = (char) generatedValue;
//        }
//        return String.valueOf(chars);
//}
//

    public static String randomLowerCase(int size) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int generatedValue = random.nextInt(26) + 97;
            stringBuilder.append((char) generatedValue);
        }
        return stringBuilder.toString();
    }

    public static String convertSpaces(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 95) {
                charArray[i] = (char) 32;
            }

        }
        return String.valueOf(charArray);
    }

    public static String reverseString(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            char tmp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = tmp;
        }
        return String.valueOf(charArray);
    }

    public static boolean isPalindrome(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int sumFromString(String message) {
        char[] charArray = message.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] > 47 && charArray[i] < 58) {
                {
                    sum += charArray[i] - 48; }
                }
            }
            return sum;
        }

        
    }

