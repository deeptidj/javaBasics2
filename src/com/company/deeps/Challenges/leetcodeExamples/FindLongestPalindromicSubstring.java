package com.company.deeps.Challenges.leetcodeExamples;

public class FindLongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println("Finding longest palindromic substring");
        /*
        Method 2: Dynamic Programming.
        Approach: The time complexity can be reduced by storing results of sub-problems. The idea is similar to this post.

        Maintain a boolean table[n][n] that is filled in bottom up manner.
        The value of table[i][j] is true, if the substring is palindrome, otherwise false.
        To calculate table[i][j], check the value of table[i+1][j-1], if the value is true and str[i] is same as str[j], then we make table[i][j] true.
        Otherwise, the value of table[i][j] is made false.
        We have to fill table previously for substring of length = 1 and length =2 because
        as we are finding , if table[i+1][j-1] is true or false , so in case of
        (i) length == 1 , lets say i=2 , j=2 and i+1,j-1 doesn’t lies between [i , j]
        (ii) length == 2 ,lets say i=2 , j=3 and i+1,j-1 again doesn’t lies between [i , j].
        */
        String s = "aaaabbcc";
        int n= printLongestPalindromicSubString(s);
        System.out.println("Longest palindromic string length = "+n);

    }

    static int printLongestPalindromicSubString(String s) {
        int result = -1;
        //length of the given string
        int n = s.length();

        //Table[i][j] will be false if substring[i,j] is not palindrome.
        //Table[i][j] will be true if substring[i,j] is palindrome.
        boolean table[][] = new boolean[n][n];

        //all substrings of length 1 are palindromes.
        int maxLength = 1;
        for (int i = 0; i < n; i++) {
            table[i][i] = true;
            result = 0;
        }
        
        //all substrings of length 2 
        maxLength = 2;
        for (int i = 0; i < n-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                table[i][i+1] = true;
                result = i;
            }
        }

        //Find the substring of length 3
        for (int len = 3; len < n; len++) {
            //Fix the starting index
            for (int startIndex = 0; startIndex < n - len; startIndex++) {
                //get the substring of length len => 3
                int endIndex = startIndex+len-1;

                //check if boundary character are same ==> "abbc" ==> "abb"
                if(s.charAt(startIndex) == s.charAt(endIndex) && table[startIndex+1][endIndex-1]) {
                    table[startIndex][endIndex] = true;
                    if (len > maxLength) {
                        result = startIndex;
                        maxLength = len;
                    }
                }
            }
        }
        System.out.println("Longest palindrome "+s.substring(result, result+maxLength));

        return maxLength;
    }


}
