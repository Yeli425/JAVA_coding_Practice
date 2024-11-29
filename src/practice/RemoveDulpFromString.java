package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDulpFromString {

    public static void main(String[] args) {

        String s="aabbcc";

        Set<Character> unique =  new HashSet<>();
        char[] charArray = s.toCharArray();

        StringBuilder strNoDup = new StringBuilder();

        for(int i=0; i<charArray.length; i++){

            unique.add(charArray[i]);
        }

        for(Character ch : unique){

            strNoDup.append(ch);
        }
        System.out.println(strNoDup);


    }


}
