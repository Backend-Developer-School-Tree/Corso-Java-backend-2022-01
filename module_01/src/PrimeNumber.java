public class PrimeNumber {
    public static void main(String[] args) {
        int number = 2;
        System.out.println(isPrime(number));
        number = 17;
        System.out.println(isPrime(number));
        number = 631;
        System.out.println(isPrime(number));
        number = 634;
        System.out.println(!isPrime(number));
        number = 999;
        System.out.println(!isPrime(number));
        number = 997;
        System.out.println(isPrime(number));
    }

    private static boolean isPrime(int number) {
        if (number == 0 || number == 1) return false;
        for (int i = 2; i <= number/2; i++)
            if (number % i == 0)
                return false;
        return true;
    }
}