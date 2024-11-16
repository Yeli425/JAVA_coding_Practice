package practice;

import java.util.HashMap;
import java.util.Map;

public class countOfOccuranceOfEachCharacterInString {


    public static void main(String[] args) {
        String arr = "hi he lo ha";

        mostFrequentWord(arr);



    }

    public static void mostFrequentWord(String arr) {
        String newS =arr.replaceAll(" ","");
        char [] c = newS.toCharArray();
        HashMap<Character, Integer> freq = new HashMap<>();


        for (int i = 0; i < c.length; i++) {
            if (freq.containsKey(c[(i)])) {
                freq.put(c[(i)], freq.get(c[(i)]) + 1);

            } else {
                freq.put(c[(i)], +1);

            }

        }

        for(Map.Entry entry : freq.entrySet()){

            System.out.println(entry.getKey()+", "+entry.getValue());


        }

    }
}

