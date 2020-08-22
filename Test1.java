public class Test1 {
    public static void main(String[] args) {
//        int x =5;
//        System.out.print(x++ + ", ");
//        System.out.print(++x + ", ");
//        System.out.print(--x + ", ");
//        System.out.print(x-- + ", ");
        ex10(5);
    }

    public static void ex10(int x){

        x++;
        System.out.print(x);
        ++x;
        System.out.print(x);
        --x;
        System.out.print(x);
        x--;
        System.out.print(x);

    }
}
