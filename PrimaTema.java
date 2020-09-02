public class PrimaTema {

    // Tema 1: Definiti 2 variabile A si B la care sa le atribuiti valori intregi. Comparati cele doua variabile si
    // vedeti care din ele este mai mare apoi afisati rezultatul.

    public static void tema1 (int a, int b){                   //definirea metodei.

        if(a >= b) {                                             // compararea celor doua variabile.
            System.out.println("A este mai mare sau egal decat B."); //rezultat in cazul in care rezultatul este adevarat.
        } else
            System.out.println("A nu este mai mare decat B"); //rezultat in cazul in care rezultatul este fals.
    }

    // Tema 2: Definiti o variabila A la care sa ii atribuiti o valoare. Verificati daca valoarea atribuita este
    // para sau impara.

    public static void tema2 (int a) {
        if (a%2 == 0) {
            System.out.println("A este par."); //rezultat in cazul in care rezultatul este adevarat.
        } else
            System.out.println("A este impar."); //rezultat in cazul in care rezultatul este adevarat.
    }

    // Tema 3: Definiti o variabila AN la care sa ii atribuiti o valoare. Verificati daca AN-ul este bisect sau nu.

    public static void tema3v1 (int an) {
        if((an%4 == 0 && an%100 !=0) || an%400 ==0) {
            System.out.println(an + " este an bisect !!!"); //rezultat in cazul in care rezultatul este adevarat.
        } else
            System.out.println(an + " nu este un an bisect !!!");
    }

    public static void tema3v2 (int an) {
        if (an%4 == 0) {
            if (an%100 !=0){
                System.out.println(an + " este an bisect !!!"); //rezultat in cazul in care rezultatul este adevarat.
            } else  if (an%400 == 0){
                System.out.println(an + " este an bisect !!!"); //rezultat in cazul in care rezultatul este adevarat.
            } else System.out.println(an + " nu este un an bisect !!!");
        } else System.out.println(an + " nu este un an bisect !!!");
    }

    // Tema 4: Definiti o variabila NUM la care sa ii atribuiti o valoare. Verificati daca numarul este divizibil cu 3 sau 5.
    // daca este divizibil cu 3 returnatit valoarea Fizz, daca este divizibil cu 5 returnati valoarea Buzz. Daca este divizibil
    // la abele numere returnati valoarea Fizz Buzz.

    public static String tema4 (int num) {
        if(num%3 == 0 && num%5 == 0){
            return "Fizz Buzz";
        } else if(num%5== 0) {
            return "Buzz";
        } else if (num%3 == 0){
            return "Fizz";
        } else return "Numarul nu este divizibil la 3 sau 5!!!";
    }
}
