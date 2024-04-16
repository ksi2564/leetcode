import java.util.*;

class Solution {
    public int trap(int[] height) {
        int amount = 0;
        int left = 0;
        int right = height.length - 1;
        int lMax = height[left];
        int rMax = height[right];
        
        while (left < right) {
            lMax = Math.max(lMax, height[left]);
            rMax = Math.max(rMax, height[right]);
            
            // Go to the highest place
            if (lMax <= rMax) {
                amount += lMax - height[left];
                left++;
            } else {
                amount += rMax - height[right];
                right--;
            }
        }
        
        return amount;
    }
}