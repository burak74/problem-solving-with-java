import java.util.ArrayList;
import java.util.Collections;

public class CreateLargestNumber {
    public static void main(String[] args) {
        findLargest(8314);

    }
    public static int findLargest(int num) {
        int newNumber=0;
        ArrayList<Integer> nums = new ArrayList<>();
        while(num>0){

            nums.add(num%10);
            num /= 10;

        }

        Collections.sort(nums);

        
        for(int i=nums.size(); 0<i; i--){
            newNumber += nums.get(i-1)*(int)(Math.pow(10, i-1));
        }

        return newNumber;
    }
}
