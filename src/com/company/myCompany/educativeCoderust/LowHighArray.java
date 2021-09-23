package com.company.myCompany.educativeCoderust;
class Pair {
    int a;
    int b;
    Pair() {
        this.a =0;
        this.b=0;
    }

    Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

}
public class LowHighArray {

    public static void main(String[] args) {
        int[] arr = new int[] {1,1,1,2,2,2,3,3,3,4,4};
        Pair p = findLowHigh(arr,2);
        System.out.println(p.a);
        System.out.println(p.b);
    }
    static Pair findLowHigh(int[] arr, int key) {
        Pair p = new Pair();
        p = binSearch(arr, 0,arr.length-1,key);

        return p;
    }
    static Pair binSearch(int[] arr, int left, int right, int key){
        Pair p;
        int mid = (left + right)/2;
        if (arr[mid] == key) {
            int low = mid-1; int hi = mid+1;
            while (low >= 0 && hi <= (arr.length-1)) {
                if (arr[low] == key) {low--;}
                if (arr[hi] == key) {hi++;}
            }
            p = new Pair(low, hi);
        }
        if (key < arr[mid]) {
            right = mid -1 ;
        } else {
            left = mid + 1;
        }
        return new Pair(-1,-1);
    }
}
