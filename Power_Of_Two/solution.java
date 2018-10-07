public class solution{

    public boolean isPowerofTwo(int n){
        if (n < 1){
            return false;
        }
        while ((n & 1) == 0){
            n >>= 1;
        }
        return n == 1;
    }

    public static void main(String[] args){

    }
}