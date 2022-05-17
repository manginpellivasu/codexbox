package Inheritance;

public class Main {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        System.out.println(m.getPrice());
        Mobile mobile= new Realme();
        System.out.println(mobile.getPrice());
        System.out.println(mobile.getStorage());
        Mobile mobile1=new Redmi();
        System.out.println(mobile1.getBattery());



    }
}
