package practice;

import java.util.HashMap;
import java.util.Map;

public class twoSumPractice {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 10, 19};
        findAllPairs(numbers, 9);
    }

    public static void findAllPairs(int[] num, int sum) {

        for(int i=0; i<num.length; i++){

            for(int j=i+1; j<num.length; j++){

                if(num[i]+num[j]==sum ){
                    System.out.println(num[i]+" + "+num[j]+" = "+sum);
                } else if ( num[j]-num[i]==sum) {
                    System.out.println(num[j]+" - "+num[i]+" = "+sum);
                } else if (num[i]-num[j]==sum) {
                    System.out.println(num[i]+" - "+num[j]+" = "+sum);
                }
            }
        }
    }
}
