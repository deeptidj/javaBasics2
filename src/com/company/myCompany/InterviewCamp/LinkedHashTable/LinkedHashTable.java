package com.company.myCompany.InterviewCamp.LinkedHashTable;

public class LinkedHashTable {
    /*
    LL have O(n) look up time.
    Hashtable has not order
    Linked Hashtable solves these problesms.

    Lookup O(n)
    LRU - Least Recently Used cache problem.
     5 ints => 5 1 2 3 4
     users reads in 6 and we need to put it in the cache => lets say that 3 is the Least used and put the new values in its place.
     We can use timestamps along with the ints.
     Caveat => O(n) => Array then we have to go through the time stamps and pick the one that was least used.
     hence keep them in an order such that what ever is used, we put that on top of the list. Like 1 if used, put it on top
     3 -> 2 -> 4 -> 5 -> 1

      Time complexity for both reads and writes is O(1).



     */


}
