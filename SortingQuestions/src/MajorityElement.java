public class MajorityElement {
    /*
    Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:

n == nums.length
1 <= n <= 5 * 104
-231 <= nums[i] <= 231 - 1
     */
    public static void main(String[] args) {
        int[] a = {1,2,1,3,1,1};

        for (int i = 0; i < a.length; i++) {
            int majority = a[i];
            int count = 1;

            if (a[i] == majority) {
                count++;
            } else {
                count = count - 1;
                if (count == 0) {
                    majority = a[i];
                    count = 1;
                }
            }
            System.out.println(majority);
        }
    }
}


