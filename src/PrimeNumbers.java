public class PrimeNumbers {

    private static void Prime(int limit) {
        int count = 0;

        for (int i = 2; i <= limit; i++)
            if(isPrime(i)) {
                    System.out.print(i + " ");
                    count += 1;

                    if((count % 10) == 0)
                        System.out.println();
            }

        if((count % 10) != 0)
            System.out.println();
    }

    private static boolean isPrime(int value) {
        if (value <= 1)
            return false;
        else
            return !isDivisible(value, 2);
    }

    private static boolean isDivisible(int x, int k) {
        if (k >= x) // a "guard"
            return false;
        else if (x % k == 0) // "%" means "remainder"
            return true;
        else // if (k < x && x % k != 0)
            return isDivisible(x, k+1);
    }

    public static void main(String[] args) {
        Prime(250);
    }
}
