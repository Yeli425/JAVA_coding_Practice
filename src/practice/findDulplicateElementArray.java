package practice;

import java.util.HashSet;
import java.util.Set;

public class findDulplicateElementArray {


    public static void main(String[] args) {

            dep(new int[]{1,2,3,1,2,3});




    }



    public static void dep ( int[] arr){

        Set<Integer> set = new HashSet<>();



        for(int i=0 ; i<arr.length; i++){

            for (int j = i+1; j<arr.length; j++){

                if(arr[i]==arr[j]){
                    set.add(arr[i]);
                }
            }
        }

        System.out.println("Dupelicated elements are: "+set);
    }
}
