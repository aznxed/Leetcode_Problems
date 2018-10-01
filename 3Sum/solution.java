import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class solution{

    public static List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> solutions = new ArrayList<List<Integer>>();

        for(int a = 0; a < len-1; a++){
            int target = 0 - nums[a];
            int[] subarray = Arrays.copyOfRange(nums, a+1, len-1);
            List<List<Integer>> pairs = twoSum(subarray, target);
            if(!pairs.isEmpty()){
                int num_pairs = pairs.size();
                for(int b = 0; b < num_pairs; b++){
                    pairs.get(b).add(nums[a]);
                    solutions.add(pairs.get(b));
                }
                
            }
        }

        return solutions;
    }

    public static List<List<Integer>> twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> solutions = new ArrayList<List<Integer>>();
        int len = nums.length;

        for(int a = 0; a < len; a++){
            int complement = target - nums[a];
            if(map.containsKey(complement)){
                List<Integer> pair = new ArrayList<Integer>();
                pair.add(complement);
                pair.add(nums[a]);
                solutions.add(pair);
            }
            map.put(nums[a], a);
        }
        return solutions;
    }

    public static void main(String[] args){
        int[] nums = {-1, 0, 1, 2, -1,b -4};
        List<List<Integer>> solutions = threeSum(nums);
        if(!solutions.isEmpty()){
            System.out.println(solutions.get(0) + " " + solutions.get(1));
        }
        else{
            System.out.println("No pair");
        }
    }
}