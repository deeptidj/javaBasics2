package com.company.myCompany.basicJava.ArrayListExamples;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayExamples {
    public static void main1(String[] args) {
        final int MAX_ARRAY_LENGTH = Integer.MAX_VALUE;
        //int[] arr = new int[MAX_ARRAY_LENGTH-2000000000];
        int[] newArr = new int[100000];
        System.out.println(newArr.length);
        int[] newArr1 = {10, 2, 30, 4, 5};
        System.out.println(newArr1.length);

        //Below does not work not sure whats wrong
//        Integer[] arrBigInteger = {2,,1,3,6,5,8};
//        Collections.sort(arrBigInteger , Collections.reverseOrder());

        //System.out.println(" Array value afeter %s", Arrays.toString(arrBigInteger));

        // Printing the array after sorting
//        System.out.println("Modified arr[] : %s",
//                Arrays.toString(newArr1));
        int[] arr = new int[10];
        int count = 20;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count++;
        }
        arr[1] = 67;
        arr[3] = 75;
        printArr(arr);

        System.out.println("Sorted ? ");
        Arrays.sort(newArr1);
        for (int i : newArr1) {
            System.out.print(i + " ");
        }
        System.out.println();


//        int[] newArr3 =  sortArrayAscendingOrder(arr);
//        printArr(newArr3);
        int[] newArr4 = sortArray(arr);
        printArr(newArr4);

        int[] intArray = new int[]{1, 1, 2, 2};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Array value = " + intArray[i]);
        }

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);

        for (Integer integer : arrList) {
            System.out.println(integer);
        }

        arrList.forEach(integer1 -> {
            System.out.println(integer1);
        });

    }

    public static void main(String[] args) {
        //arrayListExmples();
        arrayListSynchronization();
    }

    public static int[] sortArray(int[] copyArray) {
        Arrays.sort(copyArray);
        return copyArray;
    }

    //    public static Object[] sortArrayDesc(int[] copyArray) {
//        List l = Arrays.asList(copyArray);
//        return l.toArray();
//
////        Arrays.sort(copyArray);
////        return copyArray;
//    }
//    public static int[] sortArrayAscendingOrder(int[] copyArray) {
////        List l =  Arrays.asList(copyArray);
////        int[] arrDesc = new int[copyArray.length];
////        Collections.sort(l, Collections.reverseOrder());
////        int count=0;
////        for (Object o : l) {
////            arrDesc[count++] = i;
////        }
////        return arrDesc;
//    }
    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();


    }

    static void arrayListSynchronization() {
        List<Integer> synList = Collections.synchronizedList(new ArrayList<>(Arrays.asList(9, 8, 8, 1, 4, 5, 6, 7)));
        synchronized (synList) {
            Iterator<Integer> iterator = synList.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
        }

        CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();
        //Adding elements to synchronized ArrayList
        al.add("Pen");
        al.add("NoteBook");
        al.add("Ink");

        System.out.println("Displaying synchronized ArrayList Elements:");
        //Synchronized block is not required in this method
        Iterator<String> iterator = al.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
    static void arrayListExmples() {
        List<Integer> integers = new ArrayList<>(Arrays.asList(9,8,7,1,2,3,4,5));

        integers.forEach(i -> { System.out.print(" Before sorting: "+i+" ");});
        Collections.sort(integers, Collections.reverseOrder());
        integers.forEach(i -> { System.out.print(" After sorting: "+i+" ");});
        //Arrays.sort(integers); //Errors out

        System.out.println("Size : "+integers.size());

        integers.add(2,500);

        integers.forEach(i -> { System.out.print(" After adding 500 at 2 : "+i+" ");});

        List<String> strings = new ArrayList<>(Arrays.asList("Deepti","Deepansh","Deepisha"));

        strings.forEach(name -> {
            System.out.println(name);
        });

        Student s1 = new Student("Dep");
        Student s2 = new Student("ansh");
        Student s3 = new Student("isha");
        List<Student> students = new ArrayList<>(Arrays.asList(s1,s2,s3));

        students.forEach(student -> {
            System.out.println(student.name);
        });


    }
}
