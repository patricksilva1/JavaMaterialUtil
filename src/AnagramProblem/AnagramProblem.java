/*
 * 242. Valid Anagram - But I'm using String to CharArray than Array sort
 * This is Hitting on LeetCode: 
 * Runtime: 3 ms, Beats 94.10%
 * Memory: 42.7 MB, Beats 84,26%
 * 
 *
 import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;

        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
  
        Arrays.sort(ss);
        Arrays.sort(tt);

        for(int i = 0; i < ss.length; ++i){
            if(ss[i] != tt[i]) return false;
        }

        return true;
    }
}
 * 
 */

package AnagramProblem;

import java.util.Arrays;

public class AnagramProblem {

    public boolean solve(char[] s1, char[] s2) {
        if (s1.length != s2.length)
            return false;

        // Sort the letters of the strings
        // O(NlogN) this is the "bottleneck" of the algorithm
        Arrays.sort(s1);
        Arrays.sort(s2);

        // Consider all the letters one by one and we have to
        // Compare these letters
        // O(N) but the overall running time is 0(NlogN) + O(N) = O(NlogN)
        for (int i = 0; i < s1.length; ++i) {
            if (s1[i] != s2[i])
                return false;
        }

        return true;
    }
}