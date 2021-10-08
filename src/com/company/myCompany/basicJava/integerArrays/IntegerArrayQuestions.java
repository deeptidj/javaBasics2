package com.company.myCompany.basicJava.integerArrays;

import java.sql.SQLOutput;
import java.util.*;

public class IntegerArrayQuestions {
    public static void main(String[] args) {

     //   System.out.println(sort012(new int[]{0,0,1,3,2,2}));
//        System.out.println("Find the missing number");
//        int[] arr = new int[]{1,2,3,4,6,7,8,9};
//        System.out.println("Missing no = "+findMissingNumber(arr));

        //int peak = findPeakBinarySearch(new int[]{1,0,1,3,4,2});
        // peak = findPeakBinarySearch(new int[]{1,2,3,1});
        //System.out.println("Peak element = "+peak);

//        System.out.println(" Kth smallest = "+kthSmallest(new int[]{1,5,3,4,2}, 3));
//        System.out.println(reverseString("zyx"));
//        System.out.println(" Find frequency "+findFrequency(new int[]{5,5,6,7,8,5}, 5));
//
        //System.out.println(kMostFrequentElements("deepti is a goof girl deepti jain deepti"));
      //  int[] arr = {0,1,2,3,4,5};; //= new int[]{1, -1, 3, 2, -7, -5, 11, 6};

//        System.out.println(segregateElements(arr));
//        System.out.println(shiftIntegers(arr, arr.length));

      //  rotate(arr);

      //  System.out.println(getPairsCount(arr, 5));


//        List<Integer> res = findDups(new int[] {1,2,3,3,4,5,5,6,7,8,8});
//        for (Integer i : res) {
//            System.out.print(i+" ");
//        }
//        System.out.println(" smallest index of repeating number "
//                +findSmallestIndexOfRepeatingNum(new int[]{1, 5, 3, 4, 3, 5, 6}));

        shiftingLetters();
    }

    /*
    n1 = 6; A = {1, 5, 10, 20, 40, 80}
    n2 = 5; B = {6, 7, 20, 80, 100}
    n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
     */
    static int[] findCommonElements(int[] a, int[] b, int[] c){
        int aLen = a.length;
        int bLen = b.length;
        int cLen = c.length;

        int i=0;
       while (i < aLen ){

       }
       return new int[0];
    }
    //{1, 5, 3, 4, 3, 5, 6}
    //Given an array arr[] of size n, find the first repeating element.
    //The element should occurs more than once and the index of its first occurrence should be the smallest.
    static int findSmallestIndexOfRepeatingNum(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i]))
            {
                return hm.get(arr[i]);
            } else {
                hm.put(arr[i], i);
            }
        }
        return -1;
    }
        /*
    You are given a string s of lowercase English letters and an integer array shifts of the same length.

    Call the shift() of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a').

    For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
    Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times.

    Return the final string after all such shifts to s are applied.
    https://leetcode.com/explore/challenge/card/september-leetcoding-challenge-2021/637/week-2-september-8th-september-14th/3968/

     */
    static void shiftingLetters() {
        String s = "xyz";
        int[] shifts = new int[]{3,5,9};
        int[] tot_shift = new int[shifts.length];int sum =0;
        for (int i = shifts.length-1; i >= 0 ; i--) {
            sum += shifts[i];
            tot_shift[i] = sum;
        }
        for (int i = 0; i < tot_shift.length; i++) {
            System.out.print(tot_shift[i]+ " ");
        }
        System.out.println();

        String  c; int n;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shifts.length; i++) {
            sb.append(shiftBy(s.charAt(i),tot_shift[i]));
        }
        System.out.println(sb.toString());

    }
    //shift character c by n;
    //z + 5 => e - 122 + 5 => 127 - 102 = 25
    //97 + 5 => 102 =>
    static char shiftBy(char c,int n) {
        //97 a //122 z
        int i = (int) c;
        i = i + n;
        if (i >=122) i = i - 26;
        c = (char) i;
        return c;
    }
    private static int findMissingNumber(int[] arr) {
        int n = arr.length;
        if (n==0) return -1;
        int sum = (n*(n+1))/2;
        int arrSum=0;
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
        }
        return sum-arrSum;
    }
    //Given an array of N integers, and an integer K,
    // find the number of pairs of elements in the array whose sum is equal to K.
    static int getPairsCount(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            int rem = k - i;
            if(hm.get(rem) == null) hm.put(i, hm.getOrDefault(rem,0)+1);
            else {
                count++;
                hm.put(rem, hm.getOrDefault(rem,0)-1);
            }
        }
        return count;
    }
    private static int findPeakElement(int[] arr) {
        if(arr.length <= 2) return -1;
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i] > arr[i-1] && arr[i]>arr[i+1]) return i;
        }
        return -1;
    }

    private static int findPeakBinarySearch(int[] nums) {
        return search(nums,0, nums.length-1);
    }
    static int kthSmallest(int[] nums, int k) {
        if(!(k <=nums.length)) return -1;

        Arrays.sort(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
        return nums[k];
    }
    private static int search(int[] nums, int left, int right) {
        while(left < right) {
            // 1,2,3,1
            int mid = (left + right)/2;
            if (nums[mid] > nums[mid+1]) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }

    static String reverseString(String str){
        char[] charArr = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = charArr.length-1; i>=0; i--) {
            sb.append(charArr[i]);
        }
        return sb.toString();
    }

    static int findFrequency(int[] nums, int n) {
        if(nums.length == 0 ) return -1;
        int count = 0;
        for (int i : nums) {
            if(i == n) count++;
        }
        return count;
    }

    /*
    Given a non-empty list of words, return the k most frequent elements.
Your answer should be sorted by frequency from highest to lowest.
If two words have the same frequency, then the word with the lower alphabetical order comes first.

     */

    static String kMostFrequentElements(String sentence){
        String[] words = sentence.split(" ");
        HashMap<String, Integer> hm = new HashMap<>();
        for (String word : words) {
            hm.put(word, hm.getOrDefault(word,0)+1);
        }
        System.out.println(hm);
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Integer>> ite = entries.iterator();
        int max = 0;String key = null;
        while(ite.hasNext()){
            Map.Entry<String, Integer> e = ite.next();
            max = Math.max(max,e.getValue());
            key = e.getKey();
        }

        return key;
    }

    static boolean sort012(int[] nums) {
        Arrays.sort(nums);
        for (int k : nums) {
            System.out.print(k+" ");
        }
        return false;
    }

    static int[] subArraySum(){

        return new int[0];
    }
    //Move all negative elements to end
    //{1, -1, 3, 2, -7, -5, 11, 6 }
    //{1,3,2,11,6}
    //{-1,-7,-5}

    static boolean segregateElements(int[] nums){
        int posIndex = 0; int negIndex = 0; int[] negArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= 0) nums[posIndex++] = nums[i];
            else negArr[negIndex++] = nums[i];
        }
        //
        for (int i = 0; i < negIndex; i++) {
            nums[posIndex++] = negArr[i];
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }
        return false;
    }
    static boolean shiftIntegers(int[] arr, int n) {
        int j = 0, temp;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] > 0)
            {
                if (i != j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        return false;
    }

    static int[] findSubArrayAddsToTargetSum(){
        int l = 0;
        return new int[1];
    }
    static void rotate(int[] arr) {
        int i = 0, j =1; int temp=-1;
        //{1, -1, 3, 2, -7, -5, 11, 6}
//        while(j < arr.length-1) {
//            temp = arr[j];//temp = -1
//            arr[j] = arr[i];
//
//            i++;j++;
//        }
        //{1, -1, 3, 2, -7, -5, 11, 6}
        //-1, 3, 2, -7, -5, 11, 6, 1
        //int t = arr[arr.length-1];
       // for (int k = arr.length-1; k > 0 ; k--) { // 6
       //     arr[k] = arr[k-1]; // {1, -1, 3, 2, -7, -5, 11, 11}
      //  }
       // arr[0] = t;

        int t = arr[0];
        for (int k = 0; k < arr.length-1 ; k++) { // 6
            arr[k] = arr[k+1]; // {1, -1, 3, 2, -7, -5, 11, 11}
        }
        arr[arr.length-1] = t;
        Arrays.stream(arr).mapToObj(item -> item + " ").forEach(System.out::print);
    }

    //logon ne kaha ki khush raha karo
    //khub dhong kiya khush rehne ka
    //
//dohree zindagee jite aa rahe hain hum
//apne aap ko hi nahi pehchaan paa rahein hain hum
//
    static List<Integer> findDups(int[] arr) {
        //int[] result = new int[20];
        List<Integer> result = new ArrayList<>();
        int k=0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            if(!hs.add(i)) result.add(i);
        }
        return result;
    }
}
