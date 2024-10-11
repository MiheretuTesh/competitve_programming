package Array;

class Solution {
    static int[] twoSum(int[] nums, int target) {

        int arr[] = { 0, 0 };

        int size = nums.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if ((nums[i] + nums[j]) == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                } else {
                    continue;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;

        int[] value = twoSum(nums, target);

        for (int i = 0; i < 2; i++) {
            System.out.println(value[i]);
        }
    }
}
