package com.company.myCompany.InterviewCamp;

public class ReverseTraversal {
    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,5,6,8,0,0,0};
//        int[] res = replaceEvenWithTwoSameNumber(nums);
//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i]+" ");
//        }
        String s = "i live in a house";
        String result = reverseWordsInSentence(s);
        System.out.println(result);

        s = "";
         result = reverseWordsInSentence(s);
        System.out.println(result);

        s = " ";
        result = reverseWordsInSentence(s);
        System.out.println(result);

        s = " i live in a house ";
         result = reverseWordsInSentence(s);
        System.out.println(result);

        s = " i  ";
        result = reverseWordsInSentence(s);
        System.out.println(result);

        s = " i live ";
        result = reverseWordsInSentence(s);
        System.out.println(result);

        s = "       ";
        result = reverseWordsInSentence(s);
        System.out.println(result);


        s = " df sdfnfd skfsd skfsfsdfsdkfsdf sd   sdfsd fsd fsd fd fsd f df df d fd fd fd  f df df erer e r er er er ewrwr werwe rw er wer ";
        result = reverseWordsInSentence(s);
        System.out.println(result);

        s = "1";
        result = reverseWordsInSentence(s);
        System.out.println(result);

        s = "ab";
        result = reverseWordsInSentence(s);
        System.out.println(result);
    }
    /*
    Given an array of numbers, replace each even number with two of the same number. 
    e.g, [1,2,5,6,8] -> [1,2,2,5,6,6,8,8]. Assume that the array has enough space to accommodate the result.
    int[] arr = new int[] {1,2,5,6,8,0,0,0};
    int[] arr = new int[10] {1,2,5,6,8};
     */
    static int[] replaceEvenWithTwoSameNumber(int[] nums) {
        // {1,2,5,6,8,0,0,0}
        // [1,2,2,5,6,6,8,8]

        //if the array is null or it has no integers in it then send it back as is.
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int right = nums.length-1;
        for (int i = nums.length-1; i >= 0 ; i--) {
            if (nums[i] != 0) {
                nums[right--] = nums[i];
                if((nums[i] % 2) == 0) {
                    nums[right--] = nums[i];
                }
            }
        }
        return nums;
    }
    /*
    Given a sentence, reverse the words of the sentence.
    For example, "i live in a house" becomes "house a in live i".
     */
    static String reverseWordsInSentence(String str) {
        if (str == null || str.length()==0 ) return str;

       String[] words =  str.split(" ");
       StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i >=0 ; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
