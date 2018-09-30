import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.lang.Math;

public class solution{

    public static String longestPalindrome(String s) {
        if(s.equals("") || s == null){
            return "";
        }
        if(s.length() == 1){
            return s;
        }

        Map<Character, ArrayList<Integer>> map = new HashMap<>();
        int string_length = s.length();
        int start = 0, end = 0;

        for(int a = 0; a+(end - start) < string_length ; a++){
            if(map.containsKey(s.charAt(a))){
                ArrayList<Integer> occurances = map.get(s.charAt(a));

                for(int occurance : occurances){
                    int midpoint = (occurance + a)/2;
                    int len1 = expandAroundCenter(s, midpoint, midpoint);
                    int len2 = expandAroundCenter(s, midpoint, midpoint + 1);

                    if(len > end - start + 1){
                        System.out.println(len);
                        if(len % 2 == 0){
                            start = midpoint - len/2 + 1;
                            end = midpoint + len/2;
                        }
                        else{
                            start = midpoint - len/2;
                            end = midpoint + len/2 + 1;
                        }
                        System.out.println("Midpoint: " + Integer.toString(midpoint));
                        System.out.println("Start: " + Integer.toString(start));
                        System.out.println("End: " + Integer.toString(end));
                        System.out.println(s.substring(start, end+1));

                    }
                }
                
                occurances.add(a); 
                map.put(s.charAt(a), occurances);
            }

            else{
                ArrayList<Integer> occurances = new ArrayList<>();
                occurances.add(a); 
                map.put(s.charAt(a), occurances);
            }
            
        }

        return s.substring(start, end+1);
    }

    public static int expandAroundCenter(String s, int left, int right){
        int start_index = left, end_index = right;
        int string_length = s.length();

        while(start_index >= 0 && end_index < string_length && s.charAt(start_index) == s.charAt(end_index)){
            start_index--;
            end_index++;
        }

        return end_index - start_index - 1; 
    }

    public static void main(String[] args){
    
    }
}