package Loops;

public class Loop1 {
    public static void main(String[] args) {
        //for loop
        int i = 10;
        for (i = 1; i <= 10; i++)
            System.out.println("Hello World");
        //for loop

        int num = 9, k;
        for (k = 1; k <= 10; k++)
            System.out.println(num + " * " + k + " = " + (num * k));
        // while loop

        int a = 1, n = 5;
        while (a <= n) {
            System.out.println(a);
            a++;
        }
        // while loop
        int x = 1, sum = 0;

        while (x <= 10) {
            sum = sum + x;
            x++;
        }
        System.out.println("Summation =" + sum);
    }

    }






