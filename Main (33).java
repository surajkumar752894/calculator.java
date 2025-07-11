public class Main {
    public static int longestOnesAfterFlip(int[] nums) {
        int left = 0;
        int maxLength = 0;
        int zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1};
        System.out.println("Longest subarray of 1s after one flip: " + longestOnesAfterFlip(arr));
    }
}
