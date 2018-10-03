public class solution{
    public boolean isUgly(int num) {
        if (num <= 0) return false;
        if (num == 1) return true;
        //2
        while (num % 2 == 0){
            num>>=1;
        }
        
        //3
        while (num % 3 == 0){
            num/=3;
        }
        
        //5
        while (num % 5 == 0){
            num/=5;
        }
        
        return num == 1;
    }

    public static void main(String[] args){

    }
}