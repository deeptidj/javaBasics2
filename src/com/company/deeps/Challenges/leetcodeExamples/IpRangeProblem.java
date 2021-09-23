package com.company.deeps.Challenges.leetcodeExamples;
import java.util.*;
class IPRange {
    String startIP;
    String endIP;
    public IPRange(String startIP, String endIP) {
        this.startIP = startIP;
        this.endIP = endIP;
    }
}
//Your implementation here.
class IPFinder {
    public List<IPRange> ipRanges;
    public IPFinder(List<IPRange> ipRanges) {
        this.ipRanges = ipRanges;
    }
    public boolean isMalicious(String inputIP) {
        boolean malicious = false;
        for (IPRange ipRangeItem : this.ipRanges) {
            if (!checkIfInRange(ipRangeItem.startIP, ipRangeItem.endIP,inputIP)) malicious = true;
            else malicious = false;
        }
        return malicious;
    }
    public boolean checkIfInRange(String startIP, String endIP, String ip) {
        int[] startIPInInts = splitIP(startIP);
        int[] endIPInInts = splitIP(endIP);
        int[] ipInInts = splitIP(ip);

        boolean flag = false;
        for (int i = 0; i < startIPInInts.length; i++) {
            if (between(ipInInts[i],startIPInInts[i], endIPInInts[i]) ) flag = true;
            else flag = false;
        }
        return flag;
    }
    public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
        return (i >= minValueInclusive && i <= maxValueInclusive);
    }
    public int[] splitIP(String ipString){
        String[] strs = ipString.split("\\.");
        int[] res = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            res[i] = Integer.parseInt(strs[i]);
        }
        return res;
    }

}
public class IpRangeProblem {
        public static void main(String[] args) {
            IPFinder ipFinder = new IPFinder(getInputRanges());
            System.out.println("isMalicious: " + ipFinder.isMalicious("13.32.24.257"));
        }
        private static List<IPRange> getInputRanges() {
            List<IPRange> ipRanges = new ArrayList<>();
            ipRanges.add(new IPRange("13.32.0.0", "13.33.255.256"));
            ipRanges.add(new IPRange("54.240.196.0", "54.240.196.255"));
            return Collections.unmodifiableList(ipRanges);
        }
}

