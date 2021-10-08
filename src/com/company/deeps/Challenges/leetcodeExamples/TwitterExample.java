package com.company.deeps.Challenges.leetcodeExamples;

public class TwitterExample {

        static String compressString(String str) {
            if (str == null || str.isEmpty()) {
                return str;
            }

            StringBuffer res = new StringBuffer();
            int i = 0;
            while(i < str.length()) {
                int count = 1;
                char c = str.charAt(i);

                int j = i + 1;
                while(j < str.length() && c == str.charAt(j)) {
                    count++;
                    j++;
                }
                i = j;

                res.append(c);
                if (count != 1) res.append(count);
            }

            return res.toString();
        }

        public static void main(String[] args) {
            // Scanner in = new Scanner(System.in);
            // int a;
            // a = in.nextInt();
            // int b;
            // b = in.nextInt();
            // int sum;

            // sum = addNumbers(a, b);
            String str = "AA";
            String res = compressString(str);
            System.out.println(res); //a3a3a3a3b0c0c0c0a3a3

            //aaaabcccaa

            str = "aaaabcccaaAABBCCC";
            res = compressString(str);
            System.out.println(res); //a3a3a3a3b0c0c0c0a3a3


            str = "";
            res = compressString(str);
            System.out.println(res); //a3a3a3a3b0c0c0c0a3a3

            str = null;
            res = compressString(str);
            System.out.println(res); //a3a3a3a3b0c0c0c0a3a3



            str = "a";
            res = compressString(str);
            System.out.println(res); //a3a3a3a3b0c0c0c0a3a3
        }


}
