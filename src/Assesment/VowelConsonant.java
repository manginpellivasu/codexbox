package Assesment;

import javax.swing.*;

public class VowelConsonant {
    public static void main(String[] args) {
       /* char ch='z';
        if(ch=='a' || ch=='e'  || ch=='i'  ||  ch=='o'  ||  ch=='u')
            System.out.println("given char vowel="+ch);
            else
            System.out.println("given char consonant="+ch);

            }

        */




        char ch1 = 'a', ch2 = 'e', ch3 = 'i', ch4 = 'o', ch5 = 'u';


        switch('A'){
            case 'a':
                System.out.println('a'+" is vowel");
                break;
            case 'e':
                System.out.println('e'+" is vowel");
                break;
            case 'i':
                System.out.println('i'+" is vowel");
                break;
            case 'o':
                System.out.println('o'+" is vowel");
                break;
            case 'u':
                System.out.println('u'+" is vowel");
                break;
            default:
                System.out.println("given char is not vowel");
                break;
        }


    }
}