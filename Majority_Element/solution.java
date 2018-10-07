import java.util.HashMap;
import java.util.Map;

public class solution{

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        
        if(len == 1){
            return nums[0];
        }

        for(int a = 0; a < len; a++){
            if(map.containsKey(nums[a])){
                int count = map.get(nums[a]) + 1;
                if(count > len/2){
                    return nums[a];
                }
                map.put(nums[a], count);
            }
            else{
                map.put(nums[a],1);
            }
        }

        return -1;

    }

    public static void main(String[] args){
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}