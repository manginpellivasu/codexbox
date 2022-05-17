package operators;

public class Operator3 {
    public static void main(String[]args){
        int a=25,b=20,c=50,max;
        //logical operator and &&
        System.out.println(a<b && c>b);
        System.out.println(a>c && a>b);
        //or ||
        System.out.println(a==b || b>c);
        System.out.println(c>a || b>a);
        // !
        System.out.println("(a<b) "+! (b>c));
        System.out.println("c==a" +! (a>c));
        // ternary
        System.out.println("first num :"+a);
        System.out.println("second num :"+b);
        max=(a > b)? a : b;
        System.out.println("maximum is =" +max);
    }
}
