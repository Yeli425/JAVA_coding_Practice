package practice;

import java.util.HashMap;

public class FindMostFrequencyStringInArray {





    public static void main(String[] args) {

        String arr[] = {"elzat","james", "elzat","james", "james","kobe"};
        int n = arr.length;
        System.out.print(mostFrequentWord(arr, n));



    }

   public static  String mostFrequentWord(String arr[], int n)
    {
        HashMap<String, Integer> freq = new HashMap<>();
        int max = 0;
        String result = "";




        for (int i = 0; i < n; i++) {
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);

            } else
                freq.put(arr[i], +1);

            if (max <= freq.get(arr[i])) {
                    max = freq.get(arr[i]);
                    result = arr[i];

            }
        }

        return result;
    }


}
