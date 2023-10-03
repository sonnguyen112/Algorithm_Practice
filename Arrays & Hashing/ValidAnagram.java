import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map_s = new HashMap<>();        
        Map<Character, Integer> map_t = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            if (map_s.containsKey(s.charAt(i))){
                map_s.put(s.charAt(i), map_s.get(s.charAt(i)) + 1);
            }
            else{
                map_s.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++){
            if (map_t.containsKey(t.charAt(i))){
                map_t.put(t.charAt(i), map_t.get(t.charAt(i)) + 1);
            }
            else{
                map_t.put(t.charAt(i), 1);
            }
        }
        return map_s.equals(map_t);
    }
}
