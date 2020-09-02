import javax.swing.event.SwingPropertyChangeSupport;
import java.util.Scanner;
public class Exercitii {

    public static void main(String[] args) {
        reverse("avaJ");
    }


    public static String convert(int minutes) {
        int seconds = minutes * 60;
        return "In " + minutes + " minute sunt " + seconds + " secunde.";

    }

    public static void sum3adn5(int a, int b) {

        int counter = 0;
        int total = 0;

        for (int i = a; i < b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                counter++;
                total += i;
            }
            if (counter == 2) {
                break;
            }
        }
        System.out.println(total);
    }

    public static int sumDigit(int a) { //125

        int sum = 0;

        if (a < 10) {
            return -1;
        }

        while (a > 0) {
            int digit = a % 10;
            sum += digit;
            a /= 10;

        }
        return sum;
    }

    public static int getEavenDigitSum(int a) { //125

        int sum = 0;

        if (a < 10) {
            return -1;
        }

        while (a > 0) {
            int digit = a % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            a /= 10;
        }
        return sum;
    }

    public static void scanner() {
        System.out.println("What is yor name?");
        Scanner scaner = new Scanner(System.in);
        String name = scaner.nextLine();
        System.out.println("my name is: " + name);

    }

    public static void reverse(String a) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        stringBuilder.reverse();
        a.length();

        System.out.println(stringBuilder);

    }
}

