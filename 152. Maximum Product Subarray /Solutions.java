public class Solutions {

    public static void main(String[] args) {
        int[] nums1 = { 2, 0 };
        int[] nums2 = { 0, 2 };
        int[] nums3 = { 2, 3, -2, 4 };
        System.out.println(maxProduct(nums3));
    }

    public static int maxProduct(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 0)
            return 0;
        int i, j;
        int max = Integer.MIN_VALUE;
        for (i = 0; i < nums.length; i++) {
            int product = nums[i];
            max = Math.max(product, max);

            for (j = i + 1; j < nums.length; j++) {
                product *= nums[j];
                max = Math.max(product, max);
            }

        }

        return max;
    }

    // do not fully understand this one
    public static int fasterAnswer(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int min = 0;
        int max = 0;
        int totalMax = 0;

        for (int num : nums) {

            int prevMin = min * num;
            int prevMax = max * num;

            min = Math.min(num, Math.min(prevMin, prevMax));
            max = Math.max(num, Math.max(prevMin, prevMax));
            totalMax = Math.max(totalMax, max);
        }

        return totalMax;
    }
}