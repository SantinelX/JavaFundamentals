public class Weekend2 {

   public static void whileState (int a, int b) {
       while ( a < b){

           System.out.println("Sunt mai mare !!!");
           a++;

       }
   }

   public static void fizzBuzz (int a, int b) {

       int count3=0;
       int count5=0;
       int count35=0;

       while (a<=b) {
           System.out.println(a);
           if (a%3==0 && a%5 ==0) {
               System.out.println(a + " este divizibil si cu 3 si cu 5 deci FizzBuzz !!!");
               count35+=1;
           } else if (a%3 == 0) {
               System.out.println(a + " este divizibil cu 3 deci Fizz !!!");
               count3+=1;
           } else if (a%5==0) {
               System.out.println(a + " este divizibil cu 5 deci Buzz !!!");
               count5+=1;
           }
           a++;
       }
       System.out.println("Intre " + (b-a) + " si " + b + "sunt: \n" + count3 + " numere divizibile cu 3; \n" +
               count5 + " numere divizibile cu 5; \n" + count35 + " numere divizibile cu 3 si cu 5.");

   }

   public static void bidimensionalArray () {

       int[][] bidArray = new int [2][3];
       bidArray[0][0] = 5;
       bidArray[0][1] = 6;
       bidArray[0][2] = 7;
       bidArray[1][0] = 10;
       bidArray[1][1] = 12;
       bidArray[1][2] = 14;

       for (int i =0; i< bidArray.length;i++) {
           System.out.println(bidArray[i]);
           System.out.println();
           for (int j =0; j< bidArray.length;j++){
              //5 System.out.println(bidArray[j]);
           }
       }



   }
}
