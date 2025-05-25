package practice;

public class subsetOfThreeDigit {


    public static void main(String[] args) {


        int[] n = {1, 0, 9, 10, 8, 2, 7};
        int target = 9;


        findThreeDigit(n, target);
    }


    public static void findThreeDigit(int[] n, int target) {


        for (int i = 0; i < n.length; i++) {


            for (int j = i + 1; j < n.length; j++) {


                for (int k = j; k < n.length; k++) {

                    if (n[i] + n[j] + n[k] == target) {
                        System.out.println(n[i] + " + " + n[j] + " + " + n[k] + " == " + target);
                    } else if (n[j] - n[i] + n[k] == target) {
                        System.out.println(n[j] + " - " + n[i] + " + " + n[k] + " == " + target);
                    } else if (n[k] - n[j] + n[i] == target) {
                        System.out.println(n[k] + " - " + n[j] + " + " + n[i] + " == " + target);
                    } else if (n[k] - n[i] + n[j] == target) {
                        System.out.println(n[k] + " - " + n[i] + " + " + n[j] + " == " + target);
                    } else if (n[k] - n[i] - n[j] == target) {
                        System.out.println(n[k] + " - " + n[i] + " + " + n[j] + " == " + target);
                    } else if (n[i] - n[j] - n[k] == target) {
                        System.out.println(n[i] + " - " + n[j] + " - " + n[k] + " == " + target);
                    } else if (n[j] - n[i] - n[k] == target) {
                        System.out.println(n[j] + " - " + n[i] + " - " + n[k] + " == " + target);

                    }
                }
            }
        }
    }
}