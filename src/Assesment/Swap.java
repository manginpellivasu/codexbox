package Assesment;

public class Swap {
    public static void main(String[] args) {
        //int
        int a = 10, b = 20, temp = 0;
        System.out.println("before swap:"+a);
        System.out.println("before swap:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
       // temp = a;
        //a = b;
       // b= temp;
        System.out.println("after swap:"+a);
        System.out.println("after swap:"+b);
        ;
       //float

        float c = 2.0f, d = 4.5f,temp1=0;
        System.out.println("before swap:"+c);
        System.out.println("before swap:"+d);
        c=c+d;
        d=c-d;
        c=c-d;
       // temp1=c;
      // c=d;
       // d=temp1;
        System.out.println("after swap:"+c);
        System.out.println("after swap:"+d);

        //double

         double f=5.55,g=10.33,temp2=0;
        System.out.println("before swap:"+f);
        System.out.println("before swap:"+g);
        temp2=f;
        f=g;
        g=temp2;
        System.out.println("after swap:"+f);
        System.out.println("after swap:"+g);

        //long
      long h=1234,i=7894,temp3=0;
        System.out.println("before swap:"+h);
        System.out.println("before swap:"+i);
        temp3=h;
        h=i;
        i=temp3;
        System.out.println("after swap:"+h);
        System.out.println("after swap:"+i);

        //char

        char j='l',k='m',temp4=0;
        System.out.println("before swap:"+j);
        System.out.println("before swap:"+k);
        temp4=j;
        j=k;
        k=temp4;
        System.out.println("after swap:"+j);
        System.out.println("after swap:"+k);

        //boolean
        boolean n=true,o=false;
        System.out.println("before swap:"+n);
        System.out.println("before swap:"+o);
        boolean temp5=n;
        n=o;
        o=temp5;
        System.out.println("after swap:"+n);
        System.out.println("after swap:"+o);


        //short

        //byte




    }
}


