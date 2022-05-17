package flowcontrol;

public class Control {
    public static void main(String[] args) {
        int num = 20;
        //if block
        if (num > 15)
            System.out.println(("num is greater than 15"));
        System.out.println("out side of if block");

        //if else block

        if (num > 15)
            System.out.println("20 greater than 15 ");
        else
            System.out.println("20 less than 15");

        //  nested if
       if (num==20)
        if (num<25)
            System.out.println("num less than 25");
       if (num>18)
           System.out.println("num greater than 18");
       else
           System.out.println("num less than 18");
       // if-else-ladder
        if (num==20)
            System.out.println("num is 20");
        else if(num==12)
            System.out.println("num is 12");
        else if(num==15)
            System.out.println("num is 15");
        else
            System.out.println("i is 20");

        }


    }





