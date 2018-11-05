package easy;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestCommonPrefix {

    /*Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".
    Example 1:
    Input: ["flower","flow","flight"]
    Output: "fl"
    Example 2:
    Input: ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
    Note:
    All given inputs are in lowercase letters a-z.*/

    public String longestCommonPrefix(String[] strs) {
        String result="";
        if (strs.length==0){
            return result;
        }
        Set<Character> characters=new LinkedHashSet<>();
        int minStr=strs[0].length();
        for (int i=0; i<strs.length; i++){
            if (strs[i].length()<minStr){
                minStr=strs[i].length();
            }
        }

        StringBuilder sb=new StringBuilder(result);
        end:for (int i=0; i<minStr; i++){
            for (int j=0; j<strs.length; j++){
                characters.add(strs[j].charAt(i));
            }
            if (characters.size()>1) break end;
            if (characters.size()==1){
                sb.append(strs[0].charAt(i));
            }
            characters.clear();
        }
        return sb.toString();
    }

}
