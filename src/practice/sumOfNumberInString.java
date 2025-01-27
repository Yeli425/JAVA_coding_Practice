package practice;

public class sumOfNumberInString {

        public static void main(String[] args) {
            String str = "abc123def45gh67";
            int sum = 0;
            String temp = "";

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (Character.isDigit(ch)) {
                    temp += ch;
                } else {
                    if (!temp.isEmpty()) {
                        sum += Integer.parseInt(temp);
                        temp = "";
                    }
                }
            }

            // Add the last number if the string ends with a digit
            if (!temp.isEmpty()) {
                sum += Integer.parseInt(temp);
            }

            System.out.println("Sum of numbers in the string: " + sum);
        }
    }

