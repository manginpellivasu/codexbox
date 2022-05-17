package Strings;

import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[]args){
        StringTokenizer tokenizer=new StringTokenizer ("hello  world program in java","  ");
        System.out.println( "tokenizer"+tokenizer);
        while(tokenizer.hasMoreTokens())
        {
            String token=tokenizer.nextToken();
            if(token.equalsIgnoreCase("program")){
                continue;
            }
            System.out.println(token+" ");

        }
    }
}
