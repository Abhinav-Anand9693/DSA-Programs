import java.util.Arrays;

public class DSA3 {
    public static int[] twoSum(int[] nums, int target) {
     for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                return new int[] {i,j};
            }
        }
     } 
     return null;
        
    }
    public static void main(String [] args){
        int [] nums={2,7,11,11};
        int target=9;
         int[] result = twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));//Arrays.toString(result) Java mein isliye use hota hai kyunki agar aap directly
                                                                   // array ko print karne ki koshish karte ho (jaise System.out.println(result);), to Java array ke contents nahi, 
                                                                  //uska memory reference print karta hai.
    }
}

/* 
import java.util.Arrays;

public class DSA3 {

    // Instance method (non-static)
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // OOP style: create object of the class
        DSA3 obj = new DSA3();
        int[] result = obj.twoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}
*/


    

