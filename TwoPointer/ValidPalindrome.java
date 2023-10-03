public class ValidPalindrome{
    public boolean isPalindrome(String s) {
        String sPost = s.replaceAll("\\s|[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(sPost);
        int pter1 = 0;
        int pter2 = sPost.length()-1;
        while (pter1 <= pter2){
            if (sPost.charAt(pter1) != sPost.charAt(pter2)) return false;
            pter1++;
            pter2--;
        }
        return true;   
    }

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(solution.isPalindrome(s));
    }
}