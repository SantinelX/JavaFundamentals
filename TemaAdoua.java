import java.util.Arrays;

public class TemaAdoua {

    public static void exercitiul1() {
        int[] myarray = {1, 7, 3, 10, 9, 9, 1};
        double total = 0;

        for (int i = 0; i < myarray.length; i++) {
            total = total + myarray[i];
        }
        System.out.println(total);
        System.out.println(myarray.length);

       double average = total / myarray.length;

        System.out.println("Media elementelor din array este: " + average);
    }

    public static void exercitiul2() {

        int[] myArray = {1, 7, 3, 10, 9};

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                System.out.print(myArray[i] + ", ");
            }
        }
    }

    public static void exercitiul3() {

        int[] myArray = {1, 7, 3, 10, 9};

        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + ", ");
        }
    }

    public static void exercitiul4() {

        int[] myArray = {1, 7, 3, 10, 9, 12};
        int par = 0;
        int impar = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }
        }
        System.out.println("Par: " + par + "; Impar: " + impar);
    }

    public static void exercitiul5() {

        int[] myArray = {1, 7, 3, 7, 10, 1, 9, 10};

        for (int i = 0; i < myArray.length; i++) {

            for (int j = i + 1; j < myArray.length; j++) {

                if (myArray[i] == myArray[j]) {
                    System.out.println(myArray[j]);
                }
            }
        }
    }
    public static void exercitiul6 () {
        int[] myArray = { 1, 7, 3, 10, 9, 18, 21, 3, 71, 70};
        int max=0;

        for (int i = 0; i < myArray.length; i++) {

            for (int j = i + 1; j < myArray.length; j++) {
                    int tempMin;
                if (myArray[i] > myArray[j]) {
                   tempMin = myArray[i];
                   myArray[i] = myArray[j];
                   myArray[j]=tempMin;
                }
            }
        }

        System.out.println(myArray[myArray.length-2]);

    }

    public static void exercitiul7() {

        int[] myArray = { 1, 2, 7, 3, 10, 2, 9};
        int sum =4;

        for (int i = 0; i < myArray.length; i++) {

            for (int j = i + 1; j < myArray.length; j++) {

                if (myArray[i] + myArray[j] == sum) {
                    System.out.print(myArray[i] + "-" + myArray[j] + ";");
                }
            }
        }
    }
}