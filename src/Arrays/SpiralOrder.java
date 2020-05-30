package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        
        int M = A.size(); //Number of Arrays in M x N matrix
        int N = A.get(0).size(); // Length of each Array
        int dir = 0; // Start position
        int top = 0;
        int bottom = M-1;
        int left = 0;
        int right = N-1;
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        while(top <= bottom && left <= right) {
            
            if(dir == 0) {
                
                for(int i  = left; i <= right ; i++) {
                    result.add(A.get(top).get(i));
                }
                dir = 1;
                top++;
            }else if (dir == 1) {
                for(int j = top; j <= bottom; j++) {
                    result.add((A.get(j)).get(right));
                }
                right--;
                dir = 2;
            } else if( dir == 2) {
                for(int k = right; k >= left; k--) {
                    result.add(A.get(bottom).get(k));
                }
                dir = 3;
                bottom--;
            }else {
                for(int l = bottom; l >= top;l--) {
                    result.add(A.get(l).get(left));
                }
                dir = 0;
                left++;
            }
        }
        return result;
    }
}