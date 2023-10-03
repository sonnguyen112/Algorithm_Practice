public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++){
            res[i] = 1;
        }
        for (int i = 1; i < res.length; i++){
            res[i] = res[i - 1] * nums[i-1];
        }
        System.out.println(res);
        int postfixCur = 1;
        for (int i = res.length - 2; i >= 0; i--){
            postfixCur = postfixCur * nums[i + 1];
            res[i] = res[i] * postfixCur;
        }
        System.out.println(res);
        return res;   
    }

    public static void main(String[] args) {
        ProductofArrayExceptSelf solution = new ProductofArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        System.out.println(solution.productExceptSelf(nums));
    }
}
