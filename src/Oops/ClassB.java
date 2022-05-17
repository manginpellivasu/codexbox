package Oops;

public class ClassB extends ClassA{
    float classB(float p,float o) {

        return p+o;

    }
    long classB(int e,int f){
        return e/f;

    }

    public static void main(String[] args) {
        ClassA c=new ClassB();
       // System.out.println(c.classA(5.0f,3.0f));
        System.out.println(c.classA("vaasu","vasu"));
       //ClassB c1=new ClassB();
        System.out.println(c.classB(3.5f,5.5f));

    }
}
