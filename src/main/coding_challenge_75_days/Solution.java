package main.coding_challenge_75_days;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            } else {
                // we are keeping the subtracted value along with the index in the map
                map.put(target-nums[i], i);
            }
        }
        return null;
    }
    
    
    
    public static void main(String[] args) {
        int[] sol = new Solution().twoSum(new int[] {2,7,11,5}, 9);
        for (int i : sol) {
            System.out.println(i);
        }
    }
}