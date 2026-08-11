class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Outer Loop
 for (int i = 0; i < nums.length - 1; i++) {
    // Inner Loop
    for (int j = i + 1; j < nums.length; j++) {

    if (nums[i] == nums [j])
   return true;
 }
    }
    return false;
}
}