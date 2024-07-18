/**
 * SpongeCase
 */
public class SpongeCase {

    public static void main(String[] args) {

        String str = "SpOnGeCaSe";
        System.out.println(isSpongeCase(str));
        
    }
    public static boolean isSpongeCase(String str) {

        char[] c = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            c[i] = str.charAt(i);
        }

        int countLower=0, countUpper=0;
        for(int i=0; i<c.length; i++){
            if(i%2 == 0 && c.length % 2 == 0)
            {
                Character.isUpperCase(c[i]);
                countUpper++;
            }
            else if(i%2 != 0 && c.length % 2 == 0)
            {
                Character.isLowerCase(c[i]);
                countLower++;
            }
            
            
        }
        if(Character.isLowerCase(c[0])){
            return false;
        }
        else if(countUpper + countLower == c.length){
            return true;
        }
        else return false;

    }
}