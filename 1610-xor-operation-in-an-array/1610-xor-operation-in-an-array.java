class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int r = nums[0];
        for(int i = 0;i < n; i++){
            r^=start + 2 *i;
        }
        return r;
    }
}