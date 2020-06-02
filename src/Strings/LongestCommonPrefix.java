package Strings;

import java.util.ArrayList;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(ArrayList<String> A) {
        
        int pointer =0;
        for(int j=0;j<A.get(0).length();j++) {
            for(int i=1; i<A.size();i++) {
                if(pointer < A.get(i).length() && A.get(0).charAt(pointer) == A.get(i).charAt(pointer)) {
                
                }else {
                    return A.get(0).substring(0, pointer);
                }
            }
            pointer++;
        }
        return A.get(0).substring(0, pointer);
    }

}
