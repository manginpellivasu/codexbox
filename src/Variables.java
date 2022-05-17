import java.sql.SQLOutput;

public class Variables{
    int age=20,age1=25;                 //instance variables
    static String name= "vaasu";        //static variables
    public static void main(String[]args)
    {
        int num1=123456;               //local variables
        System.out.println(num1);
        System.out.println(Variables.name);
        Variables obj=new Variables();
        System.out.println(obj.age+obj.age1);







            }

    }

