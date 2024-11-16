package practice;

public class PracticeSheet {

    public static void main(String[] args) {


        int[] ints = {-9,1,2,3};


        System.out.println( exists(ints, -9));


    }

    public static boolean exists(int[] ints, int k){

        for(int i=0; i<ints.length; i++){


            if(ints[i]==k){

                return true;
            }
        }

        return false;
    }
    }




































