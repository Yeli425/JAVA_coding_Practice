package practice;

public class PalidromeNum {

    public static void main(String[] args) {




        int num =12321;
        int reverseNum=0;
        int reminder;


        int orginalNum = num;

        while(num!=0){
        reminder=num % 10;
        reverseNum= reverseNum * 10 + reminder;
        num/=10;


        }


        if(orginalNum==reverseNum){
            System.out.println("yes it is palidrome");
        }else{

            System.out.println("no it is not Palidrome");
        }


    }

}
