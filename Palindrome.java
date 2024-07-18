public class Palindrome {
    public static void main(String[] args) {

        String str ="racecar";
        System.out.println(isPalindrome(str));
        
    }
    public static boolean isPalindrome(String str) {
        char[] strArray = str.toCharArray();
        String reverseString="";

        for(int i=strArray.length-1; i>=0; i--){
            reverseString+=strArray[i];
        }

        if(reverseString.equals(str)) return true;
        else return false;
    }
}
