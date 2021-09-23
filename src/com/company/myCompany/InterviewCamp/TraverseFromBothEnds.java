package com.company.myCompany.InterviewCamp;

public class TraverseFromBothEnds {
    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3,4,5,6};
//        int[] res;
//        res = reverseArray(nums);
//        for (int i : res) {
//            System.out.print(i + " ");
//        }

        //1,2,3,4,5
//        int[] nums1 = new int[]{1,2,3,4,5};
//        int[] res1;
//        res1 = twoSum(nums1, 9);
//        for (int i : res1) {
//            System.out.print(i + " ");
//        }

//        int[] nums = new int[]{-4,1,2,3,4,5};
//        int[] res;
//        res = sortedSquares(nums);
//        for (int i : res) {
//            System.out.print(i + " ");
//        }
        int[] nums = new int[]{0,2,3,1,8,6,9};
        shortestUnsortedSubarray(nums);
    }
    /*
    Reverse the order of elements in an array. For example, A = [1,2,3,4,5,6], Output = [6,5,4,3,2,1]
     */
    static int[] reverseArray(int[] nums) {
        int left = 0; int right = nums.length-1;
        int temp ;
        while(left < right) {
            temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
        return nums;

    }
    /*
    Two Sum Problem - Find 2 numbers in a sorted array that sum to X.
    For example, if A = [1,2,3,4,5] and X = 9, the numbers are 4 and 5.
     */
    static int[] twoSum(int[] nums, int targetSum) {
        int left =0; int right = nums.length-1;
        int[] res = new int[]{-1,-1};
        while (left < right){
            if ((nums[left] + nums[right]) == targetSum) {
                res[0] = nums[left];
                res[1] = nums[right];
                return res;
            } else if ((nums[left] + nums[right]) < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }

    /*
    Given a sorted array in ascending order,
    return an array of squares of each number, also in ascending order.
    For example:[-4,-2,-1,0,3,5] -> [0,1,4,9,16,25]
    How can you do it in O(n) time?
     */
    static int[] sortedSquares(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        int[] res = new int[nums.length];
        int k = nums.length-1;
        int left = 0; int right = nums.length-1;
        while(left < right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[k] = nums[left] * nums[left];
                left++;
            } else {
                res[k] = nums[right] * nums[right];
                right--;
            }
            k--;
        }
        return res;
    }

    /*
    Given an array of integers, find the continuous subarray, which when sorted,
    results in the entire array being sorted. For example: A = [0,2,3,1,8,6,9], result is the subarray [2,3,1,8,6]
     */
    static void shortestUnsortedSubarray(int[] nums) {
        int left = 0 ; int right = nums.length-1;

        //find dip
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1] < nums[i]) {
                left = i;
                break;
            }
        }
        //find bump
        for (int i = nums.length-1; i > 0 ; i--) {
            if(nums[i] < nums[i-1]) {
                right = i;
                break;
            }
        }
        System.out.println("Left = "+left);
        System.out.println("Right = "+right);
        //3,1,8,6
        int min = nums[left];int max = nums[right];
        for (int i = left; i <= right ; i++) {
            min = Math.min(min,nums[i]);
            max = Math.max(max, nums[i]);
        }

        //[0,2,3,1,8,6,9]
        //     3,1,8,6
        //expanding the sub array.
        for (int i = 0; i <= left; i++) {
            if(nums[i] > min) {
                left = i;
            }
        }
        for (int i = nums.length-1; i <= right  ; i--) {
            if(nums[i] < max) {
                right = i;
            }
        }

        System.out.println("Left = "+left);
        System.out.println("Right = "+right);

    }
}
