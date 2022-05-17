package Oops;

public class Polymorphism{

    float polymorphism(int a, float b) {
       return a+b;

    }
    long polymorphism(int a,int b,int c){


    return a+b+c;
}

    public static void main(String[] args) {
        Polymorphism p=new Polymorphism();
        System.out.println(p.polymorphism(45,50.9f));
        System.out.println(p.polymorphism(45,89,98));
    }
}





