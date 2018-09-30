import java.util.HashMap;
import java.util.Map;
import java.lang.Math;

public class solution{

    //Use a sliding window
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int ans = 0;

        Map<Character, Integer> map = new HashMap<>();
        for(int window_start = 0, window_end = 0; window_end < len; window_end++){
            if(map.containsKey(s.charAt(window_end))){
                window_start = Math.max(map.get(s.charAt(window_end)), window_start) ;
                
            }
            ans = Math.max(ans, window_end - window_start + 1);
            map.put(s.charAt(window_end), window_end + 1);
            
        }
        return ans;
    }

    public static void main(String[] args){
        String s = "abba";
        System.out.println(lengthOfLongestSubstring(s));
    }
}