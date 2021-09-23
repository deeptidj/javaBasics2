package com.company.deeps.Challenges.leetcodeExamples;

public class WhatDoesThisDo {

        private String name;
        public static void main(String args[]) {
            WhatDoesThisDo m1 = new WhatDoesThisDo();
            WhatDoesThisDo m2 = new WhatDoesThisDo();
            m1.name = m2.name = "m1";
            callMe( m1, m2 );
            System.out.println( m1 + " & " + m2 );
            System.out.println(m1.name);
            System.out.println(m2.name);
        }
        private static void callMe( WhatDoesThisDo... m ) {
            m[0] = m[1];
            m[1].name = "new name";
        }
}
