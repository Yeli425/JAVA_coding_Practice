package practice;

public class FindNumOFUpperAndLowerCount {

    public static void main(String[] args) {

        String s = "Welcome To AI";

        int upper=0;
        int lower =0;

        for (int i =0; i<s.length(); i++){

            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                upper++;
            }else{
                lower++;
            }
        }

        System.out.println("upper "+ upper);
        System.out.println("lower "+ lower);
    }

}
