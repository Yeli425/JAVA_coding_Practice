package practice;

import java.util.Scanner;

public class findNthElementInArray {


    public static void main(String[] args) {


        int[] arr = {1,2,3,1,2,3};

        Scanner scanner = new Scanner(System.in);

        System.out.println("pls give value:");
        int n = scanner.nextInt();

        if(n<=arr.length){
            int element = arr[n-1];
            System.out.println(element);
        }else{
            System.out.println("please enter position up to "+arr.length);
        }
    }




}
