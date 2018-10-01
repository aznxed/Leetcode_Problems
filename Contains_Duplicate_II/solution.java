import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.stream.Collectors;

public class solution{

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;

        for(int a = 0; a < len; a++){
            if(map.containsKey(nums[a])){
                if(a - map.get(nums[a]) <= k){
                    return true;
                }
            }
            map.put(nums[a], a);
        }

        return false;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        System.out.println(containsNearbyDuplicate(nums,3));
    }
}