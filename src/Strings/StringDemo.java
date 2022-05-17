package Strings;

public class StringDemo{
    public static void main(String[]args){
        String str="HELLO";
        str=str+" WORLD";
        System.out.println(str);

        //APPEND
        StringBuffer s1=new StringBuffer("ABC");
        s1.append("DEF");
        s1.append("GHI");
        System.out.println(s1);
        StringBuilder s2=new StringBuilder("ABC");
        s2.append("DEF");
        s2.append("GHI");
        System.out.println(s2);

        //Capacity

        StringBuffer s3=new StringBuffer("higkdbgjbvuioerjhbghoiekgbni");
        System.out.println("capacity:" + s3.capacity());
        //length

        StringBuffer s4=new StringBuffer("asdfhjkllbvuhfufii");
        System.out.println("length:" +s4.length());

        //equals   and s.tostring

        StringBuffer sb=new StringBuffer("java");
        StringBuffer sb1=new StringBuffer("java");


        System.out.println(sb.toString().equals(sb1.toString()));

        // reverse

        StringBuffer s5=new StringBuffer("codex box company");
        System.out.println("reverse="+s5.reverse());

        // delete
        StringBuilder s6=new StringBuilder("manginpelli vaasu MCA");
        System.out.println(s6);
        //index
        System.out.println("index of="+s6.indexOf("MCA"));
        //length
        System.out.println("length of="+s6.length());
        System.out.println(s6.delete(18,21));
        // last index
        System.out.println("index of="+s6.lastIndexOf("i"));
        System.out.println(s6.delete(0,12));
        // char at
        System.out.println(s6.charAt(4));
       // replace
        System.out.println(s6.replace(0,5,"codex"));
        // insert
        System.out.println(s6.insert(6,"vaasu"));
        // ensure capacity
       // System.out.println(s6.ensureCapacity());
       StringBuffer sb2=new StringBuffer("I am vasu my brother name vasu i am from karimnagar");
        System.out.println(sb2);
        System.out.println(sb2.length());
        System.out.println(sb2.indexOf("karimnagar"));
        System.out.println(sb2.indexOf("name"));
        System.out.println(sb2.replace(41,51,"Nizambad  "));
        System.out.println(sb2.replace(26,30,"baasu"));






    }
}
