class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = result.length - 1; i >= 0; i--) {
            int leftVal = nums[left] * nums[left];
            int rightVal = nums[right] * nums[right];
            if (leftVal > rightVal) {
                result[i] = leftVal;
                left++;
            } else {
                result[i] = rightVal;
                right--;
            }
        }
        return result;
    }
}
