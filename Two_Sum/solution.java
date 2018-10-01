import java.util.HashMap;
import java.util.Map;

public class solution{

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;

        for(int a = 0; a < len; a++){
            int complement = target - nums[a];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), a};
            }
            map.put(nums[a], a);
        }

        return null;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,5};
        int[] ans = twoSum(nums, 6);
        if(ans != null){
            System.out.println(ans[0] + " " + ans[1]);
        }
        else{
            System.out.println("No pair");
        }
    }
}