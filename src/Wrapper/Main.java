package Wrapper;

public class Main {
    public static void main(String[] args) {
        WrapperClass w=new WrapperClass();
        System.out.println("premitive classes");
        System.out.println(w.getA());
        System.out.println(w.getF());
        System.out.println(w.getD());
        System.out.println(w.getL());
        System.out.println(w.getC());
        System.out.println(w.isFlag());
        System.out.println(w.getS());
        System.out.println(w.getBi());
        System.out.println("wrapper classes");//boxing
        System.out.println(w.getInteger());
        System.out.println(w.getFloatvalue());
        System.out.println(w.getaDouble());
        System.out.println(w.getAlong());
        System.out.println(w.getaChar());
        System.out.println(w.isFlag());
        System.out.println(w.getaShort());
        System.out.println(w.getaByte());


        //auto boxing

                int k=5;
                Integer S=k;
        System.out.println(S);
        //    un boxing

        Integer z=new Integer(50);
        int z1=z;
        System.out.println(z1);

    }
}
