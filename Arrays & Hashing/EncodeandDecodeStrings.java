import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// Idea: Save lengh of each word and # before each word, example: ["AAA", "BB", "CCC#C"] -> "3#AAA2#BB5#CCC#C" 
public class EncodeandDecodeStrings {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        // write your code here
        String encodeStr = "";
        for (int i = 0; i < strs.size(); i++){
            encodeStr = encodeStr + String.valueOf(strs.get(i).length()) + '#' + strs.get(i);
        }
        return encodeStr;
    }

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        // write your code here
        List<String> decodeList = new ArrayList<>();
        int index = 0;
        while (index < str.length()){
            String lenStr = "";
            while (str.charAt(index) != '#'){
                lenStr += str.charAt(index);
                index++;
            }
            index++;
            int lenStrInt = Integer.parseInt(lenStr);
            String decodeStr = "";
            for (int i = 0; i < lenStrInt; i++){
                decodeStr += str.charAt(index);
                index++;
            }
            decodeList.add(decodeStr);
        }
        return decodeList;
    }
    public static void main(String[] args) {
        EncodeandDecodeStrings solution = new EncodeandDecodeStrings();
        List<String> inputs = Arrays.asList(new String[]{"lint##","#code","#love9#","22#2##you", ""});
        String encode = solution.encode(inputs);
        System.out.println(encode);
        List<String> decode = solution.decode(encode);
        System.out.println(decode);
    }
}
