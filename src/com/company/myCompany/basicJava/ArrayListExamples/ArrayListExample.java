package com.company.myCompany.basicJava.ArrayListExamples;

import java.util.*;
import java.util.function.Predicate;

class Student implements Comparable<Student>{
    int rollNo;
    String name;
    int mathScore;
    int scienceScore;
    int englishScore;
    int negative;

    public static int rollNumberCounter = 0;

    Student(String name) {
        this.name = name;
        this.rollNo = rollNumberCounter++;
    }
    public void setMarks(int mathScore, int englishScore, int scienceScore) {
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.englishScore = englishScore;
    }
    int total() {
        return mathScore+scienceScore+englishScore;
    }
    void setNegatives(int negative) {
        this.negative = negative;
    }

    int ranking() {
        return (total()*2) - negative;
    }

    @Override
    public int compareTo(Student s2) {
        if(this.ranking() > s2.ranking()) return 1;
        else if (this.ranking() < s2.ranking()) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", mathScore=" + mathScore +
                ", scienceScore=" + scienceScore +
                ", englishScore=" + englishScore +
                ", negative=" + negative +
                '}';
    }
}
public class ArrayListExample {

    public static ArrayList<String> createProgrammingLanguagesArrayList() {
        ArrayList<String> strings =  new ArrayList<>(25);
        String bigString = "Deep Deep Deep Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse eu sem\n" +
                "\n";

        strings.addAll(Arrays.asList(bigString.split(" ")));
        printList(strings);
        return strings;
    }
    public static void printList(ArrayList<String> strings) {
        strings.forEach(string -> {
            System.out.println(string);
        });
    }
public static void printFromBack(ArrayList<String> strings){
       ListIterator<String> listIte = strings.listIterator(strings.size());
       while(listIte.hasPrevious()) {
           String s = listIte.previous();
           if(s.equalsIgnoreCase("Suspendisse")) {
               System.out.println("****************************************************\t \t \t *********************");
           }
           System.out.println();
       }
}
    public static void printStartingWithL(ArrayList<String> strings) {
        Iterator<String> ite = strings.iterator();
        while(ite.hasNext()){
            String s = ite.next();
            if(s.startsWith("L") || s.startsWith("l") ) {
                System.out.println(s);
                System.out.println(" ===== *** ");
            }
        }

    }
    public static ArrayList<String> clearAllStartingWithD(ArrayList<String> strings) {
        strings.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("D");
            }
        });
        return strings;
    }
    public static ArrayList<String> clearAllStartingWithC(ArrayList<String> strings) {
        strings.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("c");
            }
        });
        return strings;
    }

    public static void main(String[] args) {

        ArrayList<String> weekDays = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"));
        weekDays.forEach(day -> {
            System.out.println(day.toString());
        });

        weekDays.removeIf(new Predicate<String>() {
           @Override
           public boolean test(String s) {
                return s.equalsIgnoreCase("Saturday");
           }
        });

        weekDays.forEach(day -> {
            System.out.println(day);
        });

        Student s1 = new Student("Deepti");
        Student s2 = new Student("Katie");
        Student s3 = new Student("Karine");
        Student s4 = new Student("Kartrine");
        Student s5 = new Student("Karina");
        Student s6 = new Student("Karisham");
        Student s7 = new Student("Krisna");
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);

        s1.setMarks(90,60,70);
        s2.setMarks(60,70,80);
        s1.setNegatives(10);
        s2.setNegatives(10);

        s3.setMarks(60,70,80);
        s4.setMarks(60,70,80);
        s3.setNegatives(20);
        s4.setNegatives(20);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());
        System.out.println(s6.toString());
        System.out.println(s7.toString());

        System.out.println("** Ranks **");
        if (s1.compareTo(s2) == 1 ) {
            System.out.println(s1.name+ " ranks better than "+s2.name);
        } else if (s1.compareTo(s2) == -1) {
            System.out.println(s2.name+ " ranks betten than "+s1.name);
        } else {
            System.out.println(s1.name +" ranks same as "+ s2.name);
        }

        System.out.println("** Ranks **");
        if (s3.compareTo(s4) == 1 ) {
            System.out.println(s3.name+ " ranks better than "+s4.name);
        } else if (s3.compareTo(s4) == -1) {
            System.out.println(s4.name+ " ranks betten than "+s3.name);
        } else {
            System.out.println(s3.name +" ranks same as "+ s4.name);
        }

//        System.out.println("*** Removing 3 ***");
//        students.remove(5);
//
//        System.out.println();
//
//        students.forEach(student -> {
//            System.out.println(student.toString()+" \t ");
//        });
//
//        System.out.println("*** Adding student ***");
//        students.add(s6);
//        for (Student student : students) {
//            System.out.println(student.toString()+ " \t ");
//        }


    }
    public static void main1(String[] args) {

     //   ArrayList<String>  clearCStrings = clearAllStartingWithC(createProgrammingLanguagesArrayList());
     //   ArrayList<String>  clearDStrings = clearAllStartingWithD(createProgrammingLanguagesArrayList());
//        printList(clearCStrings);
//        printStartingWithL(clearCStrings);
    //    printFromBack(clearCStrings);
     //   printList(clearDStrings);
   /*     ArrayList<String> tvShows =  new ArrayList<>(25);
        tvShows.add("ozark");
        tvShows.add("sloane");
        tvShows.add("game of thrones");
        tvShows.add("game of thrones1");
        tvShows.add("game of thrones2");
        tvShows.add("game of thrones3");
        tvShows.add("game of thrones4");
        tvShows.add("game of thrones5");

        System.out.println(tvShows.get(3));

        System.out.println("Initial cap "+tvShows.size());
        tvShows.ensureCapacity(50);
        tvShows.trimToSize();
        System.out.println(tvShows.size() + " = size of the list after trim  ");
        System.out.println("Empty = "+tvShows.isEmpty());
        System.out.println("List contains game of thrones "+tvShows.contains("game of thrones"));
        System.out.println(" index of game of thrones "+tvShows.indexOf("game of thrones"));
        //BELOW does not work compile time error
//        String[] strs = (String[]) tvShows.toArray();
//        for (String s: strs) {
//            System.out.println("from simple array = "+ s);
//        }
        Object[] objs = tvShows.toArray();
        for (Object o : objs) {
            System.out.println("From simple arroy of objects = "+o.toString());
        }

        tvShows.set(5,"BReraking bad");

        System.out.println(tvShows.get(5));
        tvShows.remove(4);
        for (String s : tvShows) {
            System.out.println(s);
        }

        //Lambda
        tvShows.forEach(tvshow -> {
            System.out.println(tvshow.toLowerCase().toString());
        });

        tvShows.forEach(tvshow -> {
            System.out.println(tvshow.toUpperCase());} );


        //Iterator
        Iterator<String> tvShowIterator = tvShows.iterator();
        while(tvShowIterator.hasNext()) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow.toString());
        }

        System.out.println("\n=== Iterate using an iterator() and Java 8 forEachRemaining() method ===");
        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow -> {
            System.out.println(tvShow);
        });

        System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
        // Here, we start from the end of the list and traverse backwards.
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while (tvShowListIterator.hasPrevious()) {
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using simple for-each loop ===");
        for(String tvShow: tvShows) {
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using for loop with index ===");
        for(int i = 0; i < tvShows.size(); i++) {
            System.out.println(tvShows.get(i));
        }
        System.out.println();
        Collections.sort(tvShows);
        for (String s :
                tvShows) {
            System.out.println(s);
        }

        Student s1 = new Student("D1");
        Student s2 = new Student("D2");
        Student s3 = new Student("D3");
        Student s4 = new Student("D4");

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        students.forEach(student -> {
            System.out.println(student.name);
        });

    */

        //Create arraylist in single statement
        ArrayList<String> names = new ArrayList<String>( Arrays.asList("alex", "brian", "charles") );

        System.out.println(names);

        ArrayList<String> names1 = new ArrayList<>();

        ArrayList<String> weekDays = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"));
        weekDays.forEach(day -> {
            System.out.println(day.toString());
        });


        Iterator<String> iterator =  weekDays.iterator();
        while(iterator.hasNext()){
            System.out.println("Iterator : "+iterator.next());
        }
        System.out.println();

        ListIterator<String> listIterator = weekDays.listIterator();
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        weekDays.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {

                return s.equalsIgnoreCase("Sunday");
            }
        });
        weekDays.forEach(day -> {
            System.out.println(day);
        });

//1. Add elements one by one
//        names1.add("alex");
//        names1.add("brian");
//        names1.add("charles");
//
//        System.out.println(names1);
//
//        HashMap<String, Integer> details = new HashMap<>();

//        details.put("keanu", 23);
//        details.put("max", 24);
//        details.put("john", 53);

//2. Add elements from other collection
//        names1.addAll(details.keySet());
//
//        System.out.println(names1);


        //ArrayList of ArrayList
        List<List<Integer>> marks = new ArrayList<>();

        marks.add( Arrays.asList(10, 20, 30) );
        marks.add( Arrays.asList(40, 50, 60) );
        marks.add( Arrays.asList(70, 80, 90) );

        for (List<Integer> mark : marks) {
            System.out.println(mark);
        }
    }

}
