package com.company.myCompany.basicJava.MapExamples;

import java.util.*;

public class TreeMapExamples1 {
        public static void main(String[] args) {

            int res = findSecondHighestNumber();
            System.out.println(res);
        }

        static int findSecondHighestNumber() {
            TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(Collections.reverseOrder());
            int[] nums = new int[]{8,5,7,1,7};

            for(int i=0; i< nums.length; i++) {
                // 8,5,7,1.7
                map.put(nums[i], i);
            }
            //second highhest
            Set<Map.Entry<Integer, Integer>> set = map.entrySet();
            Iterator<Map.Entry<Integer,Integer>> iter = set.iterator();

            int count = 1; Integer res=0;
            while(iter.hasNext()) {
                Map.Entry me = (Map.Entry) iter.next();
                count++;
                if (count == 2) {
                    res = (Integer) me.getValue();
                }

            }

            return res;

        }


}
