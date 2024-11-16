package practice;

import java.util.HashMap;
import java.util.Map;

public class twoSumPractice {

    public static void main(String[] args) {


        int num[] = {2,7,11,15};
        twoSum(num,9);


    }



    public static void twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; ; ++i) {
            int x = nums[i];
            int y = target - x;
            if (m.containsKey(y)) {
                int []s =  new int[]{m.get(y), i};
            }
            m.put(x, i);
        }


    }


}
