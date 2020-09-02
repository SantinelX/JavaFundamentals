import java.lang.reflect.Array;
import java.util.Scanner;

public class TemaTrei {

    public static void main (String[] args) {

//        exercitiu1();
//        exercitiu2();
//        exercitiu3();
//        exercitiu4();
       exercitiu5();

    }

    public static void exercitiu1 (){

        int col = 3;
        int row = 2;
        float sum = 0;
        float count = 0;
        float average;

        int [][] myArray = { {5, 6, 8}, { 10, 12, 14}};

        for(int i = 0; i< row; i++){
            for (int j=0; j<col; j++) {

                sum += myArray[i][j];
                count +=1;

            }
        }
        average = sum/count;
        System.out.println("Media cifrelor din matrice este: " + average);
    }

    public static void exercitiu2 (){

        int col = 3;
        int row = 2;

        int [][] myArray = { {5, 6, 7}, { 10, 12, 14}};

        for(int i = 0; i< row; i++){
            for (int j=0; j<col; j++) {
                if(myArray[i][j]%2 != 0 ){
                    System.out.print(myArray[i][j] + ",");
                }
            }
        }
    }

    public static void exercitiu3 (){

        int col = 3;
        int row = 2;

        int [][] myArray = { {5, 6, 7}, { 10, 12, 14}};

        for(int i = row-1 ; i >= 0; i--){
            for (int j = col-1; j >= 0; j--) {
                    System.out.print(myArray[i][j] + ",");
            }
            System.out.println();
        }
    }

    public static void exercitiu4 (){

        int col = 3;
        int row = 2;

        int par =  0;
        int impar = 0;

        int [][] myArray = { {5, 6, 7}, { 10, 12, 14}};

        for(int i = row-1 ; i >= 0; i--){
            for (int j = col-1; j >= 0; j--) {
                if(myArray[i][j]%2 == 0){
                    par+=1;
                } else
                    impar+=1;
            }
        }
        System.out.print("Numare impare: " +impar + "\nNumere pare: " + par);
    }

    public static void exercitiu5 () {

        int col = 7;
        int row = 3;


        int[][] myMatrix = {{5, 6, 44, 1, 7, 12, 14}, {7, 36, 20, 5, 1, 45, 9}, {1, 2, 4, 5, 6, 44, 55}};
        int[] myArray = new  int[20];
        int position=0;


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < row; k++) {
                    for (int l = 0; l < col; l++) {
                        if (i == k && j == l) {

                        } else {
                            if (myMatrix[i][j] == myMatrix[k][l]) {

//                                System.out.print(myMatrix[i][j]+", ");
                                myArray[position]=myMatrix[i][j];
                                position++;

                            }
//                            System.out.println(myArray[i][j]);
//                            System.out.println(myArray[k][l]);
//                            System.out.println(myArray.length);
//                            System.out.println();

                        }
                    }
                }
            }
        }
        for (int i = 0; i< myArray.length; i++){
            for (int j = i+1; j< myArray.length; j++){
                if (myArray[i] == myArray[j] ){
                    System.out.print(myArray[j]+ ",");
                }
            }
           System.out.print(myArray[i] + ",");
        }
    }

//    public static void exercitiul5v2 (){
//
//        int col = 3;
//        int row = 3;
//
//        int [][] myArray = { {5, 6, 44,12},{ 6, 44, 12,13},{6, 36, 20,22}};
//
//        for (int i =0; i<col; i++) {
//            for (int j = 0; j < row-1; j++) {
//                if (myArray[i][j] == myArray[j][i]) {
//                    System.out.println(myArray[i][j]);
//                }
//            }
//        }
//    }



}








