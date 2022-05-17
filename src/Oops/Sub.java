package Oops;

public class Sub  extends Super {
    void message() {
        System.out.println("This is my sub class");
        System.out.println("This is my chair");
    }

    void display() {
        message();
        super.message();
    }
}
