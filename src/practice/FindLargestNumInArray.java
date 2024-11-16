package practice;

public class FindLargestNumInArray {

    public static void main(String[] args) {


        int [] num = {9,1,2,3};

        System.out.println(biggest(num));

    }


    public static int biggest(int[] num){

        int biggest =num[0];

        for (int i =0; i<num.length; i++){

            if(biggest< num[i]){
                biggest=num[i];
            }

        }

        return biggest;




    }
}
