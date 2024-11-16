package practice;

public class subsetOfThreeDigit {


    public static void main(String[] args) {

        int arr[]= {-1,0,1,-1,2,3,-3};

        int sum =0;

        for (int i=0; i<arr.length; i++){


            for (int j=i+1; j<arr.length; j++){

                for (int k=j; k<arr.length; k++){

                    if(arr[i]+arr[j]+arr[k]==sum){



                        System.out.println(arr[i] +", "+ arr[j] +", "+ arr[k]);
                    }
                }
            }
        }
    }
}
