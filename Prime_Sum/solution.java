import java.util.HashSet;
import java.util.Set;
import java.util.BitSet;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;;

public class solution {

    public static Set<Integer> sieveOfEratothenes(int n){
        Set<Integer> primes = new HashSet<Integer>();
        BitSet notPrime = new BitSet(n+1);
        
        for(int a = 2; a < n+1; a++){
            if(!notPrime.get(a)){
                for(int b = 2; a*b <= n; b++){
                    notPrime.set(a*b); 
                }
            }
        }

        for(int a = 1; a < n+1; a++){
            if(!notPrime.get(a)){
                primes.add(a);
            }
        }

        return new TreeSet<Integer>(primes);
    }


    public static ArrayList<Integer> primesum(int num) {
        Set<Integer> primes = sieveOfEratothenes(num);
        Integer[] arrayPrimes = primes.toArray(new Integer[0]);
        int len = primes.size();

        for(int a = 0; a < len/2 + 1; a++){
            int complement = num - arrayPrimes[a];
            if(primes.contains(complement)){
                return new ArrayList<Integer>(Arrays.asList(arrayPrimes[a], complement));
            }
        }

        return null;
    }

    public static void main(String[] args){
        System.out.println(primesum(10));
    }
}
