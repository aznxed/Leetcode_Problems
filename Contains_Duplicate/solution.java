import java.util.HashSet;
import java.util.Set; 
import java.util.Arrays;
import java.util.stream.Collectors;

public class solution{

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));  
        return set.size() < nums.length;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3};
        System.out.println(containsDuplicate(nums));
    }
}