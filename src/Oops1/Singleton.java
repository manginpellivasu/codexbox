package Oops1;

public class  Singleton {
   private static Singleton st;
    private Singleton(){
        System.out.println("iam inside singleton");
    }
    public static Singleton getInstance(){
        if(st==null){
            st=new Singleton();
        }
        return st;
    }
}
