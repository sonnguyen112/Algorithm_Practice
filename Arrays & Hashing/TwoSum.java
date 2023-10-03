import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> resArrayList = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                if (i != map.get(target - nums[i])){
                    resArrayList.add(i);
                    resArrayList.add(map.get(target - nums[i]));
                    break;
                }
            }
        }

        int[] res = new int[resArrayList.size()];
        for (int i = 0; i < res.length; i++){
            res[i] =  resArrayList.get(i);
        }
        return res;
    }
}
