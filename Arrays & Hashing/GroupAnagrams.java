import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<Map<Character, Integer>> countCharMaps = new ArrayList<>();

        for (int i = 0; i < strs.length; i++){
            countCharMaps.add(createCountCharMap(strs[i]));
        }
        System.out.println(countCharMaps);

        Map<Map<Character, Integer>, List<String>> groupAnagramsMap = new HashMap<>();
        for (int i = 0; i < countCharMaps.size(); i++){
            if (groupAnagramsMap.containsKey(countCharMaps.get(i))){
                groupAnagramsMap.get(countCharMaps.get(i)).add(strs[i]);
            }
            else{
                List<String> valGroupAnagramsMap = new ArrayList<>();
                valGroupAnagramsMap.add(strs[i]);
                groupAnagramsMap.put(countCharMaps.get(i), valGroupAnagramsMap);
            }
        }
        System.out.println(groupAnagramsMap);

        List<List<String>> res = new ArrayList<>();
        groupAnagramsMap.forEach((key, val)->res.add(val));
        return res;
    }

    private Map<Character, Integer> createCountCharMap(String string) {
        Map<Character, Integer> countCharMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++){
            if (countCharMap.containsKey(string.charAt(i))){
                countCharMap.put(string.charAt(i), countCharMap.get(string.charAt(i)) + 1);
            }
            else{
                countCharMap.put(string.charAt(i), 1);
            }
        }
        return countCharMap;
    }

    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(solution.groupAnagrams(strs));

        String[] strs1 = {""};
        System.out.println(solution.groupAnagrams(strs1));
    }
}
