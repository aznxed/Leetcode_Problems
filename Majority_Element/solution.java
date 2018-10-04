public class solution{

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        
        for(int a = 0; a < len; a++){
            if(map.containsKey(nums[a])){
                int count = map.get(nums[a]) + 1;
                if(count > len/2){
                    return nums[a];
                }
                map.put(nums[a], count);
            }
        }

        return -1;

    }

    public static void main(String[] args){
        int nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}