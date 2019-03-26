package pod;

public class Solution {

    public static void main(String[] args){

        Substring s1 = new Substring("abbaac","bacbacba");
        s1.longestSubstring();
        s1.printSub(s1.getSubOne().length()-1,s1.getSubTwo().length()-1);

    }
}
