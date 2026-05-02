class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;  // last index

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;  // target found
            } else if (nums[mid] < target) {
                low = mid + 1;  // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        return -1; // target not found
    }
}
