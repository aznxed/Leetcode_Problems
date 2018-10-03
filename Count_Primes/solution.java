public class solution{

    public static int countPrimes(int n) {
        boolean primes[] = new boolean[n+1];
        int count = 0;
        for(int a = 2; a < n; a++){
            if(!primes[a]){
                count++;
                for(int b = 2; a*b <= n; b++){
                    primes[a*b] = true; 
                }
            }
        }

        for(int a = n/2; a < n; a++){
            if(!primes[a]){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        System.out.println(countPrimes(1));
    }
}