package com.company.deeps.Challenges.leetcodeExamples;
import java.util.*;
public class ModuleNamesSorting {
    public static void main(String[] args) {
        List<String> modules = Arrays.asList(new String[] {"header-01", "app-2", "side-bar-08", "app-12", "header-06"});
        List<String> sortedModules = sortModules(modules);
        System.out.println(sortedModules);
    }
    // Module name format: <module-prefix>-<module-number>
// Sort module names, so we see module prefix and numbers in order
// Example Input: "header-01", "app-2", "side-bar-08", "app-12", "header-06"
// Expected Output: "app-2", "app-12", "header-01", "header-06", "side-bar-08"
    public static List<String> sortModules(List<String> input) {
        //use comparator - implement compareTo method .
        TreeMap<String, TreeSet<Integer>> map = new TreeMap<>();
        for (String s :
                input) {
            int divider = s.lastIndexOf("-");
            String s1 = s.substring(0,divider);
            System.out.println(s.substring(0,divider));
            System.out.println(s.substring(divider+1));
            System.out.println();
            Integer k = Integer.parseInt(s.substring(divider+1));
            TreeSet<Integer> l = map.get(s1);
            if (l != null) {
                l.add(k);
            }
            else {
                l = new TreeSet<>();
                l.add(k);
            }
            map.put(s1,l);

        }
        System.out.println(map);
        List<String> sorted = new ArrayList<>();
        System.out.println();

        for (Map.Entry<String, TreeSet<Integer>> entry : map.entrySet()) {
            String s = entry.getKey();
            TreeSet<Integer> intsSet = entry.getValue();
            Iterator iter = intsSet.iterator();
            while(iter.hasNext()) {
                String prefix = iter.next().toString();
                String str = s + "-"+ prefix;
               sorted.add(str);
            }

        }


        return sorted;
    }
}



