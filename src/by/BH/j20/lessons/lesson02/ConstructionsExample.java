package by.BH.j20.lessons.lesson02;

public class ConstructionsExample {
    public static void main(String[] args) {
        int a = 5;
        if (a >= 5) {
            System.out.println("a is great than 5");
            a++;
        } else if (a >= 0) {
            System.out.println("a is less then 5");
        }
        System.out.println("a =" + a);
        System.out.println();


            int q = 5;
            int w = 80;
            double e = 3.5;
            System.out.println("rty" + q + w + e + "qwe");

        System.out.println();

        int b = 0;
        for(int i = 10; i > 0; i -= 2){
            System.out.print(i + " ");
            b = i;
        }
        System.out.println("\n\n" + b);
    }

}
