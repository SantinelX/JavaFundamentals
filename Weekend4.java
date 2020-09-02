import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Weekend4 {

    public static void main(String[] args) {

//        sumaAdouaNumere(74,36);
//        impartireCuRest(50,3);
//        printResultOfOperations(-5,8,6,
//                                55,9,9,
//                                20,-3,5,8,
//                                5,15,3,2,8,3);
//        printOutTheOutput(25.5,3.5,40.5,4.5);
//        theCircleMeasurement(7.5);
//        theAverage(10,20,32);
//        theRectangleArea(5.5,8.5);
//        swapTheNumbers(5,13);
//        compareTheNumbers(39,39);
//        sumOfDigits(13334444)

//        !!!!!!!!! The LOOOOOOOP Zone !!!!!!!

//        theMultiplicator_ex1(9);
//        eavenNumbers_ex2(100);
//        nNumberDisplay_ex3(3);
//        fizzBuzz_v2_ex4(100);
//        iveGotThePower_ex5(20);
//        theFibonaciSeries_ex6(20);
        primeNumbers_ex8(4);

//        !!!! Classroom Exercises !!!!



    }

    public static void sumaAdouaNumere (int a, int b) {

        int sum = a+b;
        System.out.println("Print line: " + a + " + " + b + " = " + sum);
        System.out.printf("Print f: %d + %d = %d\n",a,b,sum);

    }

    public static void impartireCuRest (int a, int b) {
        int impartire = a/b;
        int rest = a%b;

        System.out.printf("%d / %d = %d remainder %d\n",a,b,impartire,rest);

    }

    public static void printResultOfOperations (int op1par1, int op1par2,int op1par3,
                                                int op2par1,int op2par2,int op2par3,
                                                int op3par1 ,int op3par2,int op3par3,int op3par4,
                                                int op4par1,int op4par2,int op4par3,int op4par4, int op4par5,int op4par6){


        int operation1 = op1par1 + op1par2 * op1par3;
        int operation2 = (op2par1 + op2par2) % op2par3;
        int operation3 = op3par1 + op3par2 * op3par3 / op3par4;
        int operation4 = op4par1 + op4par2 / op4par3 * op4par4 - op4par5 % op4par6;

        System.out.printf("%d + %d  * %d  = %d \n", op1par1,op1par2,op1par3,operation1);
        System.out.printf("(%d  + %d ) %% %d  = %d \n", op2par1,op2par2,op2par3,operation2);
        System.out.printf("%d  + %d  * %d  / %d  = %d \n",op3par1,op3par2,op3par3,op3par4,operation3);
        System.out.printf("%d  + %d  / %d  * %d  - %d  %% %d  = %d \n",op4par1,op4par2,op4par3,op4par4,op4par5,op4par6,operation4);

    }

    public static void printOutTheOutput (double para1,double para2, double para3, double para4) {

        double operation = ((para1 * para2 - para2 * para2) / (para3 - para4));

        System.out.printf("(%.1f * %.1f - %.1f * %.1f) / (%.1f - %.1f)) = %.15f\n",para1, para2, para2, para2, para3, para4,operation);



    }

    public static void theCircleMeasurement (double radius) {
        double area = 3.141592653589793 * (radius*radius);
        double perimeter = 2*(3.141592653589793 * radius);

        System.out.printf("Output: Area = %.14f; Perimeter = %.14f\n",area,perimeter);


    }

    public static void theAverage ( double a, double b, double c) {

        double average = (a + b + c)/3;
        System.out.printf("Average = %f \n",average);



    }

    public static void theRectangleArea (double width, double height) {

        double area = width * height;
        double perimeter = width *2 + height*2;

        System.out.printf("Output: Area = %f; Perimeter = %f;\n",area,perimeter);

    }

    public static void swapTheNumbers (int a, int b) {
            int temp=0;
            temp=a;
            a=b;
            b=temp;
        System.out.printf("Output: a= %d; b= %d \n", a,b);


    }

    public static void compareTheNumbers (int a, int b) {
            if(a == b){
                System.out.printf("%d == %d \n",a,b);
            } else {

                if(a >= b){
                    System.out.printf("%d => %d \n",a,b);
                }

                if (a <= b){
                    System.out.printf("%d <= %d\n", a, b);
                }

                if (a < b){
                    System.out.printf("%d < %d\n", a, b);
                }

                if (a > b){
                    System.out.printf("%d > %d\n", a, b);
                }
                System.out.printf("%d != %d \n",a,b);
            }
    }

    public static void sumOfDigits_ex10(int number) {

        int initialNumber=number;
        int digitSum=0;


        while ( number > 0) {

            digitSum += number % 10;;
            number = number / 10;

        }

        System.out.printf("The sum of the digits of the number %d is: %d \n", initialNumber, digitSum);

    }

//   !!!!!!!!!! The LOOP Zone !!!!!!!!!!!

    public static void  theMultiplicator_ex1 (int number) {

        for (int i = 0; i<=10; i++){

            System.out.printf("%d X %d = %d \n",number,i,number*i);

        }
    }

    public static void eavenNumbers_ex2 (int maxNumber) {

        for (int i =1; i<=maxNumber; i++){
            if (i%2 == 0){
                System.out.printf("%d, ",i);
            }
        }
    }

    public static void  nNumberDisplay_ex3 (int n) {

        int newNumber=n;

        for( int i = 0; i<n; i++ ) {

            System.out.printf("%d,",newNumber);
           newNumber = (newNumber*10)+n;

        }
    }

    public static void fizzBuzz_v2_ex4 (int maxNumber){

        System.out.print("The numbers divided by 3 are: ");
        for (int i = 1; i < maxNumber; i++){
            if (i % 3 == 0){
                System.out.printf("%d, ",i);
            }
        }
        System.out.println();
        System.out.print("The numbers divided by 5 are: ");
        for (int i = 1; i < maxNumber; i++) {
            if (i % 5 == 0) {
                System.out.printf("%d, ", i);
            }
        }

        System.out.println();
        System.out.print("The numbers divided by 3 & 5 are: ");
        for (int i = 1; i < maxNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("%d, ", i);
            }
        }
    }

    public static void iveGotThePower_ex5 ( int thePower) {

        for (int i = thePower; i <= 100; i=i*thePower){

                System.out.printf("%d, ", i);

        }
    }

    public static void theFibonaciSeries_ex6 (int numberOfTerms) {
        int num1 = 0;
        int num2 = 1;

        System.out.printf("The first %d numbers from a Fibonaci string are:",numberOfTerms);

        for (int i = 0; i < numberOfTerms; i++) {

            System.out.printf("%d, ",num1);
            int tempSum = num1 + num2;
            num1 = num2;
            num2 = tempSum;

        }
    }

    public static void  primeNumbers_ex8 (int n) {
        n=5;
        int numberCheck=3;
        int counter=0;

                if(n<=0){
                    System.out.println("Numarul nu este valid, incercati un numar mai mare ca 0 !!!");
                } else if(n==1){
                    System.out.println(" Primul numar prim este 2.");
                } else {

                    for(int i = 0; i<n; i++){

                        for(int j=3; j<0; j-- ){

                        }

                    }
                }

    }

    //        !!!! Classroom Exercises !!!!

    public static void binarySearch (int[] myArray, int valueToSearch){

    }
}
