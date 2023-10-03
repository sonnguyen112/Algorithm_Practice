import java.util.HashSet;
import java.util.Iterator;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            hashSet.add(nums[i]);
        }
        // System.out.println(hashSet);
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++){
            if (hashSet.contains(nums[i] - 1) == false){
                int length = 1;
                while (hashSet.contains(nums[i] + length)){
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;   
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(solution.longestConsecutive(nums));
    }
}
