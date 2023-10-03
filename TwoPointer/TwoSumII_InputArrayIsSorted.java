import java.util.Arrays;

public class TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = {0,0};
        int pter1 = 0;
        int pter2 = numbers.length - 1;
        while (pter1 < pter2){
            if (numbers[pter1] + numbers[pter2] == target){
                res[0] = pter1 + 1;
                res[1] = pter2 + 1;
                break;
            }
            else if (numbers[pter1] + numbers[pter2] < target){
                pter1++;
            }
            else{
                pter2--;
            }
        }
        return res;   
    }

    public static void main(String[] args) {
        TwoSumII_InputArrayIsSorted solution = new TwoSumII_InputArrayIsSorted();
        int[] numbers = {2,7,11,15};
        System.out.println(Arrays.toString(solution.twoSum(numbers, 9)));
    }
}
