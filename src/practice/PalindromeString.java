package practice;

public class PalindromeString {


    public static void main(String[] args) {

        System.out.println(isPalindrome("12321"));

    }




    public static boolean isPalindrome(String str){

        String check = "";

        for (int i= str.length()-1; i>=0; i--){

            check+=str.charAt(i);
        }

        if(check.equalsIgnoreCase(str)){

            return true;
        }else{
            return false;
        }


    }
}
