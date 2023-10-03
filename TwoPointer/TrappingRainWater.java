import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TrappingRainWater {
    public int trap(int[] height) {
        // int maxHeight = 0;
        // for (int i = 0; i < height.length; i++){
        //     if (height[i] > maxHeight){
        //         maxHeight = height[i];
        //     }
        // }
        // // System.out.println(maxHeight);
        // int res = 0;
        // for (int curHeight = maxHeight; curHeight >= 1; curHeight--){
        //     // System.out.println(curHeight);
        //     List<Integer> temp = new ArrayList<>();
        //     for (int i = 0; i < height.length; i++){
        //         if (height[i] >= curHeight){
        //             temp.add(i);
        //         }
        //     }
        //     // System.out.println(temp);
        //     if (temp.size() > 1){
        //         for (int i = 1; i < temp.size(); i++){
        //             res += temp.get(i) - temp.get(i-1) - 1;
        //         }
        //     }
        // }
        // return res;
        int pter1 = 0;
        int pter2 = height.length - 1;
        int maxLeft = height[pter1];
        int maxRight = height[pter2];
        int res = 0;
        while (pter1 <= pter2){
            if (maxLeft < maxRight){
                res += Math.max(0, maxLeft - height[pter1]);
                pter1++;
                if (height[pter1 - 1] > maxLeft) maxLeft = height[pter1 - 1];
            }
            else{
                res += Math.max(0, maxRight - height[pter2]);
                pter2--;
                if (height[pter2 + 1] > maxRight) maxRight = height[pter2 + 1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {4,2,0,3,2,5};
        System.out.println(solution.trap(height));
    }
}
