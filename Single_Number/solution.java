public class solution {

    //a) XOR of a number with itself is 0.
    //b) XOR of a number with 0 is number itself.
    public int singleNumber(int[] nums) {
        int ans = nums[0]; 
        int len = nums.length;
        for (int i = 1; i < len; i++) 
            ans = ans ^ nums[i]; 
      
        return ans; 
    }
}