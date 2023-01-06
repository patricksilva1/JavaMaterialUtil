
class Solution {
    public String reverseVowels(String s) {
        
        String vowels = "aAeEiIoOuU";
        
        if (s.length()==0){ return s; }
       
        char[] word = s.toCharArray();
        int last = s.length()-1;
        int begin = 0, end = last;
        char tmp;

        while (begin < end){
            
            while (begin < last && vowels.indexOf(word[begin])<0){
                begin++;
            }
            while (end > 0 && vowels.indexOf(word[end])<0){
                end--;
            }
            if (begin < end){
                tmp = word[begin];
                word[begin] = word[end];
                word[end] = tmp;
                begin++;
                end--;
            }

        }
        
        return new String(word);
    }
}