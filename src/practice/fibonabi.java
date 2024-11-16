package practice;

public class fibonabi {

    public static void main(String[] args) {


        fibo(8);
    }


    public static void fibo(int num) {

        int num1 = 0, num2 = 1, count = 0;


        while (count < num) {

            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            count += 1;

        }
    }

}
