package threads;

import java.util.Random;

public class Util {
    public static boolean isPrime(int n) {
        if (n<2 || n % 2 ==0 ) return  false;
        if (n==2 ) return true;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return  false;
            }
        }
        return true;
    }

    public static int[] generateArray(int arrayLength) {
        Random rand = new Random();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i]  =rand.nextInt(1000);
        }
        return arr;
    }

}
