package practice;

import java.util.Arrays;

public class addTwoArray {


    public static void main(String[] args) {

        int[] arr1 = {3,1};
        int[] arr2={2,5};

        AddTwoArrays(arr1, arr2);


    }



    public static void AddTwoArrays(int[] arr1, int[] arr2){



        int count=0;
        int[] newArr = new int[arr1.length+arr2.length];

        for (int i=0; i<arr1.length; i++){
             newArr[i]+=arr1[i];
             count++;

        }


        for (int i=0; i<arr2.length; i++){
            newArr[count]+=arr2[i];
            count++;

        }

        System.out.println(Arrays.toString(newArr));

    }


}
