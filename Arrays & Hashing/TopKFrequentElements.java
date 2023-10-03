import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countIntMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (countIntMap.containsKey(nums[i])){
                countIntMap.put(nums[i], countIntMap.get(nums[i]) + 1);
            }
            else{
                countIntMap.put(nums[i], 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(countIntMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

            @Override
            public int compare(Entry<Integer, Integer> arg0, Entry<Integer, Integer> arg1) {
                return -(arg0.getValue().compareTo(arg1.getValue()));
            }

        });
        // System.out.println(list);
        int[] res = new int[k];
        for (int i = 0; i < k; i++){
            res[i] = list.get(i).getKey();
            // System.out.println(res[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        TopKFrequentElements solution = new TopKFrequentElements();
        int nums[] = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(solution.topKFrequent(nums, k));
    }
}
