package com.company.myCompany.basicJava.ArrayListExamples;

import java.util.*;

public class ArrayListIteratorRemoveExample {
    public static void main(String[] args) {
        List<Integer> numbers =  new ArrayList<Integer>();
        numbers.add(53);
        numbers.add(153);
        numbers.add(532);
        numbers.add(2);
        numbers.add(13);
        numbers.add(23);
        numbers.add(33);
        numbers.add(43);
        numbers.add(10);

       //List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        Iterator<Integer> ite = numbers.iterator();
        while (ite.hasNext()) {
            Integer num = ite.next();
            if(num % 2 == 0) {
                ite.remove();
            }
        }
        System.out.println(numbers);
//        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8);
//        Iterator<Integer> itr = l.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//            if (itr.next() % 2 == 0) l.remove(itr.next());
//        }


        System.out.println("Before soprting"+ numbers);
        Collections.sort(numbers);

//        for (int i = 0; i < numbers.size(); i++) {
//            Integer k = numbers.get(i);
//            if(k %2 == 0) {
//                numbers.remove(i);
//            }
//        }

        System.out.println("After sorting "+numbers);
    }
}
