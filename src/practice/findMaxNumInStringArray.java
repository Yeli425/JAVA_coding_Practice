package practice;

import org.w3c.dom.ls.LSOutput;

public class findMaxNumInStringArray {

    public static void main(String[] args) {


        String[] s = {"12","5","3"};

        int max = Integer.MIN_VALUE;

        for(String each : s){

           int num = Integer.parseInt(each);

           if(max<num){

               max=num;
           }
        }
        System.out.println(max);


    }

}
