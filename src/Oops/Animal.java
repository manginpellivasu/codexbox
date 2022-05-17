package Oops;

public abstract class Animal {
    abstract void colour();
    abstract void weight();

    void legs(){
        System.out.println("animal have : 4legs");
    }
    void eyes(){
        System.out.println("animal have : 2eyes");
    }


    public static class ClassSS {
        public static void main(String[] args) {
            Sub s=new Sub();
            s.display();
        }
    }
}






