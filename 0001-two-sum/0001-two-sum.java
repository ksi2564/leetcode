import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[][] idxNums = new int[nums.length][2];
        
        for (int i = 0; i < nums.length; i++) {
            idxNums[i][0] = i;
            idxNums[i][1] = nums[i];
        }
        
        Arrays.sort(idxNums, (o1, o2) -> o1[1] - o2[1]);
        
        while(true) {
            if (idxNums[left][1] + idxNums[right][1] < target) {
                left++;
            } else if(idxNums[left][1] + idxNums[right][1] > target) {
                right--;
            } else {
                break;
            }
        }
        
        return new int[] {idxNums[left][0], idxNums[right][0]};
    }
}