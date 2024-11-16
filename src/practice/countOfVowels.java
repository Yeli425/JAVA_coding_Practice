package practice;

import java.util.Arrays;
import java.util.List;

public class countOfVowels {


    public static void main(String[] args) {

        count("elzat");

    }

    public static void count(String str){
        int countVolve=0;
        int countConso=0;
        str= str.toLowerCase();

        List<Character> volve = Arrays.asList('a','e','i','o','u');

        for(int i =0; i<str.length(); i++){

            if(volve.contains(str.charAt(i))){
                countVolve++;
            }else{
                countConso++;
            }
        }

        System.out.println("number of vowels is: "+countVolve);
        System.out.println("number of conso is: "+countConso);

    }


    }



