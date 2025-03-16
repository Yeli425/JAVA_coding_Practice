package practice;

import java.util.Arrays;

public class SortArrayWithoutSortMethod {

    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2,0};

        // Selection Sort
        for (int i = 0; i < arr.length; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
//        // Printing the sorted array
        System.out.println(Arrays.toString(arr));
        // Output: 1 2 3 5 8


        //approch 2
//        public static void sort(int[] num){
//
//            for(int i=0; i<num.length; i++){
//
//                for(int j=i+1; j<num.length; j++){
//                    if(num[j]<num[i]){
//                        int temp = num[i];
//                        num[i]=num[j];
//                        num[j]=temp;
//                    }
//                }
//            }
//
//            System.out.println(Arrays.toString(num));
//        }
    }
}

