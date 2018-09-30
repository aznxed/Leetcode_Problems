import java.lang.Math;

public class solution{
    public static int maxArea(int[] height) {
        int start = 0, end = height.length-1;
        double area = Math.min(height[start], height[end]) * (end - start);

        while(start < end){
            area = Math.max(area, Math.min(height[start], height[end]) * (end - start));
            if(height[start] < height[end]){
                start++;
            }
            else{
                end--;
            }
        }

        return (int)area;
    }

    public static void main(String[] args){
        int[] heights = {1, 2, 3 , 4};
        System.out.println(Integer.toString(maxArea(heights)));
    }
}